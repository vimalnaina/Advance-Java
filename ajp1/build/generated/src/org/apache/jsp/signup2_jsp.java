package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class signup2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
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
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/main.css\" />\n");
      out.write("</head>\n");
      out.write("<body class=\"is-preload\">\n");
      out.write("\n");

        int count = 0;
        if (session.getAttribute("cart") != null) {
            HashMap<Integer, Integer> cartItem = (HashMap<Integer, Integer>) session.getAttribute("cart");
            for (int i = 0; i < cartItem.size(); i++) {
                count++;
            }
        }

      out.write("\n");
      out.write("\n");
      out.write("<!-- Header -->\n");
      out.write("<header id=\"header\">\n");
      out.write("    <a class=\"logo\" href=\"index.jsp\">Vimal Naina</a>\n");
      out.write("    <nav>\n");
      out.write("        <a href=\"checkout.jsp\"><i class=\"icon fa-cart-plus\">&nbsp;</i>Cart-");
      out.print(count);
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
      out.write("        <li><a href=\"ecommerce.jsp\">E-Commerce</a></li>\n");
      out.write("        <li><a href=\"tablegenerator.jsp\">Table Generator</a></li>\n");
      out.write("        <li><a href=\"signup.jsp\">SignUp</a></li>\n");
      out.write("        <li><a href=\"login.jsp\">Login</a></li>\n");
      out.write("        <li><a href=\"logout.jsp\">Logout</a></li>\n");
      out.write("\n");
      out.write("    </ul>\n");
      out.write("</nav>");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Heading -->\n");
      out.write("\t\t\t<div id=\"heading\" >\n");
      out.write("\t\t\t\t<h1>SignUp</h1>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<!-- Main -->\n");
      out.write("\t\t\t<section id=\"main\" class=\"wrapper\">\n");
      out.write("\t\t\t\t<div class=\"inner\">\n");
      out.write("\t\t\t\t\t<div class=\"content\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- Elements -->\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-6 col-12-medium\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Form -->\n");
      out.write("\t\t\t\t\t\t\t\t\t<form method=\"post\" action=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"row gtr-uniform\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-6 col-12-xsmall\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"username\" placeholder=\"Username\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-6 col-12-xsmall\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"password\" name=\"pwd\" placeholder=\"Password\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-12\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"email\" name=\"email\" placeholder=\"Email\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<!-- Break -->\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-12\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<select name=\"branch\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"\">- Select Branch -</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"CE\">CE</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"IT\">IT</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"EC\">EC</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"EE\">EE</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"NT\">NT</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"BT\">BT</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"MECH\">MECH</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"CIVIL\">CIVIL</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-12\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<select name=\"sem\" >\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"\">- Select Semester -</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"1\">1</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"2\">2</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"3\">3</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"4\">4</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"5\">5</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"6\">6</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"7\">7</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"8\">8</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<!-- Break -->\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-6 col-12-small\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" id=\"gender-male\" name=\"gender\" value=\"male\" checked>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"gender-male\">Male</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-6 col-12-small\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" id=\"gender-female\" name=\"gender\" value=\"female\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"gender-female\">Female</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<!-- Break -->\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-4 col-12-small\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" id=\"cric\" name=\"hobby\" value=\"cricket\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"cric\">Cricket</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-4 col-12-small\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" id=\"read\" name=\"hobby\" value=\"reading\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"read\">Reading</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-4 col-12-small\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" id=\"sing\" name=\"hobby\" value=\"singing\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"sing\">Singing</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<!-- Break -->\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-12\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<textarea name=\"address\" placeholder=\"Address\" rows=\"6\"></textarea>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<!-- Break -->\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-12\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<ul class=\"actions\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li><input type=\"submit\" value=\"SignUp\" class=\"primary\" /></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li><input type=\"reset\" value=\"Reset\" /></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</form>\n");
      out.write("                                    ");

                                    if(request.getParameter("username")!=null && request.getParameter("pwd")!=null){
                                        String username = request.getParameter("username");
                                        String email = request.getParameter("email");
                                        String password = request.getParameter("pwd");
                                        int semester = Integer.parseInt(request.getParameter("sem"));
                                        String address = request.getParameter("address");
                                        String branch = request.getParameter("branch");
                                        String gender = request.getParameter("gender");
                                        String hobby= request.getParameter("hobby");
                                        Class.forName("com.mysql.jdbc.Driver");
                                        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","");
                                        Statement stmt=con.createStatement();
                                        stmt.executeQuery("insert into Users values('"+username+"','"+password+"','"+email+"','"+branch+"','"+semester+"','"+gender+"','"+hobby+"','"+address+"')");
                                    }
                                    
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</section>\n");
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
