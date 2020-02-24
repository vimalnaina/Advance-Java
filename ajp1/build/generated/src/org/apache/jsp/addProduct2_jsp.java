package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class addProduct2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <a href=\"#menu\">Menu</a>\n");
      out.write("        <a href=\"checkout2.jsp\"><i class=\"icon fa-cart-plus\">&nbsp;</i>Cart-");
      out.print(count);
      out.write("</a>\n");
      out.write("        <a>Hi, ");
      out.print(uname);
      out.write("</a>\n");
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
      out.write('\n');

        String msg = "";
        if (request.getParameter("msg") != null) {
            msg = request.getParameter("msg");
        }

      out.write("\n");
      out.write("<!-- Heading -->\n");
      out.write("<div id=\"heading\" >\n");
      out.write("    <h1>");
      out.print(msg);
      out.write(" Product</h1>\n");
      out.write("</div>\n");
      out.write("\n");

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "");
        Statement stmt = con.createStatement();


//Insert Data
        if (msg.equals("insert") && request.getParameter("add") != null) {
            String ins_pname = request.getParameter("pname");
            int ins_pstock = Integer.parseInt(request.getParameter("pstock"));
            int ins_pprice = Integer.parseInt(request.getParameter("pprice"));
            String ins_pdesc = request.getParameter("pdesc");
            String ins_pimage = request.getParameter("pimage");

            int row = stmt.executeUpdate("insert into products(pname, pstock, pprice, pdesc, pimage) values ('" + ins_pname + "','" + ins_pstock + "','" + ins_pprice + "','" + ins_pdesc + "','" + ins_pimage + "')");
            if (row > 0) {
                out.println("product added successfully!");
            }
        }

//Update Data
        String pname = "";
        int pstock = 0;
        int pprice = 0;
        String pdesc = "";
        String pimage = request.getParameter("pimage");
        if (msg.equals("update")) {
            int key = Integer.parseInt(request.getParameter("key"));
            ResultSet rs = stmt.executeQuery("select * from products where pid='" + key + "'");
            while (rs.next()) {
                pname = rs.getString(2);
                pstock = rs.getInt(3);
                pprice = rs.getInt(4);
                pdesc = rs.getString(5);
            }

            if (request.getParameter("upd") != null) {
                pname = request.getParameter("pname");
                pstock = Integer.parseInt(request.getParameter("pstock"));
                pprice = Integer.parseInt(request.getParameter("pprice"));
                pdesc = request.getParameter("pdesc");
                pimage = request.getParameter("pimage");
                response.sendRedirect("updateProduct2.jsp?pid=" + key + "&pname=" + pname + "&pstock=" + pstock + "&pprice=" + pprice + " &pdesc=" + pdesc + "&pimage=" + pimage + "");
            }
        }


      out.write("\n");
      out.write("\n");
      out.write("<!-- Main -->\n");
      out.write("<section id=\"main\" class=\"wrapper\">\n");
      out.write("    <div class=\"inner\">\n");
      out.write("        <div class=\"content\">\n");
      out.write("\n");
      out.write("            <!-- Elements -->\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-12 col-12-medium\">\n");
      out.write("\n");
      out.write("                    <!-- Form -->\n");
      out.write("                    <form method=\"post\" action=\"\">\n");
      out.write("                        <div class=\"row gtr-uniform\">\n");
      out.write("                            <div class=\"col-8 col-12-xsmall\">\n");
      out.write("                                <span>Product Name</span>\n");
      out.write("                                <input type=\"text\" name=\"pname\" value=\"");
      out.print(pname);
      out.write("\"  />\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-8 col-12-xsmall\">\n");
      out.write("                                <span>Product Stock</span>\n");
      out.write("                                <input type=\"text\" name=\"pstock\" value=\"");
      out.print(pstock);
      out.write("\"  />\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-8 col-12-xsmall\">\n");
      out.write("                                <span>Product Price</span>\n");
      out.write("                                <input type=\"text\" name=\"pprice\" value=\"");
      out.print(pprice);
      out.write("\"  />\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-8 col-12-xsmall\">\n");
      out.write("                                <span>Product Description</span>\n");
      out.write("                                <input type=\"text\" name=\"pdesc\" value=\"");
      out.print(pdesc);
      out.write("\" />\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-8 col-12-xsmall\">\n");
      out.write("                                <span>Product Image: </span><input type=\"file\" name=\"pimage\"  />\n");
      out.write("                            </div>\n");
      out.write("                            <!-- Break -->\n");
      out.write("                            <div class=\"col-12\">\n");
      out.write("                                <ul class=\"actions\">\n");
      out.write("                                    <li><input type=\"submit\" name=\"add\" value=\"Add\" class=\"primary\" /></li>\n");
      out.write("                                    <li><input type=\"submit\" name=\"upd\" value=\"Update\" class=\"primary\" /></li>\n");
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
