/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.36
 * Generated at: 2025-03-23 15:10:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class resourceCreate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = null;
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>ConstructionXpert - Add Resource</title>\r\n");
      out.write("    <script src=\"https://cdn.tailwindcss.com\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css\">\r\n");
      out.write("    <style>\r\n");
      out.write("        #menu {\r\n");
      out.write("            transition: all 0.3s ease-in-out;\r\n");
      out.write("            transform: translateY(-100%);\r\n");
      out.write("        }\r\n");
      out.write("        #menu.active {\r\n");
      out.write("            transform: translateY(0);\r\n");
      out.write("        }\r\n");
      out.write("        #menu a {\r\n");
      out.write("            transition: background-color 0.3s ease, color 0.3s ease;\r\n");
      out.write("        }\r\n");
      out.write("        #menu a:hover {\r\n");
      out.write("            background-color: #A8D5BA;\r\n");
      out.write("            color: #1A3C34;\r\n");
      out.write("        }\r\n");
      out.write("        .error {\r\n");
      out.write("            color: #F4A261;\r\n");
      out.write("            font-size: 0.875rem;\r\n");
      out.write("            margin-top: 0.25rem;\r\n");
      out.write("            display: none;\r\n");
      out.write("        }\r\n");
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
      out.write("<!-- Add Resource Content -->\r\n");
      out.write("<div class=\"container mx-auto p-6 mt-6\">\r\n");
      out.write("    <div class=\"max-w-md mx-auto bg-white rounded-lg shadow-md p-6\">\r\n");
      out.write("        <h2 class=\"text-3xl font-bold text-[#2D6A4F] mb-6 text-center sm:text-2xl\">\r\n");
      out.write("            <i class=\"fas fa-plus-square\"></i> Add New Resource\r\n");
      out.write("        </h2>\r\n");
      out.write("        ");
 if (request.getAttribute("error") != null) { 
      out.write("\r\n");
      out.write("        <div class=\"bg-[#F4A261]/10 text-[#F4A261] p-3 rounded mb-6 text-center sm:text-sm\">\r\n");
      out.write("            ");
      out.print( request.getAttribute("error") );
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
 } 
      out.write("\r\n");
      out.write("        ");
 if (request.getAttribute("success") != null) { 
      out.write("\r\n");
      out.write("        <div class=\"bg-[#A8D5BA]/10 text-[#1A3C34] p-3 rounded mb-6 text-center sm:text-sm\">\r\n");
      out.write("            ");
      out.print( request.getAttribute("success") );
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
 } 
      out.write("\r\n");
      out.write("        <form action=\"ResourceServlet\" method=\"post\" class=\"space-y-6\" >\r\n");
      out.write("            <input type=\"hidden\" name=\"action\" value=\"create\">\r\n");
      out.write("            <div>\r\n");
      out.write("                <label for=\"name\" class=\"block font-bold sm:text-sm\">Resource Name</label>\r\n");
      out.write("                <input type=\"text\" id=\"name\" name=\"name\"  class=\"w-full p-4 sm:p-3 border rounded-lg focus:outline-none focus:ring-2 focus:ring-[#F4A261]\" placeholder=\"Enter resource name\">\r\n");
      out.write("                <div id=\"nameError\" class=\"error\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <label for=\"type\" class=\"block font-bold sm:text-sm\">Type</label>\r\n");
      out.write("                <input type=\"text\" id=\"type\" name=\"type\" class=\"w-full p-4 sm:p-3 border rounded-lg focus:outline-none focus:ring-2 focus:ring-[#F4A261]\" placeholder=\"Enter resource type \">\r\n");
      out.write("                <div id=\"typeError\" class=\"error\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <label for=\"quantity\" class=\"block font-bold sm:text-sm\">Quantity</label>\r\n");
      out.write("                <input type=\"number\" id=\"quantity\" name=\"quantity\"  class=\"w-full p-4 sm:p-3 border rounded-lg focus:outline-none focus:ring-2 focus:ring-[#F4A261]\" placeholder=\"Enter quantity\">\r\n");
      out.write("                <div id=\"quantityError\" class=\"error\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <button type=\"submit\" class=\"w-full bg-[#F4A261] text-white p-4 sm:p-3 rounded-lg hover:bg-[#A8D5BA] hover:text-[#1A3C34] transition duration-300 sm:text-sm\">\r\n");
      out.write("                <i class=\"fas fa-save\"></i> Save Resource\r\n");
      out.write("            </button>\r\n");
      out.write("        </form>\r\n");
      out.write("        <div class=\"mt-4 text-center\">\r\n");
      out.write("            <a href=\"ResourceServlet\" class=\"bg-[#2D6A4F] text-white p-4 sm:p-3 rounded-lg hover:bg-[#A8D5BA] hover:text-[#1A3C34] transition duration-300 sm:text-sm\">\r\n");
      out.write("                <i class=\"fas fa-arrow-left\"></i> Back to Resources\r\n");
      out.write("            </a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
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
