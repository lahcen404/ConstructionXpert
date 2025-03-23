package com.TaskResource.DAO;

import com.TaskResource.Model.TaskResource;
import com.Util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class TaskResourceDAO {

    public boolean assignResourceToTask(int taskId, int resourceId, int assignedQuantity) {
        Connection con = null;
        try {
            con = DBConnection.getConnection();
            con.setAutoCommit(false);

            String updateResourceQuery = "UPDATE resources SET quantity = quantity - ? WHERE id = ? AND quantity >= ?";
            PreparedStatement updatePs = con.prepareStatement(updateResourceQuery);
            updatePs.setInt(1, assignedQuantity);
            updatePs.setInt(2, resourceId);
            updatePs.setInt(3, assignedQuantity);
            int rowsUpdated = updatePs.executeUpdate();


            String query = "INSERT INTO TaskResource (task_id, resource_id, assigned_quantity) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, taskId);
            ps.setInt(2, resourceId);
            ps.setInt(3, assignedQuantity);
            ps.executeUpdate();

            con.commit();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return false;
    }}