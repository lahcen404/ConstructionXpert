package com.Ressource.DAO;

import com.Project.Model.Project;
import com.Task.Model.Task;
import com.Util.DBConnection;
import com.Ressource.Model.Ressource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

    public boolean updateRessource(Ressource resource) {
        try(Connection con = DBConnection.getConnection()){
            String query = "update resources set name=?,type=?,quantity=? where id=?";
            PreparedStatement stmnt = con.prepareStatement(query);
            stmnt.setString(1,resource.getName());
            stmnt.setString(2,resource.getType());
            stmnt.setInt(3,resource.getQuantity());
            stmnt.setInt(4,resource.getId());

            return stmnt.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteResource(int id) {
        try(Connection con = DBConnection.getConnection();
            PreparedStatement stmnt = con.prepareStatement("delete from resources where id=?")){
            stmnt.setInt(1,id);;
            return    stmnt.executeUpdate() > 0;
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<Ressource> getAllResources() {
        List<Ressource> ressources = new ArrayList<>();
        String query = "select * from resources";
        try(Connection con = DBConnection.getConnection()) {
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String type = rs.getString("type");
                int quantity = rs.getInt("quantity");


                Ressource ressource = new Ressource(id,name, type, quantity);
                ressources.add(ressource);

            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(ressources);
        }return ressources;
    }

    public Ressource getResourceById(int id) {

            Ressource ressource = null;
            try (Connection con = DBConnection.getConnection();
                 PreparedStatement ps = con.prepareStatement("select * from resources where id=?")) {
                ps.setInt(1, id);
                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        ressource = new Ressource();
                        ressource.setId(rs.getInt("id"));
                        ressource.setName(rs.getString("name"));
                        ressource.setType(rs.getString("type"));
                        ressource.setQuantity(rs.getInt("quantity"));
                    }
                }
            }catch (SQLException e) {
                e.printStackTrace();
            }
            return ressource;
        }

}
