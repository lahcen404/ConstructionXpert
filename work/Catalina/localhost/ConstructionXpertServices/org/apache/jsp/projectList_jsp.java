/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.36
 * Generated at: 2025-03-17 12:56:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class projectList_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("    <title>ConstructionXpert - Projects</title>\r\n");
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
      out.write("        /* Mobile Card Layout for Tables */\r\n");
      out.write("        @media (max-width: 640px) {\r\n");
      out.write("            .table-mobile-card {\r\n");
      out.write("                display: block;\r\n");
      out.write("            }\r\n");
      out.write("            .table-mobile-card thead {\r\n");
      out.write("                display: none;\r\n");
      out.write("            }\r\n");
      out.write("            .table-mobile-card tbody, .table-mobile-card tr {\r\n");
      out.write("                display: block;\r\n");
      out.write("            }\r\n");
      out.write("            .table-mobile-card tr {\r\n");
      out.write("                margin-bottom: 1rem;\r\n");
      out.write("                border: 1px solid #e5e7eb;\r\n");
      out.write("                border-radius: 0.5rem;\r\n");
      out.write("                padding: 1rem;\r\n");
      out.write("                background-color: #fff;\r\n");
      out.write("                box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);\r\n");
      out.write("            }\r\n");
      out.write("            .table-mobile-card td {\r\n");
      out.write("                display: flex;\r\n");
      out.write("                justify-content: space-between;\r\n");
      out.write("                padding: 0.5rem 0;\r\n");
      out.write("                border: none;\r\n");
      out.write("            }\r\n");
      out.write("            .table-mobile-card td:before {\r\n");
      out.write("                content: attr(data-label);\r\n");
      out.write("                font-weight: bold;\r\n");
      out.write("                color: #1A3C34;\r\n");
      out.write("                margin-right: 0.5rem;\r\n");
      out.write("            }\r\n");
      out.write("            .table-mobile-card td:last-child {\r\n");
      out.write("                justify-content: center;\r\n");
      out.write("                gap: 0.5rem;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"bg-[#F9F7F1] text-[#1A3C34] min-h-screen\">\r\n");
      out.write("<nav class=\"bg-[#2D6A4F] text-white p-4 shadow-lg\">\r\n");
      out.write("    <div class=\"container mx-auto flex justify-between items-center\">\r\n");
      out.write("        <h1 class=\"text-2xl font-bold sm:text-xl mb-4\"> <i class=\"fas fa-hammer\"></i>  ConstructionXpert </h1>\r\n");
      out.write("        <div class=\"md:hidden\">\r\n");
      out.write("            <button id=\"menu-toggle\" class=\"text-white focus:outline-none\">\r\n");
      out.write("                <i class=\"fas fa-bars text-2xl\"></i>\r\n");
      out.write("            </button>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"menu\" class=\"hidden mt-6 md:flex md:space-x-4 flex-col md:flex-row absolute md:static top-16 left-0 w-full md:w-auto bg-[#2D6A4F] md:bg-transparent p-4 md:p-0 z-10\">\r\n");
      out.write("            <a href=\"dashboard\" class=\"block md:inline-block hover:text-[#A8D5BA] transition duration-200 sm:text-sm py-3 md:py-0 px-4 rounded-lg hover:bg-[#A8D5BA]/20\">Dashboard</a>\r\n");
      out.write("            <a href=\"project?action=list\" class=\"block md:inline-block hover:text-[#A8D5BA] transition duration-200 sm:text-sm py-3 md:py-0 px-4 rounded-lg hover:bg-[#A8D5BA]/20\">Projects</a>\r\n");
      out.write("            <a href=\"task?projectId=1\" class=\"block md:inline-block hover:text-[#A8D5BA] transition duration-200 sm:text-sm py-3 md:py-0 px-4 rounded-lg hover:bg-[#A8D5BA]/20\">Tasks</a>\r\n");
      out.write("            <a href=\"resource\" class=\"block md:inline-block hover:text-[#A8D5BA] transition duration-200 sm:text-sm py-3 md:py-0 px-4 rounded-lg hover:bg-[#A8D5BA]/20\">Resources</a>\r\n");
      out.write("            <a href=\"login?logout=true\" class=\"block md:inline-block hover:text-[#A8D5BA] transition duration-200 sm:text-sm py-3 md:py-0 px-4 rounded-lg hover:bg-[#A8D5BA]/20\">\r\n");
      out.write("                <i class=\"fas fa-sign-out-alt\"></i> Logout\r\n");
      out.write("            </a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav> Projects Content -->\r\n");
      out.write("<div class=\"container mx-auto p-6 mt-6\">\r\n");
      out.write("    <div class=\"flex justify-between items-center mb-6\">\r\n");
      out.write("        <h2 class=\"text-3xl font-bold text-[#2D6A4F] sm:text-2xl\">Projects</h2>\r\n");
      out.write("        <a href=\"project?action=create\" class=\"bg-[#F4A261] text-white px-4 py-2 rounded-lg shadow-md hover:bg-[#A8D5BA] hover:text-[#1A3C34] transition duration-300 sm:text-sm sm:px-3 sm:py-1\">\r\n");
      out.write("            <i class=\"fas fa-plus\"></i> Add Project\r\n");
      out.write("        </a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"overflow-x-auto\">\r\n");
      out.write("        <table class=\"w-full bg-white rounded-lg shadow-md table-mobile-card\">\r\n");
      out.write("            <thead class=\"bg-[#2D6A4F] text-white\">\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th class=\"p-6 sm:p-3 sm:text-sm\">ID</th>\r\n");
      out.write("                <th class=\"p-6 sm:p-3 sm:text-sm\">Name</th>\r\n");
      out.write("                <th class=\"p-6 sm:p-3 sm:text-sm\">Description</th>\r\n");
      out.write("                <th class=\"p-6 sm:p-3 sm:text-sm\">Start Date</th>\r\n");
      out.write("                <th class=\"p-6 sm:p-3 sm:text-sm\">End Date</th>\r\n");
      out.write("                <th class=\"p-6 sm:p-3 sm:text-sm\">Budget</th>\r\n");
      out.write("                <th class=\"p-6 sm:p-3 sm:text-sm\">Actions</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody>\r\n");
      out.write("            ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<script>\r\n");
      out.write("    document.getElementById('menu-toggle').addEventListener('click', function() {\r\n");
      out.write("        const menu = document.getElementById('menu');\r\n");
      out.write("        menu.classList.toggle('hidden');\r\n");
      out.write("        menu.classList.toggle('active');\r\n");
      out.write("    });\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    jakarta.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /projectList.jsp(105,12) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("project");
    // /projectList.jsp(105,12) name = items type = jakarta.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/projectList.jsp(105,12) '${projects}'",_jsp_getExpressionFactory().createValueExpression("${projects}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                <tr class=\"border-b hover:bg-[#A8D5BA]/20 transition duration-300\">\r\n");
          out.write("                    <td class=\"p-6 sm:p-3 sm:text-sm\" data-label=\"ID\">${project.id}</td>\r\n");
          out.write("                    <td class=\"p-6 sm:p-3 sm:text-sm\" data-label=\"Name\">${project.name}</td>\r\n");
          out.write("                    <td class=\"p-6 sm:p-3 sm:text-sm\" data-label=\"Description\">${project.description}</td>\r\n");
          out.write("                    <td class=\"p-6 sm:p-3 sm:text-sm\" data-label=\"Start Date\">${project.startDate}</td>\r\n");
          out.write("                    <td class=\"p-6 sm:p-3 sm:text-sm\" data-label=\"End Date\">${project.endDate}</td>\r\n");
          out.write("                    <td class=\"p-6 sm:p-3 sm:text-sm\" data-label=\"Budget\">${project.budget}</td>\r\n");
          out.write("                    <td class=\"p-6 sm:p-3 sm:text-sm\" data-label=\"Actions\">\r\n");
          out.write("                        <a href=\"project?action=update&id=${project.id}\" class=\"text-[#F4A261] hover:text-[#2D6A4F] mr-6 sm:mr-2\"><i class=\"fas fa-edit\"></i></a>\r\n");
          out.write("                        <a href=\"project?action=delete&id=${project.id}\" class=\"text-[#2D6A4F] hover:text-[#F4A261]\"><i class=\"fas fa-trash\"></i></a>\r\n");
          out.write("                    </td>\r\n");
          out.write("                </tr>\r\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
    }
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    return false;
  }
}
