package com.Ressource.DAO;

import com.Util.DBConnection;
import com.Ressource.Model.Ressource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RessourceDAO {

    public void createRessource(Ressource resource) {
        try(Connection con = DBConnection.getConnection()) {
            String query = "insert into resources (name,type,quantity) values(?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1,resource.getName());
            ps.setString(2,resource.getType());
            ps.setInt(3,resource.getQuantity());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
