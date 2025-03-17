<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>ConstructionXpert - Login</title>
  <script src="https://cdn.tailwindcss.com"></script>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
  <style>
    body {
      background: url('https://images.pexels.com/photos/159306/construction-site-build-construction-work-159306.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2') no-repeat center center fixed;
      background-size: cover;
      backdrop-filter: blur(2px);
    }
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
      <a href="index.jsp" class="block md:inline-block hover:text-[#A8D5BA] transition duration-200 sm:text-sm py-3 md:py-0 px-4 rounded-lg hover:bg-[#A8D5BA]/20">Dashboard</a>
      <a href="project?action=list" class="block md:inline-block hover:text-[#A8D5BA] transition duration-200 sm:text-sm py-3 md:py-0 px-4 rounded-lg hover:bg-[#A8D5BA]/20">Projects</a>
      <a href="task?projectId=1" class="block md:inline-block hover:text-[#A8D5BA] transition duration-200 sm:text-sm py-3 md:py-0 px-4 rounded-lg hover:bg-[#A8D5BA]/20">Tasks</a>
      <a href="resource" class="block md:inline-block hover:text-[#A8D5BA] transition duration-200 sm:text-sm py-3 md:py-0 px-4 rounded-lg hover:bg-[#A8D5BA]/20">Resources</a>
      <a href="login?logout=true" class="block md:inline-block hover:text-[#A8D5BA] transition duration-200 sm:text-sm py-3 md:py-0 px-4 rounded-lg hover:bg-[#A8D5BA]/20">
        <i class="fas fa-sign-out-alt"></i> Logout
      </a>
    </div>
  </div>
</nav>
<!-- Login Content -->
<div class="container mx-auto p-6 mt-6">
  <div class="max-w-md mx-auto bg-white rounded-lg shadow-md p-6">
    <h2 class="text-3xl font-bold text-[#2D6A4F] mb-6 text-center sm:text-2xl">
      <i class="fas fa-user-shield"></i> Login
    </h2>
    <% if (request.getAttribute("error") != null) { %>
    <div class="bg-[#F4A261]/10 text-[#F4A261] p-3 rounded mb-6 text-center sm:text-sm">
      <%= request.getAttribute("error") %>
    </div>
    <% } %>
    <form action="login" method="post" class="space-y-6">
      <div>
        <label for="username" class="block font-bold sm:text-sm">Username</label>
        <input type="text" id="username" name="username" required class="w-full p-4 sm:p-3 border rounded-lg focus:outline-none focus:ring-2 focus:ring-[#F4A261]">
      </div>
      <div>
        <label for="password" class="block font-bold sm:text-sm">Password</label>
        <input type="password" id="password" name="password" required class="w-full p-4 sm:p-3 border rounded-lg focus:outline-none focus:ring-2 focus:ring-[#F4A261]">
      </div>
      <button type="submit" class="w-full bg-[#F4A261] text-white p-4 sm:p-3 rounded-lg hover:bg-[#A8D5BA] hover:text-[#1A3C34] transition duration-300 sm:text-sm">
        <i class="fas fa-sign-in-alt"></i> Login
      </button>
    </form>
    <div class="mt-4 flex flex-col sm:flex-row gap-4 justify-between">
      <a href="index.jsp" class="bg-[#2D6A4F] text-white p-4 sm:p-3 rounded-lg hover:bg-[#A8D5BA] hover:text-[#1A3C34] transition duration-300 text-center sm:text-sm">
        <i class="fas fa-home"></i> Back to Home
      </a>
      <a href="register.jsp" class="bg-[#F4A261] text-white p-4 sm:p-3 rounded-lg hover:bg-[#A8D5BA] hover:text-[#1A3C34] transition duration-300 text-center sm:text-sm">
        <i class="fas fa-user-plus"></i> Register
      </a>
    </div>
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