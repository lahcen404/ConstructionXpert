package com.Task.Servlet;


import com.Task.DAO.TaskDAO;
import com.Task.Model.Task;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


@WebServlet("/updateTaskServlet")
public class updateTaskServlet extends HttpServlet {

    private TaskDAO taskDAO = new TaskDAO();
    @Override
    public void init() throws ServletException {
        taskDAO = new TaskDAO();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        int id = Integer.parseInt(req.getParameter("id"));
        int project_id = Integer.parseInt(req.getParameter("project_id"));
        String description = req.getParameter("description");
        String start_date = req.getParameter("start_date");
        String end_date = req.getParameter("end_date");

        Task task = new Task(id, project_id, description, start_date, end_date);
        boolean isUpdated = taskDAO.updateTask(task);
            if (isUpdated) {
                resp.sendRedirect("TaskServlet");
            }else{
                resp.sendRedirect("updateTask.jsp?id=" +id);
            }
    }
}
