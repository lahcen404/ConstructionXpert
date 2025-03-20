package com.Ressource.Servlet;

import com.Project.DAO.ProjectDAO;
import com.Project.Model.Project;
import com.Ressource.DAO.RessourceDAO;
import com.Ressource.Model.Ressource;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/ResourceServlet")
public class RessourceServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        RessourceDAO ressourceDAO = new RessourceDAO();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            RessourceDAO ressourceDAO = new RessourceDAO();
            List<Ressource> ressources = ressourceDAO.getAllResources();
            req.setAttribute("resources", ressources);
            RequestDispatcher dispatcher = req.getRequestDispatcher("resourceList.jsp");

            dispatcher.forward(req, resp);

        } catch (Exception e) {
            e.printStackTrace();

        }
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
