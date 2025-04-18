<%@ page import="com.Ressource.Model.Ressource" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ConstructionXpert - Resources</title>
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
<!-- Resources Content -->
<div class="container mx-auto p-6 mt-6">
    <div class="flex justify-between items-center mb-6">
        <h2 class="text-3xl font-bold text-[#2D6A4F] sm:text-2xl">Resources</h2>
        <a href="resourceCreate.jsp" class="bg-[#F4A261] text-white px-6 py-3 sm:px-3 sm:py-2 rounded-lg shadow-md hover:bg-[#A8D5BA] hover:text-[#1A3C34] transition duration-300 sm:text-sm">
            <i class="fas fa-plus"></i> Add Resource
        </a>
    </div>
    <div class="overflow-x-auto">
        <table class="w-full bg-white rounded-lg shadow-md table-mobile-card">
            <thead class="bg-[#2D6A4F] text-white">
            <tr>
                <th class="px-4 py-3 text-left font-bold sm:text-sm">ID</th>
                <th class="px-4 py-3 text-left font-bold sm:text-sm">Name</th>
                <th class="px-4 py-3 text-left font-bold sm:text-sm">Type</th>
                <th class="px-4 py-3 text-left font-bold sm:text-sm">Quantity</th>
                <th class="px-4 py-3 text-left font-bold sm:text-sm">Actions</th>
            </tr>
            </thead>
            <tbody>
            <%
                List<Ressource> resources = (List<Ressource>) request.getAttribute("resources");
                if (resources != null) {
                    for (Ressource ressource : resources) {
            %>
            <tr class="border-b hover:bg-[#A8D5BA]/20 transition duration-300">
                <td class="px-4 py-3 sm:text-sm" data-label="ID"><%= ressource.getId() %></td>
                <td class="px-4 py-3 sm:text-sm" data-label="Name"><%= ressource.getName() %></td>
                <td class="px-4 py-3 sm:text-sm" data-label="Type"><%= ressource.getType() %></td>
                <td class="px-4 py-3 sm:text-sm" data-label="Quantity"><%= ressource.getQuantity() %></td>
                <td class="px-4 py-3 sm:text-sm flex items-center gap-3" data-label="Actions">
                    <a href="updateResource.jsp?id=<%=ressource.getId()%>" class="text-[#F4A261] hover:text-[#2D6A4F]"><i class="fas fa-edit"></i></a>
                    <form action="DeleteResourceServlet" method="post">
                        <input type="hidden" name="id" value="<%=ressource.getId()%>">
                        <button type="submit" class="text-[#2D6A4F] hover:text-[#F4A261]"><i class="fas fa-trash"></i>
                        </button>
                    </form>                    <a href="ResourceServlet?action=updateQuantity&id=<%=ressource.getId()%>" class="text-[#F4A261] hover:text-[#2D6A4F]"><i class="fas fa-sync"></i></a>
                </td>
            </tr>
            <%
                }
            } else {
            %>
            <tr>
                <td colspan="5" class="text-center py-4 sm:text-sm">No resources available.</td>
            </tr>
            <%
                }
            %>
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