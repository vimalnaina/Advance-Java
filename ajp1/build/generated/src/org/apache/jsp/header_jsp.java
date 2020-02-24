package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


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

      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<title>Advance Java Practicals</title>\n");
      out.write("\t\t<meta charset=\"utf-8\" />\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, user-scalable=no\" />\n");
      out.write("\t\t<meta name=\"description\" content=\"\" />\n");
      out.write("\t\t<meta name=\"keywords\" content=\"\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/main.css\" />\n");
      out.write("\t</head>\n");
      out.write("\t<body class=\"is-preload\">\n");
      out.write("\n");
      out.write("\t\t<!-- Header -->\n");
      out.write("\t\t\t<header id=\"header\">\n");
      out.write("\t\t\t\t<a class=\"logo\" href=\"index.jsp\">Vimal Naina</a>\n");
      out.write("\t\t\t\t<nav>\n");
      out.write("\t\t\t\t\t<a href=\"#menu\">Menu</a>\n");
      out.write("\t\t\t\t</nav>\n");
      out.write("\t\t\t</header>\n");
      out.write("\n");
      out.write("\t\t<!-- Nav -->\n");
      out.write("\t\t\t<nav id=\"menu\">\n");
      out.write("\t\t\t\t<ul class=\"links\">\n");
      out.write("\t\t\t\t\t<li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<li class=\"has-children\">\n");
      out.write("                    <a href=\"#about-section\" class=\"nav-link\">About Us</a>\n");
      out.write("                    <ul class=\"dropdown arrow-top\">\n");
      out.write("                      <li><a href=\"#team-section\" class=\"nav-link\">Team</a></li>\n");
      out.write("                      <li><a href=\"#pricing-section\" class=\"nav-link\">Pricing</a></li>\n");
      out.write("                      <li><a href=\"#faq-section\" class=\"nav-link\">FAQ</a></li>\n");
      out.write("                      <li class=\"has-children\">\n");
      out.write("                        <a href=\"#\">More Links</a>\n");
      out.write("                        <ul class=\"dropdown\">\n");
      out.write("                          <li><a href=\"#\">Menu One</a></li>\n");
      out.write("                          <li><a href=\"#\">Menu Two</a></li>\n");
      out.write("                          <li><a href=\"#\">Menu Three</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                      </li>\n");
      out.write("                    </ul>\n");
      out.write("                  </li>\n");
      out.write("                  \n");
      out.write("\t\t\t\t\t<li><a href=\"signup.jsp\">SignUp</a></li>\n");
      out.write("                    <li><a href=\"login.jsp\">Login</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</nav>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
