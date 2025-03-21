package com.Ressource.Servlet;

import com.Ressource.DAO.RessourceDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


@WebServlet("/DeleteResourceServlet")
public class deleteResourceServlet extends HttpServlet {
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
        boolean isDeleted =  ressourceDAO.deleteResource(id);
        if(isDeleted){
            resp.sendRedirect("ResourceServlet");
        }else{
            resp.sendRedirect("ResourceServlet");
        }


    }
}
