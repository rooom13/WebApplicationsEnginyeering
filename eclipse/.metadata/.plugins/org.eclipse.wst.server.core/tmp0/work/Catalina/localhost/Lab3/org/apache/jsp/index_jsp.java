/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2018-05-29 14:09:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<title>UrDistrict</title>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://fonts.googleapis.com/css?family=Montserrat\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/structure.css\">\n");
      out.write("<!-- FOR TABS >-->\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<body class=\"w3-black\">\n");
      out.write("\n");
      out.write("\t<!-- Device Navigation -->\n");
      out.write("\t<div class=\"w3-top w3-hide-large w3-hide-medium\" id=\"myNavbar\">\n");
      out.write("\t\t<div\n");
      out.write("\t\t\tclass=\"w3-bar w3-black w3-opacity w3-hover-opacity-off w3-center w3-small\">\n");
      out.write("\t\t\t<a href=\"#\" class=\"w3-bar-item w3-button\"\n");
      out.write("\t\t\t\tstyle=\"width: 25% !important\">HOME</a> <a href=\"#about\"\n");
      out.write("\t\t\t\tclass=\"w3-bar-item w3-button\" style=\"width: 25% !important\">ABOUT</a>\n");
      out.write("\t\t\t<a href=\"#photos\" class=\"w3-bar-item w3-button\"\n");
      out.write("\t\t\t\tstyle=\"width: 25% !important\">PHOTOS</a> <a href=\"#contact\"\n");
      out.write("\t\t\t\tclass=\"w3-bar-item w3-button\" style=\"width: 25% !important\">CONTACT</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- End Navigation -->\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- Begin Navigation -->\n");
      out.write("\t<nav id=\"navigation\"\n");
      out.write("\t\tclass=\"w3-sidebar w3-bar-block w3-small w3-hide-small w3-center\">\n");
      out.write("\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "ViewMenuNotLogged.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\t</nav>\n");
      out.write("\t<!-- End Navigation -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- Page Content -->\n");
      out.write("\t<div class=\"w3-padding-large\" id=\"main\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<!-- TopTopics -->\n");
      out.write("\t\t<div class=\"w3-content w3-justify w3-text-grey \" id=\"topTopics\"\n");
      out.write("\t\t\tstyle=\"margin-top: 64px;\">\n");
      out.write("\t\t\t<h2 class=\"w3-text-light-grey\">Top Topics</h2>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"w3-row w3-center w3-padding-16 w3-section w3-light-grey\">\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"w3-quarter w3-section top-topic-item\">\n");
      out.write("\t\t\t\t\t#Vandalism <br> <span>150+</span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"w3-quarter w3-section top-topic-item\">\n");
      out.write("\t\t\t\t\t#Vandalism <br> <span>150+</span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"w3-quarter w3-section top-topic-item\">\n");
      out.write("\t\t\t\t\t#Vandalism <br> <span>150+</span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"w3-quarter w3-section top-topic-item\">\n");
      out.write("\t\t\t\t\t#Vandalism <br> <span>150+</span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"w3-quarter w3-section top-topic-item\">\n");
      out.write("\t\t\t\t\t#Vandalism <br> <span>150+</span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- TopTopics -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<div class=\"w3-content w3-justify w3-text-grey \" id=\"topTopics\">\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<ul class=\"nav nav-tabs\" style=\"border: none;\">\n");
      out.write("\t\t\t<li class=\"active\"><a class=\"myTab\" data-toggle=\"tab\"\n");
      out.write("\t\t\t\thref=\"#loudestVoices\"><h2 class=\"w3-text-black\">Hottest\n");
      out.write("\t\t\t\t\t\tvoices</h2></a></li>\n");
      out.write("\t\t\t<li><a class=\"myTab\" data-toggle=\"tab\" href=\"#mostClapped\">\n");
      out.write("\t\t\t\t\t<h2 class=\"w3-text-black\">Most clapped</h2>\n");
      out.write("\t\t\t</a></li>\n");
      out.write("\t\t</ul>\n");
      out.write("\n");
      out.write("\t\t<div class=\"container-fluid\"\n");
      out.write("\t\t\tstyle=\"background-color: white; border-radius: 5px; border-top-left-radius: 0px;\">\n");
      out.write("\t\t\t<div class=\"tab-content\">\n");
      out.write("\t\t\t\t<div id=\"loudestVoices\" class=\"tab-pane fade in active\"\n");
      out.write("\t\t\t\t\tstyle=\"background-color: white;\">\n");
      out.write("\t\t\t\t\t<p>Loudest voices</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div id=\"mostClapped\" class=\"tab-pane fade\">\n");
      out.write("\t\t\t\t\t<p>Most clapped voices</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("  function toggle_login() {\n");
      out.write("    $(\"#loginBox\").slideToggle('slow');\n");
      out.write("\n");
      out.write("\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  function onDocumentLoad(){\n");
      out.write("      $(\"#loginBox\").hide();\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  onDocumentLoad();\n");
      out.write("  </script>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
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