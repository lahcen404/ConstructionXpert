/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.36
 * Generated at: 2025-03-22 15:20:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import com.Task.DAO.TaskDAO;
import java.util.List;
import com.Task.Model.Task;
import com.Ressource.DAO.RessourceDAO;
import com.Ressource.Model.Ressource;

public final class taskList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jakarta.servlet.jsp.jstl-3.0.1.jar", Long.valueOf(1740564824324L));
    _jspx_dependants.put("jar:file:/C:/Users/ENAA/.m2/repository/org/glassfish/web/jakarta.servlet.jsp.jstl/3.0.1/jakarta.servlet.jsp.jstl-3.0.1.jar!/META-INF/c.tld", Long.valueOf(1664449878000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(7);
    _jspx_imports_classes.add("com.Ressource.DAO.RessourceDAO");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.Ressource.Model.Ressource");
    _jspx_imports_classes.add("com.Task.Model.Task");
    _jspx_imports_classes.add("com.Task.DAO.TaskDAO");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>ConstructionXpert - Tasks</title>\r\n");
      out.write("    <script src=\"https://cdn.tailwindcss.com\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css\">\r\n");
      out.write("    <style>\r\n");
      out.write("        #menu { transition: all 0.3s ease-in-out; transform: translateY(-100%); }\r\n");
      out.write("        #menu.active { transform: translateY(0); }\r\n");
      out.write("        #menu a { transition: background-color 0.3s ease, color 0.3s ease; }\r\n");
      out.write("        #menu a:hover { background-color: #A8D5BA; color: #1A3C34; }\r\n");
      out.write("        @media (max-width: 640px) {\r\n");
      out.write("            .table-mobile-card { display: block; }\r\n");
      out.write("            .table-mobile-card thead { display: none; }\r\n");
      out.write("            .table-mobile-card tbody, .table-mobile-card tr { display: block; }\r\n");
      out.write("            .table-mobile-card tr { margin-bottom: 1rem; border: 1px solid #e5e7eb; border-radius: 0.5rem; padding: 1rem; background-color: #fff; box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1); }\r\n");
      out.write("            .table-mobile-card td { display: flex; justify-content: space-between; padding: 0.5rem 0; border: none; }\r\n");
      out.write("            .table-mobile-card td:before { content: attr(data-label); font-weight: bold; color: #1A3C34; margin-right: 0.5rem; }\r\n");
      out.write("            .table-mobile-card td:last-child { justify-content: center; gap: 0.5rem; }\r\n");
      out.write("        }\r\n");
      out.write("        .modal { display: none; position: fixed; top: 0; left: 0; width: 100%; height: 100%; background: rgba(0,0,0,0.5); z-index: 20; }\r\n");
      out.write("        .modal-content { background: white; margin: 15% auto; padding: 20px; border-radius: 8px; width: 90%; max-width: 400px; }\r\n");
      out.write("        .modal.active { display: block; }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"bg-[#F9F7F1] text-[#1A3C34] min-h-screen\">\r\n");
      out.write("<nav class=\"bg-[#2D6A4F] text-white p-4 shadow-lg\">\r\n");
      out.write("    <div class=\"container mx-auto flex justify-between items-center\">\r\n");
      out.write("        <h1 class=\"text-2xl font-bold sm:text-xl mb-4\"> <i class=\"fas fa-hammer\"></i> ConstructionXpert </h1>\r\n");
      out.write("        <div class=\"md:hidden\">\r\n");
      out.write("            <button id=\"menu-toggle\" class=\"text-white focus:outline-none\">\r\n");
      out.write("                <i class=\"fas fa-bars text-2xl\"></i>\r\n");
      out.write("            </button>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"menu\" class=\"hidden mt-6 md:flex md:space-x-4 flex-col md:flex-row absolute md:static top-16 left-0 w-full md:w-auto bg-[#2D6A4F] md:bg-transparent p-4 md:p-0 z-10\">\r\n");
      out.write("            <a href=\"index.jsp\" class=\"block md:inline-block hover:text-[#A8D5BA] transition duration-200 sm:text-sm py-3 md:py-0 px-4 rounded-lg hover:bg-[#A8D5BA]/20\">Dashboard</a>\r\n");
      out.write("            <a href=\"ProjectServlet\" class=\"block md:inline-block hover:text-[#A8D5BA] transition duration-200 sm:text-sm py-3 md:py-0 px-4 rounded-lg hover:bg-[#A8D5BA]/20\">Projects</a>\r\n");
      out.write("            <a href=\"TaskServlet\" class=\"block md:inline-block hover:text-[#A8D5BA] transition duration-200 sm:text-sm py-3 md:py-0 px-4 rounded-lg hover:bg-[#A8D5BA]/20\">Tasks</a>\r\n");
      out.write("            <a href=\"ResourceServlet\" class=\"block md:inline-block hover:text-[#A8D5BA] transition duration-200 sm:text-sm py-3 md:py-0 px-4 rounded-lg hover:bg-[#A8D5BA]/20\">Resources</a>\r\n");
      out.write("            <a href=\"Logout\" class=\"block md:inline-block hover:text-[#A8D5BA] transition duration-200 sm:text-sm py-3 md:py-0 px-4 rounded-lg hover:bg-[#A8D5BA]/20\">\r\n");
      out.write("                <i class=\"fas fa-sign-out-alt\"></i> Logout\r\n");
      out.write("            </a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
      out.write("<div class=\"container mx-auto p-6 mt-6\">\r\n");
      out.write("    ");
 if (session.getAttribute("success") != null) { 
      out.write("\r\n");
      out.write("    <div class=\"bg-[#A8D5BA]/10 text-[#1A3C34] p-3 rounded mb-6 text-center sm:text-sm\">\r\n");
      out.write("        ");
      out.print( session.getAttribute("success") );
      out.write("\r\n");
      out.write("        ");
 session.removeAttribute("success"); 
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    ");
 } 
      out.write("\r\n");
      out.write("    ");
 if (session.getAttribute("error") != null) { 
      out.write("\r\n");
      out.write("    <div class=\"bg-[#F4A261]/10 text-[#F4A261] p-3 rounded mb-6 text-center sm:text-sm\">\r\n");
      out.write("        ");
      out.print( session.getAttribute("error") );
      out.write("\r\n");
      out.write("        ");
 session.removeAttribute("error"); 
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    ");
 } 
      out.write("\r\n");
      out.write("    <div class=\"flex justify-between items-center mb-6\">\r\n");
      out.write("        <h2 class=\"text-3xl font-bold text-[#2D6A4F] sm:text-2xl\">Task List</h2>\r\n");
      out.write("        <a href=\"taskCreate.jsp\" class=\"bg-[#F4A261] text-white p-3 rounded-lg shadow-md hover:bg-[#A8D5BA] hover:text-[#1A3C34] transition duration-300 sm:text-sm\">\r\n");
      out.write("            <i class=\"fas fa-plus\"></i> Add Task\r\n");
      out.write("        </a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"overflow-x-auto\">\r\n");
      out.write("        <table class=\"w-full bg-white rounded-lg shadow-md table-mobile-card\">\r\n");
      out.write("            <thead class=\"bg-[#2D6A4F] text-white\">\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th class=\"p-3 sm:p-2 sm:text-sm text-center\">ID</th>\r\n");
      out.write("                <th class=\"p-3 sm:p-2 sm:text-sm text-center\">ID Project</th>\r\n");
      out.write("                <th class=\"p-3 sm:p-2 sm:text-sm text-center\">Description</th>\r\n");
      out.write("                <th class=\"p-3 sm:p-2 sm:text-sm text-center\">Start Date</th>\r\n");
      out.write("                <th class=\"p-3 sm:p-2 sm:text-sm text-center\">End Date</th>\r\n");
      out.write("                <th class=\"p-3 sm:p-2 sm:text-sm text-center\">Actions</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody>\r\n");
      out.write("            ");

                List<Task> tasks = (List<Task>) request.getAttribute("tasks");
                if (tasks != null) {
                    for (Task task : tasks) {
            
      out.write("\r\n");
      out.write("            <tr class=\"border-b border-gray-200 hover:bg-[#A8D5BA]/20 transition duration-300\">\r\n");
      out.write("                <td class=\"p-3 sm:p-2 sm:text-sm text-center\" data-label=\"ID\">");
      out.print(task.getId());
      out.write("</td>\r\n");
      out.write("                <td class=\"p-3 sm:p-2 sm:text-sm text-center\" data-label=\"project_id\">");
      out.print(task.getProjectId());
      out.write("</td>\r\n");
      out.write("                <td class=\"p-3 sm:p-2 sm:text-sm text-center\" data-label=\"Description\">");
      out.print(task.getDescription());
      out.write("</td>\r\n");
      out.write("                <td class=\"p-3 sm:p-2 sm:text-sm text-center\" data-label=\"Start Date\">");
      out.print(task.getStart_date());
      out.write("</td>\r\n");
      out.write("                <td class=\"p-3 sm:p-2 sm:text-sm text-center\" data-label=\"End Date\">");
      out.print(task.getEnd_date());
      out.write("</td>\r\n");
      out.write("                <td class=\"p-3 sm:p-2 sm:text-sm flex justify-center items-center space-x-2\" data-label=\"Actions\">\r\n");
      out.write("                    <a href=\"updateTask.jsp?id=");
      out.print(task.getId());
      out.write("\" class=\"text-[#F4A261] hover:text-[#2D6A4F]\">\r\n");
      out.write("                        <i class=\"fas fa-edit\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <form action=\"DeleteTaskServlet\" method=\"post\" class=\"inline\">\r\n");
      out.write("                        <input type=\"hidden\" name=\"id\" value=\"");
      out.print(task.getId());
      out.write("\">\r\n");
      out.write("                        <button type=\"submit\" class=\"text-[#2D6A4F] hover:text-[#F4A261]\">\r\n");
      out.write("                            <i class=\"fas fa-trash\"></i>\r\n");
      out.write("                        </button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    <button onclick=\"openResourceModal(");
      out.print(task.getId());
      out.write(")\" class=\"text-[#F4A261] hover:text-[#2D6A4F]\">\r\n");
      out.write("                        <i class=\"fas fa-plus-circle\"></i> Add Resource\r\n");
      out.write("                    </button>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");

                }
            } else {
            
      out.write("\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td colspan=\"6\" class=\"p-3 text-center text-gray-500\">No tasks available.</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");
 } 
      out.write("\r\n");
      out.write("            </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- Resource Assignment Modal -->\r\n");
      out.write("<div id=\"resourceModal\" class=\"modal\">\r\n");
      out.write("    <div class=\"modal-content\">\r\n");
      out.write("        <h3 class=\"text-xl font-bold text-[#2D6A4F] mb-4\">Add Resource to Task</h3>\r\n");
      out.write("        <form action=\"AssignResourceServlet\" method=\"post\">\r\n");
      out.write("            <input type=\"hidden\" name=\"taskId\" id=\"taskId\">\r\n");
      out.write("            <div class=\"mb-4\">\r\n");
      out.write("                <label for=\"resourceId\" class=\"block font-bold sm:text-sm\">Select Resource</label>\r\n");
      out.write("                <select id=\"resourceId\" name=\"resourceId\" required class=\"w-full p-2 border rounded-lg\">\r\n");
      out.write("                    <option value=\"\">Select a resource</option>\r\n");
      out.write("                    ");

                        RessourceDAO resourceDAO = new RessourceDAO();
                        List<Ressource> resources = resourceDAO.getAllResources();
                        for (Ressource resource : resources) {
                    
      out.write("\r\n");
      out.write("                    <option value=\"");
      out.print(resource.getId());
      out.write('"');
      out.write('>');
      out.print(resource.getName());
      out.write(" (Qty: ");
      out.print(resource.getQuantity());
      out.write(")</option>\r\n");
      out.write("                    ");
 } 
      out.write("\r\n");
      out.write("                </select>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"mb-4\">\r\n");
      out.write("                <label for=\"quantity\" class=\"block font-bold sm:text-sm\">Quantity</label>\r\n");
      out.write("                <input type=\"number\" id=\"quantity\" name=\"quantity\" min=\"1\" required class=\"w-full p-2 border rounded-lg\" placeholder=\"Enter quantity\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"flex justify-end space-x-2\">\r\n");
      out.write("                <button type=\"button\" onclick=\"closeResourceModal()\" class=\"bg-gray-300 text-[#1A3C34] p-2 rounded-lg hover:bg-gray-400\">Cancel</button>\r\n");
      out.write("                <button type=\"submit\" class=\"bg-[#F4A261] text-white p-2 rounded-lg hover:bg-[#A8D5BA] hover:text-[#1A3C34]\">Assign</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    document.getElementById('menu-toggle').addEventListener('click', function() {\r\n");
      out.write("        const menu = document.getElementById('menu');\r\n");
      out.write("        menu.classList.toggle('hidden');\r\n");
      out.write("        menu.classList.toggle('active');\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    function openResourceModal(taskId) {\r\n");
      out.write("        document.getElementById('taskId').value = taskId;\r\n");
      out.write("        document.getElementById('resourceModal').classList.add('active');\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function closeResourceModal() {\r\n");
      out.write("        document.getElementById('resourceModal').classList.remove('active');\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
