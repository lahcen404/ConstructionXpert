package com.TaskResource.Servlet;

import com.TaskResource.DAO.TaskResourceDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/AssignResourceServlet")
public class AssignResourceServlet extends HttpServlet {
    private TaskResourceDAO taskResourceDAO = new TaskResourceDAO();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int taskId = Integer.parseInt(request.getParameter("taskId"));
        int resourceId = Integer.parseInt(request.getParameter("resourceId"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));

        boolean success = taskResourceDAO.assignResourceToTask(taskId, resourceId, quantity);
        if (success) {
            request.getSession().setAttribute("success", "Resource assigned successfully!");
        } else {
            request.getSession().setAttribute("error", "Failed to assign resource !! ");
        }

        response.sendRedirect("TaskServlet");
    }
}