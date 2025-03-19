package com.Project.Servlet;

import com.Project.DAO.ProjectDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/DeleteProjectServlet")
public class deleteProjectServlet extends HttpServlet {

    ProjectDAO projectDAO = new ProjectDAO();
    @Override
    public void init() throws ServletException {
        super.init();
        projectDAO = new ProjectDAO();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        boolean isDeleted = projectDAO.deleteProject(id);
        if(isDeleted){
            resp.sendRedirect("ProjectServlet");
        }else {
            resp.sendRedirect("ProjectServlet");
        }
    }
}
