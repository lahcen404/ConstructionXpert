<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ConstructionXpert - Add Project</title>
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
        .error {
            color: #f33b3b;
            font-size: 0.875rem;
            margin-top: 0.25rem;
            display: none;
        }
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
            <a href="login?logout=true" class="block md:inline-block hover:text-[#A8D5BA] transition duration-200 sm:text-sm py-3 md:py-0 px-4 rounded-lg hover:bg-[#A8D5BA]/20">
                <i class="fas fa-sign-out-alt"></i> Logout
            </a>
        </div>
    </div>
</nav>
<!-- Add Project Content -->
<div class="container mx-auto p-6 mt-6">
    <div class="max-w-md mx-auto bg-white rounded-lg shadow-md p-6">
        <h2 class="text-3xl font-bold text-[#2D6A4F] mb-6 text-center sm:text-2xl">
            <i class="fas fa-plus-square"></i> Add New Project
        </h2>
        <% if (request.getAttribute("error") != null) { %>
        <div class="bg-[#F4A261]/10 text-[#F4A261] p-3 rounded mb-6 text-center sm:text-sm">
            <%= request.getAttribute("error") %>
        </div>
        <% } %>
        <% if (request.getAttribute("success") != null) { %>
        <div class="bg-[#A8D5BA]/10 text-[#1A3C34] p-3 rounded mb-6 text-center sm:text-sm">
            <%= request.getAttribute("success") %>
        </div>
        <% } %>
        <form action="ProjectServlet" method="post" class="space-y-6" >
            <input type="hidden" name="action" value="create">
            <div>
                <label for="name" class="block font-bold sm:text-sm">Project Name</label>
                <input type="text" id="name" name="name"  class="w-full p-4 sm:p-3 border rounded-lg focus:outline-none focus:ring-2 focus:ring-[#F4A261]" placeholder="Enter project name">
                <div id="nameError" class="error"></div>
            </div>
            <div>
                <label for="description" class="block font-bold sm:text-sm">Description</label>
                <textarea id="description" name="description" class="w-full p-4 sm:p-3 border rounded-lg focus:outline-none focus:ring-2 focus:ring-[#F4A261]" placeholder="Enter project description"></textarea>
                <div id="descriptionError" class="error"></div>
            </div>
            <div>
                <label for="start_date" class="block font-bold sm:text-sm">Start Date</label>
                <input type="date" id="start_date" name="start_date" class="w-full p-4 sm:p-3 border rounded-lg focus:outline-none focus:ring-2 focus:ring-[#F4A261]">
                <div id="startDateError" class="error"></div>
            </div>
            <div>
                <label for="end_date" class="block font-bold sm:text-sm">End Date</label>
                <input type="date" id="end_date" name="end_date" class="w-full p-4 sm:p-3 border rounded-lg focus:outline-none focus:ring-2 focus:ring-[#F4A261]">
                <div id="endDateError" class="error"></div>
            </div>
            <div>
                <label for="budget" class="block font-bold sm:text-sm">Budget</label>
                <input type="number" id="budget" name="budget" step="0.01"  class="w-full p-4 sm:p-3 border rounded-lg focus:outline-none focus:ring-2 focus:ring-[#F4A261]" placeholder="Enter budget amount">
                <div id="budgetError" class="error"></div>
            </div>
            <button type="submit" class="w-full bg-[#F4A261] text-white p-4 sm:p-3 rounded-lg hover:bg-[#A8D5BA] hover:text-[#1A3C34] transition duration-300 sm:text-sm">
                <i class="fas fa-save"></i> Save Project
            </button>
        </form>
        <div class="mt-4 text-center">
            <a href="ProjectServlet" class="bg-[#2D6A4F] text-white p-4 sm:p-3 rounded-lg hover:bg-[#A8D5BA] hover:text-[#1A3C34] transition duration-300 sm:text-sm">
                <i class="fas fa-arrow-left"></i> Back to Projects
            </a>
        </div>
    </div>
</div>

</body>
</html>