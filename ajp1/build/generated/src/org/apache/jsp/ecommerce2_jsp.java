package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class ecommerce2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/header.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Advance Java Practicals</title>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, user-scalable=no\" />\n");
      out.write("    <meta name=\"description\" content=\"\" />\n");
      out.write("    <meta name=\"keywords\" content=\"\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/main.css\" />\n");
      out.write("</head>\n");
      out.write("<body class=\"is-preload\">\n");
      out.write("\n");

        int count = 0;
        String uname="user";
        if (session.getAttribute("cart") != null) {
            HashMap<Integer, Integer> cartItem = (HashMap<Integer, Integer>) session.getAttribute("cart");
            for (int i = 0; i < cartItem.size(); i++) {
                count++;
            }
        }
        if(session.getAttribute("user")!=null){
            uname=session.getAttribute("user").toString();
        }

      out.write("\n");
      out.write("\n");
      out.write("<!-- Header -->\n");
      out.write("<header id=\"header\">\n");
      out.write("    <a class=\"logo\" href=\"index.jsp\">Vimal Naina</a>\n");
      out.write("    <nav>\n");
      out.write("        <a href=\"checkout2.jsp\"><i class=\"icon fa-cart-plus\">&nbsp;</i>Cart-");
      out.print(count);
      out.write("</a>\n");
      out.write("        <a>Hi, ");
      out.print(uname);
      out.write("</a>\n");
      out.write("        <a href=\"#menu\">Menu</a>\n");
      out.write("    </nav>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("<!-- Nav -->\n");
      out.write("<nav id=\"menu\">\n");
      out.write("    <ul class=\"links\">\n");
      out.write("        <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("        <li><a href=\"calculator.jsp\">Calculator</a></li>\n");
      out.write("        <li><a href=\"visitorcounter.jsp\">Visitor Counter</a></li>\n");
      out.write("        <li><a href=\"ecommerce2.jsp\">E-Commerce</a></li>\n");
      out.write("        <li><a href=\"tablegenerator.jsp\">Table Generator</a></li>\n");
      out.write("        <li><a href=\"signup.jsp\">SignUp</a></li>\n");
      out.write("        <li><a href=\"login.jsp\">Login</a></li>\n");
      out.write("        <li><a href=\"logout.jsp\">Logout</a></li>\n");
      out.write("\n");
      out.write("    </ul>\n");
      out.write("</nav>");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Heading -->\n");
      out.write("<div id=\"heading\" >\n");
      out.write("    <h1>E-Commerce</h1>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div align=\"center\">\n");
      out.write("    <font color=\"green\" size=\"4px\">\n");
      out.write("        <br/>\n");
      out.write("        ");

        if (request.getParameter("msg") != null) {
            out.println(request.getParameter("msg"));
        }
        
      out.write("\n");
      out.write("    </font>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"inner\">\n");
      out.write("    <div class=\"content\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-12\">\n");
      out.write("                <form method=\"post\" action=\"\">\n");
      out.write("                    <div class=\"row gtr-uniform\">\n");
      out.write("                        <div class=\"col-4 col-12-xsmall\">\n");
      out.write("                            <select name=\"srchby\">\n");
      out.write("                                <option value=\"\">- Search By -</option>\n");
      out.write("                                <option value=\"name\">Name</option>\n");
      out.write("                                <option value=\"desc\">Description</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-5 col-12-xsmall\">\n");
      out.write("                            <input type=\"text\" name=\"search\" placeholder=\"Search Product\" />\n");
      out.write("                        </div>\n");
      out.write("                        <!-- Break -->\n");
      out.write("                        <div class=\"col-2 col-12-xsmall\">\n");
      out.write("                            <ul class=\"actions\">\n");
      out.write("                                <li><input type=\"submit\" value=\"Search\" class=\"primary\" /></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<section id=\"main\" class=\"wrapper\">\n");
      out.write("    <div class=\"container1\">\n");
      out.write("        <div class=\"row1\">\n");
      out.write("\n");
      out.write("            ");


        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from products");
        if (request.getParameter("search") != null) {
            String srchBy = request.getParameter("srchby");
            String search = request.getParameter("search");
            if (srchBy.equals("name")) {
                rs = stmt.executeQuery("SELECT * FROM `products` WHERE pname LIKE '%" + search + "%'");
            }
            if (srchBy.equals("desc")) {
                rs = stmt.executeQuery("SELECT * FROM `products` WHERE pdesc LIKE '%" + search + "%'");
            }
        }
        while (rs.next()) {

            out.println("<div class='4u'>");
            out.println("<section class='special box'>");
            out.println("<img src='images/" + rs.getString(6) + "'/>");
            out.println("<br/><br/><h3>" + rs.getString(2) + "</h3>");
            out.println("<h3>Price: " + rs.getInt(4) + " INR</h3>");
            out.println("<p>" + rs.getString(5) + "</p>");
            out.println("<br/><br/>");
            out.println("<form method='post' action='addToCart.jsp'>");
            out.println("<div class='row gtr-uniform'>");
            out.println("<div class='col-6 col-12-xsmall'>");
            out.println("<input type='text' name='qty' placeholder='Quantity' value='1'/>");
            out.println("<input type='hidden' name='pid' value='" + rs.getInt(1) + "'/>");
            out.println("</div>");
            out.println("<div class='col-6'>");
            out.println("<ul class='actions'>");
            out.println("<li><input type='submit' value='Add To Cart' class='primary' /></li>");
            out.println("</ul>");
            out.println("</div>");
            out.println("</div>");
            out.println("</form>");
            out.println("</section>");
            out.println("</div>");
        }

            
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section>");
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
