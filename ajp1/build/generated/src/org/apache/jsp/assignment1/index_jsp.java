package org.apache.jsp.assignment1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/assignment1/../header.jsp");
    _jspx_dependants.add("/assignment1/../footer.jsp");
  }

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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Advance Java Practicals</title>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, user-scalable=no\" />\n");
      out.write("    <meta name=\"description\" content=\"\" />\n");
      out.write("    <meta name=\"keywords\" content=\"\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"../assets/css/main.css\" />\n");
      out.write("</head>\n");
      out.write("<body class=\"is-preload\">\n");
      out.write("\n");

        int count = 0;
        String uname = "user";
        if (session.getAttribute("cart") != null) {
            HashMap<Integer, Integer> cartItem = (HashMap<Integer, Integer>) session.getAttribute("cart");
            for (int i = 0; i < cartItem.size(); i++) {
                count++;
            }
        }
        if (session.getAttribute("user") != null) {
            uname = session.getAttribute("user").toString();
        }

      out.write("\n");
      out.write("\n");
      out.write("<!-- Header -->\n");
      out.write("<header id=\"header\">\n");
      out.write("\n");
      out.write("    <a class=\"logo\" href=\"index.jsp\">Vimal Naina</a>\n");
      out.write("\n");
      out.write("    <nav class=\"main-nav float-right d-none d-lg-block\">\n");
      out.write("        <ul>\n");
      out.write("            <li><a href=\"../assignment1/index.jsp\">HOME</a></li>\n");
      out.write("            <li class=\"drop-down\"><a href=\"\">ASSIGNMENT-1</a>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"../assignment1/signup.jsp\">Signup</a></li>\n");
      out.write("                    <li><a href=\"../assignment1/login.jsp\">Login</a></li>\n");
      out.write("                    <li><a href=\"../assignment1/tablegenerator.jsp\">Table-Generator</a></li>\n");
      out.write("                    <li><a href=\"../assignment1/visitorcounter.jsp\">Visitor-Counter</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"drop-down\"><a href=\"\">ASSIGNMENT-2</a>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"../assignment2/calculator.jsp\">Calculator</a></li>\n");
      out.write("                    <li><a href=\"../assignment2/tempconverter.jsp\">Temp-Convertor</a></li>\n");
      out.write("                    <li><a href=\"../assignment2/dynamicHtml.jsp\">Dynamic-Html</a></li>\n");
      out.write("                    <li><a href=\"../assignment2/ecommerce.jsp\">E-commerce</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"drop-down\"><a href=\"\">ASSIGNMENT-3</a>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"../assignment3/ecommerce2.jsp\">E-commerce:2</a></li>\n");
      out.write("                    <li><a href=\"../assignment3/products.jsp\">Products</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            <li><a href=\"../assignment3/checkout2.jsp\"><i class=\"icon fa-cart-plus\">&nbsp;</i>Cart-");
      out.print(count);
      out.write("</a></li>\n");
      out.write("            <li class=\"drop-down\"><a>Hi, ");
      out.print(uname);
      out.write("</a>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"#\">Profile</a></li>\n");
      out.write("                    <li><a href=\"#\">My Orders</a></li>\n");
      out.write("                    <li><a href=\"../assignment1/logout.jsp\">Logout</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("    </nav>\n");
      out.write("</header>");
      out.write("\n");
      out.write("\n");
      out.write("    <section id=\"banner\">\n");
      out.write("\t\t<div class=\"inner\">\n");
      out.write("\t\t\t<h1>Advance Java Practicals</h1>\n");
      out.write("\t\t\t<p>by Vimal Naina</p>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("\n");
      out.write("<footer id=\"footer\">\n");
      out.write("\t\t\t\t<div class=\"inner\">\n");
      out.write("\t\t\t\t\t<div class=\"content\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<section>\n");
      out.write("\t\t\t\t\t\t\t<h4>Menu</h4>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"alt\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Home</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Assignments</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">SignUp</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</section>\n");
      out.write("\t\t\t\t\t\t<section>\n");
      out.write("\t\t\t\t\t\t\t<h4>Follow On</h4>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"plain\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"icon fa-github\">&nbsp;</i>Github</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"icon fa-linkedin\">&nbsp;</i>LinkedIn</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</section>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</footer>\n");
      out.write("\n");
      out.write("\t\t<!-- Scripts -->\n");
      out.write("\t\t\t<script src=\"../assets/js/jquery.min.js\"></script>\n");
      out.write("\t\t\t<script src=\"../assets/js/browser.min.js\"></script>\n");
      out.write("\t\t\t<script src=\"../assets/js/breakpoints.min.js\"></script>\n");
      out.write("\t\t\t<script src=\"../assets/js/util.js\"></script>\n");
      out.write("\t\t\t<script src=\"../assets/js/main.js\"></script>\n");
      out.write("\n");
      out.write("\t</body>\n");
      out.write("</html>");
      out.write('\n');
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
