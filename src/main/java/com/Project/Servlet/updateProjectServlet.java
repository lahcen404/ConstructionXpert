package com.Project.Servlet;

import com.Project.DAO.ProjectDAO;
import com.Project.Model.Project;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/updateProjectServlet")
public class updateProjectServlet extends HttpServlet {
   private ProjectDAO projectDAO = new ProjectDAO();
    @Override
    public void init() throws ServletException {
        super.init();
        projectDAO = new ProjectDAO();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String description = req.getParameter("description");
        String start_date = req.getParameter("start_date");
        String end_date = req.getParameter("end_date");
        double budget = Double.parseDouble(req.getParameter("budget"));

        Project project = new Project(id, name, description, start_date, end_date, budget);
        boolean isUpdated = projectDAO.updateProject(project);
        if (isUpdated) {
            System.out.println("Received id: " + req.getParameter("id"));
            resp.sendRedirect("ProjectServlet");
        } else {
            resp.sendRedirect("updateProject.jsp?id=" +id);
        }


    }}
