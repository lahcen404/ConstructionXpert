package com.Task.DAO;

import com.Project.Model.Project;
import com.Task.Model.Task;
import com.Util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TaskDAO {
    public void createTask(Task task) {
        try(Connection con = DBConnection.getConnection()){
            String query = "insert into tasks (project_id,description,start_date,end_date) values (?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, task.getProjectId());
            ps.setString(2, task.getDescription());
            ps.setString(3, task.getStart_date());
            ps.setString(4, task.getEnd_date());

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean updateTask(Task task) {
        try(Connection con = DBConnection.getConnection()){
            PreparedStatement ps = con.prepareStatement("update tasks SET project_id=?,description=?,start_date=?,end_date=? where id=?");
            ps.setInt(1,task.getProjectId());
            ps.setString(2,task.getDescription());
            ps.setString(3,task.getStart_date());
            ps.setString(4, task.getEnd_date());
            ps.setInt(5, task.getId());
            return ps.executeUpdate() > 0;


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public Task getTaskById(int id) throws SQLException {
        Task task = null;
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement("select * from tasks where id=?")) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    task = new Task();
                    task.setId(rs.getInt("id"));
                    task.setProjectId(rs.getInt("project_id"));
                    task.setDescription(rs.getString("description"));
                    task.setStart_date(rs.getString("start_date"));
                    task.setEnd_date(rs.getString("end_date"));


                }
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return task;
    }

    public boolean deleteTask(int id) {
        try(Connection con = DBConnection.getConnection();
            PreparedStatement stmnt = con.prepareStatement("delete from tasks where id=?")){
            stmnt.setInt(1,id);;
            return    stmnt.executeUpdate() > 0;
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }


    public List<Task> getAllTasks() {
        List<Task> tasks = new ArrayList<>();
        String query = "select * from tasks";
        try(Connection con = DBConnection.getConnection()) {
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                int id = rs.getInt("id");
                int id_project = rs.getInt("project_id");
                String description = rs.getString("description");
                String start_date = rs.getString("start_date");
                String end_date = rs.getString("end_date");


                Task task = new Task(id,id_project, description, start_date, end_date);
                tasks.add(task);

            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(tasks);
        }return tasks;
    }
}
