<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<%@ page import="com.Project.Model.Project" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ConstructionXpert - Projects</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
    <style>
        #menu {
            transition: all 0.3s ease-in-out;
            transform: translateY(-100%);
        }
        #menu.active {
            transform: translateY(0);
        }
        #menu a {
            transition: background-color 0.3s ease, color 0.3s ease;
        }
        #menu a:hover {
            background-color: #A8D5BA;
            color: #1A3C34;
        }
        /* Mobile Card Layout for Tables */
        @media (max-width: 640px) {
            .table-mobile-card {
                display: block;
            }
            .table-mobile-card thead {
                display: none;
            }
            .table-mobile-card tbody, .table-mobile-card tr {
                display: block;
            }
            .table-mobile-card tr {
                margin-bottom: 1rem;
                border: 1px solid #e5e7eb;
                border-radius: 0.5rem;
                padding: 1rem;
                background-color: #fff;
                box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
            }
            .table-mobile-card td {
                display: flex;
                justify-content: space-between;
                padding: 0.5rem 0;
                border: none;
            }
            .table-mobile-card td:before {
                content: attr(data-label);
                font-weight: bold;
                color: #1A3C34;
                margin-right: 0.5rem;
            }
            .table-mobile-card td:last-child {
                justify-content: center;
                gap: 0.5rem;
            }
        }
    </style>
</head>
<body class="bg-[#F9F7F1] text-[#1A3C34] min-h-screen">
<nav class="bg-[#2D6A4F] text-white p-4 shadow-lg">
    <div class="container mx-auto flex justify-between items-center">
        <h1 class="text-2xl font-bold sm:text-xl mb-4"> <i class="fas fa-hammer"></i>  ConstructionXpert </h1>
        <div class="md:hidden">
            <button id="menu-toggle" class="text-white focus:outline-none">
                <i class="fas fa-bars text-2xl"></i>
            </button>
        </div>
        <div id="menu" class="hidden mt-6 md:flex md:space-x-4 flex-col md:flex-row absolute md:static top-16 left-0 w-full md:w-auto bg-[#2D6A4F] md:bg-transparent p-4 md:p-0 z-10">
            <a href="index.jsp" class="block md:inline-block hover:text-[#A8D5BA] transition duration-200 sm:text-sm py-3 md:py-0 px-4 rounded-lg hover:bg-[#A8D5BA]/20">Dashboard</a>
            <a href="ProjectServlet" class="block md:inline-block hover:text-[#A8D5BA] transition duration-200 sm:text-sm py-3 md:py-0 px-4 rounded-lg hover:bg-[#A8D5BA]/20">Projects</a>
            <a href="taskList.jsp" class="block md:inline-block hover:text-[#A8D5BA] transition duration-200 sm:text-sm py-3 md:py-0 px-4 rounded-lg hover:bg-[#A8D5BA]/20">Tasks</a>
            <a href="resourceList.jsp" class="block md:inline-block hover:text-[#A8D5BA] transition duration-200 sm:text-sm py-3 md:py-0 px-4 rounded-lg hover:bg-[#A8D5BA]/20">Resources</a>
            <a href="Logout" class="block md:inline-block hover:text-[#A8D5BA] transition duration-200 sm:text-sm py-3 md:py-0 px-4 rounded-lg hover:bg-[#A8D5BA]/20">
                <i class="fas fa-sign-out-alt"></i> Logout
            </a>
        </div>
    </div>
</nav>
<div class="container mx-auto p-6 mt-6">
    <div class="flex justify-between items-center mb-6">
        <h2 class="text-3xl font-bold text-[#2D6A4F] sm:text-2xl">Projects</h2>
        <a href="projectCreate.jsp" class="bg-[#F4A261] text-white px-4 py-2 rounded-lg shadow-md hover:bg-[#A8D5BA] hover:text-[#1A3C34] transition duration-300 sm:text-sm sm:px-3 sm:py-1">
            <i class="fas fa-plus"></i> Add Project
        </a>
    </div>
    <div class="overflow-x-auto">
        <table class="w-full bg-white rounded-lg shadow-md table-mobile-card">
            <thead class="bg-[#2D6A4F] text-white">
            <tr>
                <th class="p-6 sm:p-3 sm:text-sm">ID</th>
                <th class="p-6 sm:p-3 sm:text-sm">Name</th>
                <th class="p-6 sm:p-3 sm:text-sm">Description</th>
                <th class="p-6 sm:p-3 sm:text-sm">Start Date</th>
                <th class="p-6 sm:p-3 sm:text-sm">End Date</th>
                <th class="p-6 sm:p-3 sm:text-sm">Budget</th>
                <th class="p-6 sm:p-3 sm:text-sm">Actions</th>
            </tr>
            </thead>
            <tbody>
            <%

                List<Project> projects = (List<Project>) request.getAttribute("projects");
                for(Project project : projects){

            %>

                <tr class="border-b hover:bg-[#A8D5BA]/20 transition duration-300">
                    <td class="p-6 sm:p-3 sm:text-sm" data-label="ID"><%=project.getId()%></td>
                    <td class="p-6 sm:p-3 sm:text-sm" data-label="Name"><%=project.getName()%></td>
                    <td class="p-6 sm:p-3 sm:text-sm" data-label="Description"><%=project.getDescription()%></td>
                    <td class="p-6 sm:p-3 sm:text-sm" data-label="Start Date"><%=project.getStart_date()%></td>
                    <td class="p-6 sm:p-3 sm:text-sm" data-label="End Date"><%=project.getEnd_date()%></td>
                    <td class="p-6 sm:p-3 sm:text-sm" data-label="Budget"><%=project.getBudget()%></td>
                    <td class="p-6 sm:p-3 sm:text-sm" data-label="Actions">

                        <a href="updateProject.jsp?id=<%=project.getId()%>" class="text-[#F4A261] hover:text-[#2D6A4F] mr-6 sm:mr-2"><i class="fas fa-edit"></i></a>
                    <form action="DeleteProjectServlet" method="post">
                        <input type="hidden" name="id" value="<%=project.getId()%>">
                        <button type="submit" class="text-[#2D6A4F] hover:text-[#F4A261]"><i class="fas fa-trash"></i>
                        </button>
                    </form>
                    </td>
                </tr>
            <%  } %>
            </tbody>
        </table>
    </div>
</div>
<script>
    document.getElementById('menu-toggle').addEventListener('click', function() {
        const menu = document.getElementById('menu');
        menu.classList.toggle('hidden');
        menu.classList.toggle('active');
    });
</script>
</body>
</html>