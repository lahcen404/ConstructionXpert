package com.Ressource.Servlet;

import com.Ressource.DAO.RessourceDAO;
import com.Ressource.Model.Ressource;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/ResourceServlet")
public class RessourceServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        RessourceDAO ressourceDAO = new RessourceDAO();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String type = req.getParameter("type");
        int quantity = Integer.parseInt(req.getParameter("quantity"));

        if(name.isEmpty() || type.isEmpty()) {

            resp.sendRedirect("resourceCreate.jsp");
        }else{
        Ressource ressource = new Ressource(name, type, quantity);

        RessourceDAO ressourceDAO = new RessourceDAO();
        ressourceDAO.createRessource(ressource);
            resp.sendRedirect("ResourceServlet");
        }
}
}
