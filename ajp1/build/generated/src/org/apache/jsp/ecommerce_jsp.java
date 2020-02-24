package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.vvp.web.*;
import java.util.*;
import java.util.*;

public final class ecommerce_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <a href=\"checkout.jsp\"><i class=\"icon fa-cart-plus\">&nbsp;</i>Cart-");
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

        HashMap<Integer, Products> items = new HashMap<Integer, Products>();
        Products product[] = new Products[3];
        product[0] = new Products(1, "Redmi5", 5, 6999);
        product[1] = new Products(2, "Watch", 5, 499);
        product[2] = new Products(3, "AcerTravelmate", 5, 24999);
        if (application.getAttribute("product") != null) {
            items = (HashMap<Integer, Products>) application.getAttribute("product");
        } else {
            for (int i = 0; i < product.length; i++) {
                items.put(new Integer(product[i].pid), product[i]);
                application.setAttribute("product", items);
            }
        }



      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<section id=\"main\" class=\"wrapper\">\n");
      out.write("    <div class=\"container1\">\n");
      out.write("        <div class=\"row1\">\n");
      out.write("            <div class=\"4u\">\n");
      out.write("                <section class=\"special box\">\n");
      out.write("                    <br/><br/>\n");
      out.write("                    <img src=\"images/redmi5.png\" width=\"300px\" height=\"205px\"/>\n");
      out.write("                    <br/><br/><br/>\n");
      out.write("                    <h3>Redmi 5</h3>\n");
      out.write("                    <h3>Price: 6999 INR</h3>\n");
      out.write("                    <p>Ram: 4 GB<br/>Internal Storage: 64 GB<br/>Battery: 4000 mah<br/>Processor: Snapdragon 450</p>\n");
      out.write("                    <br/><br/>\n");
      out.write("                    <form method=\"post\" action=\"addToCart.jsp\">\n");
      out.write("                        <div class=\"row gtr-uniform\">\n");
      out.write("                            <div class=\"col-6 col-12-xsmall\">\n");
      out.write("                                <input type=\"text\" name=\"qty\" placeholder=\"Quantity\" value=\"1\"/>\n");
      out.write("                                <input type=\"hidden\" name=\"pid\" value=\"1\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-6\">\n");
      out.write("                                <ul class=\"actions\">\n");
      out.write("                                    <li><input type=\"submit\" value=\"Add To Cart\" class=\"primary\" /></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </section>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"4u\">\n");
      out.write("                <section class=\"special box\">\n");
      out.write("                    <br/><br/>\n");
      out.write("                    <img src=\"images/watch.png\" width=\"150px\" height=\"200px\"/>\n");
      out.write("                    <br/><br/><br/>\n");
      out.write("                    <h3>Watch</h3>\n");
      out.write("                    <h3>Price: 499 INR</h3>\n");
      out.write("                    <p>Type: Analog<br/>Material: Rubber<br/>Shape: Round<br/>Water Resistance: 30mtr</p>\n");
      out.write("                    <br/><br/>\n");
      out.write("                    <form method=\"post\" action=\"addToCart.jsp\">\n");
      out.write("                        <div class=\"row gtr-uniform\">\n");
      out.write("                            <div class=\"col-6 col-12-xsmall\">\n");
      out.write("                                <input type=\"text\" name=\"qty\" placeholder=\"Quantity\" value=\"1\"/>\n");
      out.write("                                <input type=\"hidden\" name=\"pid\" value=\"2\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-6\">\n");
      out.write("                                <ul class=\"actions\">\n");
      out.write("                                    <li><input type=\"submit\" value=\"Add To Cart\" class=\"primary\" /></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </section>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"4u\">\n");
      out.write("                <section class=\"special box\">\n");
      out.write("                    <br><br>\n");
      out.write("                    <img src=\"images/laptop.png\" width=\"250px\" height=\"180px\"/>\n");
      out.write("                    <br/><br/><br/>\n");
      out.write("                    <h3>Acer Travelmate</h3>\n");
      out.write("                    <h3>Price: 24999 INR</h3>\n");
      out.write("                    <p>Ram: 4 GB<br>Hdd: 1 TB<br>Processor: intel i3<br>Graphics: nVidia graphics<br>Display: 14\" HD display</p>\n");
      out.write("                    <br><br>\n");
      out.write("                    <form method=\"post\" action=\"addToCart.jsp\">\n");
      out.write("                        <div class=\"row gtr-uniform\">\n");
      out.write("                            <div class=\"col-6 col-12-xsmall\">\n");
      out.write("                                <input type=\"text\" name=\"qty\" placeholder=\"Quantity\" value=\"1\"/>\n");
      out.write("                                <input type=\"hidden\" name=\"pid\" value=\"3\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-6\">\n");
      out.write("                                <ul class=\"actions\">\n");
      out.write("                                    <li><input type=\"submit\" value=\"Add To Cart\" class=\"primary\" /></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </section>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("\n");
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
