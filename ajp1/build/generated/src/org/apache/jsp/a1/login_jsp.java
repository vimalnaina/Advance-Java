package org.apache.jsp.a1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/a1/../header.jsp");
    _jspx_dependants.add("/a1/../footer.jsp");
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
      out.write("    <link rel=\"stylesheet\" href=\"../assets/css/main.css\" />\n");
      out.write("    <script>\n");
      out.write("        /* Loop through all dropdown buttons to toggle between hiding and showing its dropdown content - This allows the user to have multiple dropdowns without any conflict */\n");
      out.write("        var dropdown = document.getElementsByClassName(\"dropdown\");\n");
      out.write("        var i;\n");
      out.write("\n");
      out.write("        for (i = 0; i < dropdown.length; i++) {\n");
      out.write("            dropdown[i].addEventListener(\"click\", function() {\n");
      out.write("                this.classList.toggle(\"active\");\n");
      out.write("                var dropdownContent = this.nextElementSibling;\n");
      out.write("                if (dropdownContent.style.display === \"block\") {\n");
      out.write("                    dropdownContent.style.display = \"none\";\n");
      out.write("                } else {\n");
      out.write("                    dropdownContent.style.display = \"block\";\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        }\n");
      out.write("    </script>\n");
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
      out.write("            <li><a href=\"index.jsp\">HOME</a></li>\n");
      out.write("            <li class=\"drop-down\"><a href=\"\">ASSIGNMENT-1</a>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"signup.jsp\">Signup</a></li>\n");
      out.write("                    <li><a href=\"login.jsp\">Login</a></li>\n");
      out.write("                    <li><a href=\"tablegenerator.jsp\">Table-Generator</a></li>\n");
      out.write("                    <li><a href=\"visitorcounter.jsp\">Visitor-Counter</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"drop-down\"><a href=\"\">ASSIGNMENT-2</a>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"calculator.jsp\">Calculator</a></li>\n");
      out.write("                    <li><a href=\"tempconverter.jsp\">Temp-Convertor</a></li>\n");
      out.write("                    <li><a href=\"dynamicHtml.jsp\">Dynamic-Html</a></li>\n");
      out.write("                    <li><a href=\"ecommerce2.jsp\">E-commerce</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"drop-down\"><a href=\"\">ASSIGNMENT-3</a>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"products.jsp\">Products</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            <li><a href=\"checkout2.jsp\"><i class=\"icon fa-cart-plus\">&nbsp;</i>Cart-");
      out.print(count);
      out.write("</a></li>\n");
      out.write("            <li><a>Hi, ");
      out.print(uname);
      out.write("</a></li>\n");
      out.write("        </ul>\n");
      out.write("    </nav>\n");
      out.write("</header>");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Heading -->\n");
      out.write("<div id=\"heading\" >\n");
      out.write("    <h1>Login</h1>\n");
      out.write("</div>\n");
      out.write("<div align=\"center\">\n");
      out.write("    <font color=\"green\" size=\"4px\">\n");
      out.write("        <br>\n");
      out.write("        ");

        if (request.getParameter("username") != null && request.getParameter("pwd") != null) {
            String username = request.getParameter("username");
            String password = request.getParameter("pwd");
            int flag=0;
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from user where username='" + username + "'");
            while (rs.next()) {
                String password2 = rs.getString(2);
                if (password.equals(password2)) {
                    flag=1;
                    break;
                } else {
                    flag=0;
                }
            }
            if(flag==1){
                session.setAttribute("user",username);
                out.println("login successfully");
                out.println("<br/>welcome, "+session.getAttribute("user"));
            }
            else{
                out.println("error while login!");
            }
        }
        
      out.write("\n");
      out.write("    </font>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Main -->\n");
      out.write("<section id=\"main\" class=\"wrapper\">\n");
      out.write("    <div class=\"inner\">\n");
      out.write("        <div class=\"content\">\n");
      out.write("\n");
      out.write("            <!-- Elements -->\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-6 col-12-medium\">\n");
      out.write("\n");
      out.write("                    <!-- Form -->\n");
      out.write("                    <form method=\"post\" action=\"\">\n");
      out.write("                        <div class=\"row gtr-uniform\">\n");
      out.write("                            <div class=\"col-6 col-12-xsmall\">\n");
      out.write("                                <input type=\"text\" name=\"username\" placeholder=\"Username\" />\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-6 col-12-xsmall\">\n");
      out.write("                                <input type=\"password\" name=\"pwd\" placeholder=\"Password\" />\n");
      out.write("                            </div>\n");
      out.write("                            <!-- Break -->\n");
      out.write("                            <div class=\"col-12\">\n");
      out.write("                                <ul class=\"actions\">\n");
      out.write("                                    <li><input type=\"submit\" value=\"Login\" class=\"primary\" /></li>\n");
      out.write("                                    <li><input type=\"reset\" value=\"Reset\" /></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
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
      out.write("\t\t\t<script src=\"assets/js/jquery.min.js\"></script>\n");
      out.write("\t\t\t<script src=\"assets/js/browser.min.js\"></script>\n");
      out.write("\t\t\t<script src=\"assets/js/breakpoints.min.js\"></script>\n");
      out.write("\t\t\t<script src=\"assets/js/util.js\"></script>\n");
      out.write("\t\t\t<script src=\"assets/js/main.js\"></script>\n");
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
