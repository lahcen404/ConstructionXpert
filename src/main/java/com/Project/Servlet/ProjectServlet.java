package com.Project.Servlet;

import com.Project.DAO.ProjectDAO;
import com.Project.Model.Project;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet("/ProjectServlet")
public class ProjectServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        ProjectDAO projectDAO = new ProjectDAO();

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String description = req.getParameter("description");
        String start_date = req.getParameter("start_date");
        String end_date = req.getParameter("end_date");
        Double budget = Double.valueOf(req.getParameter("budget"));

        Project project = new Project(name,description,start_date,end_date,budget);
        ProjectDAO projectDAO = new ProjectDAO();

        projectDAO.createProject(project);
        resp.sendRedirect("projectList.jsp");
    }


}
