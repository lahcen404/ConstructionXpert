package com.Project.DAO;

import com.Project.Model.Project;
import com.Util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
}
