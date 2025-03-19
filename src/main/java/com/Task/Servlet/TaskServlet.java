package com.Task.Servlet;

import com.Project.DAO.ProjectDAO;
import com.Project.Model.Project;
import com.Task.DAO.TaskDAO;
import com.Task.Model.Task;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/TaskServlet")

public class TaskServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        TaskDAO taskDAO = new TaskDAO();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            TaskDAO taskDAO = new TaskDAO();
            List<Task> tasks = taskDAO.getAllTasks();
            req.setAttribute("tasks", tasks);
            RequestDispatcher dispatcher = req.getRequestDispatcher("taskList.jsp");

            dispatcher.forward(req, resp);

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       int projectID = Integer.parseInt(req.getParameter("project_id"));
        String description = req.getParameter("description");
        String start_date = req.getParameter("start_date");
        String end_date = req.getParameter("end_date");

        Task task = new Task(projectID,description,start_date,end_date);
        TaskDAO taskDAO = new TaskDAO();
        taskDAO.createTask(task);
        resp.sendRedirect("TaskServlet");
    }
}
