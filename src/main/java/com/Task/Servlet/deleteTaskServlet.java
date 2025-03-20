package com.Task.Servlet;

import com.Task.DAO.TaskDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/DeleteTaskServlet")

public class deleteTaskServlet extends HttpServlet {

    TaskDAO taskDAO = new TaskDAO();
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
        taskDAO.deleteTask(id);
        resp.sendRedirect("TaskServlet");
    }
}
