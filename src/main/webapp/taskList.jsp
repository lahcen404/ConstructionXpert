<%@ page import="com.Task.DAO.TaskDAO" %>
<%@ page import="java.util.List" %>
<%@ page import="com.Task.Model.Task" %>
<%@ page import="com.Ressource.DAO.RessourceDAO" %>
<%@ page import="com.Ressource.Model.Ressource" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ConstructionXpert - Tasks</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
    <style>
        #menu { transition: all 0.3s ease-in-out; transform: translateY(-100%); }
        #menu.active { transform: translateY(0); }
        #menu a { transition: background-color 0.3s ease, color 0.3s ease; }
        #menu a:hover { background-color: #A8D5BA; color: #1A3C34; }
        @media (max-width: 640px) {
            .table-mobile-card { display: block; }
            .table-mobile-card thead { display: none; }
            .table-mobile-card tbody, .table-mobile-card tr { display: block; }
            .table-mobile-card tr { margin-bottom: 1rem; border: 1px solid #e5e7eb; border-radius: 0.5rem; padding: 1rem; background-color: #fff; box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1); }
            .table-mobile-card td { display: flex; justify-content: space-between; padding: 0.5rem 0; border: none; }
            .table-mobile-card td:before { content: attr(data-label); font-weight: bold; color: #1A3C34; margin-right: 0.5rem; }
            .table-mobile-card td:last-child { justify-content: center; gap: 0.5rem; }
        }
        .modal { display: none; position: fixed; top: 0; left: 0; width: 100%; height: 100%; background: rgba(0,0,0,0.5); z-index: 20; }
        .modal-content { background: white; margin: 15% auto; padding: 20px; border-radius: 8px; width: 90%; max-width: 400px; }
        .modal.active { display: block; }
    </style>
</head>
<body class="bg-[#F9F7F1] text-[#1A3C34] min-h-screen">
<nav class="bg-[#2D6A4F] text-white p-4 shadow-lg">
    <div class="container mx-auto flex justify-between items-center">
        <h1 class="text-2xl font-bold sm:text-xl mb-4"> <i class="fas fa-hammer"></i> ConstructionXpert </h1>
        <div class="md:hidden">
            <button id="menu-toggle" class="text-white focus:outline-none">
                <i class="fas fa-bars text-2xl"></i>
            </button>
        </div>
        <div id="menu" class="hidden mt-6 md:flex md:space-x-4 flex-col md:flex-row absolute md:static top-16 left-0 w-full md:w-auto bg-[#2D6A4F] md:bg-transparent p-4 md:p-0 z-10">
            <a href="index.jsp" class="block md:inline-block hover:text-[#A8D5BA] transition duration-200 sm:text-sm py-3 md:py-0 px-4 rounded-lg hover:bg-[#A8D5BA]/20">Dashboard</a>
            <a href="ProjectServlet" class="block md:inline-block hover:text-[#A8D5BA] transition duration-200 sm:text-sm py-3 md:py-0 px-4 rounded-lg hover:bg-[#A8D5BA]/20">Projects</a>
            <a href="TaskServlet" class="block md:inline-block hover:text-[#A8D5BA] transition duration-200 sm:text-sm py-3 md:py-0 px-4 rounded-lg hover:bg-[#A8D5BA]/20">Tasks</a>
            <a href="ResourceServlet" class="block md:inline-block hover:text-[#A8D5BA] transition duration-200 sm:text-sm py-3 md:py-0 px-4 rounded-lg hover:bg-[#A8D5BA]/20">Resources</a>
            <a href="Logout" class="block md:inline-block hover:text-[#A8D5BA] transition duration-200 sm:text-sm py-3 md:py-0 px-4 rounded-lg hover:bg-[#A8D5BA]/20">
                <i class="fas fa-sign-out-alt"></i> Logout
            </a>
        </div>
    </div>
</nav>
<div class="container mx-auto p-6 mt-6">
    <% if (session.getAttribute("success") != null) { %>
    <div class="bg-[#A8D5BA]/10 text-[#1A3C34] p-3 rounded mb-6 text-center sm:text-sm">
        <%= session.getAttribute("success") %>
        <% session.removeAttribute("success"); %>
    </div>
    <% } %>
    <% if (session.getAttribute("error") != null) { %>
    <div class="bg-[#F4A261]/10 text-[#F4A261] p-3 rounded mb-6 text-center sm:text-sm">
        <%= session.getAttribute("error") %>
        <% session.removeAttribute("error"); %>
    </div>
    <% } %>
    <div class="flex justify-between items-center mb-6">
        <h2 class="text-3xl font-bold text-[#2D6A4F] sm:text-2xl">Task List</h2>
        <a href="taskCreate.jsp" class="bg-[#F4A261] text-white p-3 rounded-lg shadow-md hover:bg-[#A8D5BA] hover:text-[#1A3C34] transition duration-300 sm:text-sm">
            <i class="fas fa-plus"></i> Add Task
        </a>
    </div>
    <div class="overflow-x-auto">
        <table class="w-full bg-white rounded-lg shadow-md table-mobile-card">
            <thead class="bg-[#2D6A4F] text-white">
            <tr>
                <th class="p-3 sm:p-2 sm:text-sm text-center">ID</th>
                <th class="p-3 sm:p-2 sm:text-sm text-center">ID Project</th>
                <th class="p-3 sm:p-2 sm:text-sm text-center">Description</th>
                <th class="p-3 sm:p-2 sm:text-sm text-center">Start Date</th>
                <th class="p-3 sm:p-2 sm:text-sm text-center">End Date</th>
                <th class="p-3 sm:p-2 sm:text-sm text-center">Actions</th>
            </tr>
            </thead>
            <tbody>
            <%
                List<Task> tasks = (List<Task>) request.getAttribute("tasks");
                if (tasks != null) {
                    for (Task task : tasks) {
            %>
            <tr class="border-b border-gray-200 hover:bg-[#A8D5BA]/20 transition duration-300">
                <td class="p-3 sm:p-2 sm:text-sm text-center" data-label="ID"><%=task.getId()%></td>
                <td class="p-3 sm:p-2 sm:text-sm text-center" data-label="project_id"><%=task.getProjectId()%></td>
                <td class="p-3 sm:p-2 sm:text-sm text-center" data-label="Description"><%=task.getDescription()%></td>
                <td class="p-3 sm:p-2 sm:text-sm text-center" data-label="Start Date"><%=task.getStart_date()%></td>
                <td class="p-3 sm:p-2 sm:text-sm text-center" data-label="End Date"><%=task.getEnd_date()%></td>
                <td class="p-3 sm:p-2 sm:text-sm flex justify-center items-center space-x-2" data-label="Actions">
                    <a href="updateTask.jsp?id=<%=task.getId()%>" class="text-[#F4A261] hover:text-[#2D6A4F]">
                        <i class="fas fa-edit"></i>
                    </a>
                    <form action="DeleteTaskServlet" method="post" class="inline">
                        <input type="hidden" name="id" value="<%=task.getId()%>">
                        <button type="submit" class="text-[#2D6A4F] hover:text-[#F4A261]">
                            <i class="fas fa-trash"></i>
                        </button>
                    </form>
                    <button onclick="openResourceModal(<%=task.getId()%>)" class="text-[#F4A261] hover:text-[#2D6A4F]">
                        <i class="fas fa-plus-circle"></i> Add Resource
                    </button>
                </td>
            </tr>
            <%
                }
            } else {
            %>
            <tr>
                <td colspan="6" class="p-3 text-center text-gray-500">No tasks available.</td>
            </tr>
            <% } %>
            </tbody>
        </table>
    </div>
</div>

<!-- Resource Assignment Modal -->
<div id="resourceModal" class="modal">
    <div class="modal-content">
        <h3 class="text-xl font-bold text-[#2D6A4F] mb-4">Add Resource to Task</h3>
        <form action="AssignResourceServlet" method="post">
            <input type="hidden" name="taskId" id="taskId">
            <div class="mb-4">
                <label for="resourceId" class="block font-bold sm:text-sm">Select Resource</label>
                <select id="resourceId" name="resourceId" required class="w-full p-2 border rounded-lg">
                    <option value="">Select a resource</option>
                    <%
                        RessourceDAO resourceDAO = new RessourceDAO();
                        List<Ressource> resources = resourceDAO.getAllResources();
                        for (Ressource resource : resources) {
                    %>
                    <option value="<%=resource.getId()%>"><%=resource.getName()%> (Qty: <%=resource.getQuantity()%>)</option>
                    <% } %>
                </select>
            </div>
            <div class="mb-4">
                <label for="quantity" class="block font-bold sm:text-sm">Quantity</label>
                <input type="number" id="quantity" name="quantity" min="1" required class="w-full p-2 border rounded-lg" placeholder="Enter quantity">
            </div>
            <div class="flex justify-end space-x-2">
                <button type="button" onclick="closeResourceModal()" class="bg-gray-300 text-[#1A3C34] p-2 rounded-lg hover:bg-gray-400">Cancel</button>
                <button type="submit" class="bg-[#F4A261] text-white p-2 rounded-lg hover:bg-[#A8D5BA] hover:text-[#1A3C34]">Assign</button>
            </div>
        </form>
    </div>
</div>

<script>
    document.getElementById('menu-toggle').addEventListener('click', function() {
        const menu = document.getElementById('menu');
        menu.classList.toggle('hidden');
        menu.classList.toggle('active');
    });

    function openResourceModal(taskId) {
        document.getElementById('taskId').value = taskId;
        document.getElementById('resourceModal').classList.add('active');
    }

    function closeResourceModal() {
        document.getElementById('resourceModal').classList.remove('active');
    }
</script>
</body>
</html>