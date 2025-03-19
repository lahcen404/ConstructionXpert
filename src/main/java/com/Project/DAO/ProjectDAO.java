package com.Project.DAO;

import com.Project.Model.Project;
import com.Util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProjectDAO {
    public void createProject(Project project) {
        try(Connection con = DBConnection.getConnection()){
            String query = "insert into projects (name,description,start_date,end_date,budget) values (?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, project.getName());
            ps.setString(2, project.getDescription());
            ps.setString(3, project.getStart_date());
            ps.setString(4, project.getEnd_date());
            ps.setDouble(5, project.getBudget());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean updateProject(Project project) {
        try(Connection con = DBConnection.getConnection()) {
            PreparedStatement stmnt = con.prepareStatement("update projects set name=?,description=?,start_date=?,end_date=?,budget=? where id=?");
            stmnt.setString(1, project.getName());
            stmnt.setString(2, project.getDescription());
            stmnt.setString(3, project.getStart_date());
            stmnt.setString(4, project.getEnd_date());
            stmnt.setDouble(5, project.getBudget());
            stmnt.setInt(6, project.getId());
            return stmnt.executeUpdate() > 0;
        } catch (SQLException e) {
         e.printStackTrace();
        }
        return false;
    }

    public List<Project> getAllProjects() {
        List<Project> projects = new ArrayList<>();
        String query = "select * from projects";
        try(Connection con = DBConnection.getConnection()) {
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                String start_date = rs.getString("start_date");
                String end_date = rs.getString("end_date");
                double budget = rs.getDouble("budget");

                Project project = new Project(id,name, description, start_date, end_date, budget);
                projects.add(project);

            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(projects);
        }return projects;
    }

    public Project getProjectById(int id) throws SQLException {
        Project project = null;
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement("select * from projects where id=?")) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    project = new Project();
                    project.setId(rs.getInt("id"));
                    project.setName(rs.getString("name"));
                    project.setDescription(rs.getString("description"));
                    project.setStart_date(rs.getString("start_date"));
                    project.setEnd_date(rs.getString("end_date"));
                    project.setBudget(rs.getDouble("budget"));

                }
            }
        }catch (SQLException e) {
        e.printStackTrace();
        }
        return project;
    }

    public boolean deleteProject(int id) {
        try(Connection con = DBConnection.getConnection();
            PreparedStatement stmnt = con.prepareStatement("delete from projects where id=?")){
            stmnt.setInt(1,id);;
            return    stmnt.executeUpdate() > 0;
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    }
