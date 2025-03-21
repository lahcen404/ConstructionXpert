package com.Ressource.Servlet;

import com.Ressource.DAO.RessourceDAO;
import com.Ressource.Model.Ressource;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


@WebServlet("/UpdateResourceServlet")
public class updateRessourceServlet extends HttpServlet {

    private RessourceDAO ressourceDAO = new RessourceDAO();

    @Override
    public void init() throws ServletException {
        ressourceDAO = new RessourceDAO();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String type = req.getParameter("type");
        int quantity = Integer.parseInt(req.getParameter("quantity"));

        Ressource ressource = new Ressource(id, name, type, quantity);
        boolean isUpdated = ressourceDAO.updateRessource(ressource);
        if (isUpdated) {
            resp.sendRedirect("ResourceServlet");
            System.out.println("Received id: " + req.getParameter("id"));

        }else{
            resp.sendRedirect("updateResource.jsp?id="+id);
        }
    }

}
