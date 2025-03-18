<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ConstructionXpert - Dashboard</title>
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
            <a href="dashboard" class="block md:inline-block hover:text-[#A8D5BA] transition duration-200 sm:text-sm py-3 md:py-0 px-4 rounded-lg hover:bg-[#A8D5BA]/20">Dashboard</a>
            <a href="ProjectServlet" class="block md:inline-block hover:text-[#A8D5BA] transition duration-200 sm:text-sm py-3 md:py-0 px-4 rounded-lg hover:bg-[#A8D5BA]/20">Projects</a>
            <a href="task?projectId=1" class="block md:inline-block hover:text-[#A8D5BA] transition duration-200 sm:text-sm py-3 md:py-0 px-4 rounded-lg hover:bg-[#A8D5BA]/20">Tasks</a>
            <a href="resource" class="block md:inline-block hover:text-[#A8D5BA] transition duration-200 sm:text-sm py-3 md:py-0 px-4 rounded-lg hover:bg-[#A8D5BA]/20">Resources</a>
            <a href="login?logout=true" class="block md:inline-block hover:text-[#A8D5BA] transition duration-200 sm:text-sm py-3 md:py-0 px-4 rounded-lg hover:bg-[#A8D5BA]/20">
                <i class="fas fa-sign-out-alt"></i> Logout
            </a>
        </div>
    </div>
</nav>
<!-- Dashboard Content -->
<div class="container mx-auto p-6 mt-6">
    <h2 class="text-3xl font-bold text-[#2D6A4F] mb-6 sm:text-2xl">Dashboard</h2>
    <div class="grid grid-cols-1 sm:grid-cols-2 md:grid-cols-3 gap-6">
        <a href="ProjectServlet" class="bg-[#F4A261] text-white p-6 rounded-lg shadow-md hover:bg-[#A8D5BA] hover:text-[#1A3C34] transition duration-300 transform hover:scale-105 sm:p-4">
            <i class="fas fa-project-diagram text-4xl mb-2 sm:text-3xl"></i>
            <h3 class="text-xl font-semibold sm:text-lg">Manage Projects</h3>
        </a>
        <a href="taskList.jsp" class="bg-[#F4A261] text-white p-6 rounded-lg shadow-md hover:bg-[#A8D5BA] hover:text-[#1A3C34] transition duration-300 transform hover:scale-105 sm:p-4">
            <i class="fas fa-tasks text-4xl mb-2 sm:text-3xl"></i>
            <h3 class="text-xl font-semibold sm:text-lg">Manage Tasks</h3>
        </a>
        <a href="resourceList.jsp" class="bg-[#F4A261] text-white p-6 rounded-lg shadow-md hover:bg-[#A8D5BA] hover:text-[#1A3C34] transition duration-300 transform hover:scale-105 sm:p-4">
            <i class="fas fa-tools text-4xl mb-2 sm:text-3xl"></i>
            <h3 class="text-xl font-semibold sm:text-lg">Manage Resources</h3>
        </a>
    </div>
    <img src="https://images.pexels.com/photos/439416/pexels-photo-439416.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2" alt="Construction Overview" class="mt-6 w-full h-64 object-cover rounded-lg shadow-md">
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