package com.Project.Servlet;

import com.Project.DAO.ProjectDAO;
import com.Project.Model.Project;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/ProjectServlet")
public class ProjectServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        ProjectDAO projectDAO = new ProjectDAO();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            ProjectDAO projectDAO = new ProjectDAO();
            List<Project> projects = projectDAO.getAllProjects();
            req.setAttribute("projects", projects);
            RequestDispatcher dispatcher = req.getRequestDispatcher("projectList.jsp");

            dispatcher.forward(req, resp);

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String description = req.getParameter("description");
        String start_date = req.getParameter("start_date");
        String end_date = req.getParameter("end_date");
        double budget = (req.getParameter("budget") == null && !req.getParameter("budget").isEmpty())
                            ? Double.parseDouble(req.getParameter("budget"))
                            : 0.0;
        

        if (name.isEmpty() || description.isEmpty() || start_date.isEmpty() || end_date.isEmpty()) {
            resp.sendRedirect("projectCreate.jsp");
        } else {

           Project project = new Project(name, description, start_date, end_date, budget);
            ProjectDAO projectDAO = new ProjectDAO();

           projectDAO.createProject(project);
            resp.sendRedirect("ProjectServlet");

        }

    }
}
