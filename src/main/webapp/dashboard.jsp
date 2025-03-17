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
</head>
<body class="bg-[#F9F7F1] text-[#1A3C34]">
<nav class="bg-[#2D6A4F] text-white p-4 shadow-lg">
    <div class="container mx-auto flex justify-between items-center">
        <h1 class="text-2xl font-bold">ConstructionXpert <i class="fas fa-hammer"></i></h1>
        <a href="login?logout=true" class="hover:text-[#A8D5BA] transition duration-200">
            <i class="fas fa-sign-out-alt"></i> Logout
        </a>
    </div>
</nav>
<div class="container mx-auto p-6">
    <h2 class="text-3xl font-bold text-[#2D6A4F] mb-6">Dashboard</h2>
    <div class="grid grid-cols-1 md:grid-cols-3 gap-6">
        <a href="project?action=list" class="bg-[#F4A261] text-white p-6 rounded-lg shadow-md hover:bg-[#A8D5BA] hover:text-[#1A3C34] transition duration-300 transform hover:scale-105">
            <i class="fas fa-project-diagram text-4xl mb-2"></i>
            <h3 class="text-xl font-semibold">Manage Projects</h3>
        </a>
        <a href="task?projectId=1" class="bg-[#F4A261] text-white p-6 rounded-lg shadow-md hover:bg-[#A8D5BA] hover:text-[#1A3C34] transition duration-300 transform hover:scale-105">
            <i class="fas fa-tasks text-4xl mb-2"></i>
            <h3 class="text-xl font-semibold">Manage Tasks</h3>
        </a>
        <a href="resource" class="bg-[#F4A261] text-white p-6 rounded-lg shadow-md hover:bg-[#A8D5BA] hover:text-[#1A3C34] transition duration-300 transform hover:scale-105">
            <i class="fas fa-tools text-4xl mb-2"></i>
            <h3 class="text-xl font-semibold">Manage Resources</h3>
        </a>
    </div>
</div>
</body>
</html>