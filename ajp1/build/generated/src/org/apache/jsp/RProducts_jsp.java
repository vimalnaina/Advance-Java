package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.vvp.web.*;
import java.util.*;

public final class RProducts_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("\"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
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
      out.write("\n");
      out.write("<div class=\"slider_area\">\n");
      out.write("    <div class=\"slider_active owl-carousel\">\n");
      out.write("\n");
      out.write("        <div class=\"single_slider  d-flex align-items-center slider_bg_1 black_overlay\"style=\"height:1700px;padding-top:50px;\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row align-items-center\">\n");
      out.write("                    <div class=\"col-xl-12 col-md-12\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");


        RProducts p[] = new RProducts[3];
        p[0] = new RProducts(1, "Samsung Galaxy s10", 5, 10000.0, "desc1");

        p[1] = new RProducts(2, "Samsung Galaxy s", 5, 1000.0, "desc2");

        p[2] = new RProducts(3, "Samsung Galaxy ", 5, 100.0, "desc3");


        HashMap<Integer, RProducts> product = new HashMap<Integer, RProducts>();

        
            
            if (application.getAttribute("product")!=null) {
                product = (HashMap<Integer, RProducts>)application.getAttribute("product");
            }
            else{
                for (int i = 0; i < p.length; i++) {
                    product.put(new Integer(p[i].pId), p[i]);
                    application.setAttribute("product", product);
                }
            }
            

        


      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Start Portfolio Section -->\n");
      out.write("<section id=\"portfolio\" class=\"portfolio-section-1\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-12\">\n");
      out.write("\n");
      out.write("                <!-- Start Portfolio items -->\n");
      out.write("                <ul id=\"portfolio-list\">\n");
      out.write("                    <li>\n");
      out.write("                        <div class=\"portfolio-item\">\n");
      out.write("\n");
      out.write("                            ");

        if (request.getParameter("msg") != null) {
            out.println(request.getParameter("msg"));
        }
                            
      out.write("\n");
      out.write("                            <img src=\"img/2.png\" class=\"img-responsive\" alt=\"\" />\n");
      out.write("                            <div class=\"portfolio-caption\">\n");
      out.write("                                <h4 align=\"center\">Model : Samsung Galaxy s10<br/>Price : 54,899.00</h4>\n");
      out.write("                                <a href=\"RAddToCart.jsp\" data-toggle=\"modal\" class=\"link-1\"><i class=\"fa fa-magic\"></i></a>\n");
      out.write("                                <form action=\"RAddToCart.jsp\" method=\"get\">\n");
      out.write("\n");
      out.write("                                    <input type =\"number\" name=\"qty\" value=\"1\" >\n");
      out.write("                                    <input type=\"hidden\" name=\"pid\" value=\"1\">\n");
      out.write("                                    <input type=\"submit\" name=\"AddToCart\" value=\"AddToCart\">\n");
      out.write("\n");
      out.write("                                </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <a href=\"#\" class=\"link-2\"><i class=\"fa fa-link\"></i></a>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"portfolio-modal\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <div class=\"portfolio-item\">\n");
      out.write("                            <img src=\"img/1.png\" class=\"img-responsive\" alt=\"\" />\n");
      out.write("                            <div class=\"portfolio-caption\">\n");
      out.write("                                \n");
      out.write("                                  <h4 align=\"center\">Model : Samsung Galaxy s10<br/>Price : 54,899.00</h4>\n");
      out.write("                                <a href=\"RAddToCart.jsp\" data-toggle=\"modal\" class=\"link-1\"><i class=\"fa fa-magic\"></i></a>\n");
      out.write("                                <form action=\"RAddToCart.jsp\" method=\"get\">\n");
      out.write("\n");
      out.write("                                    <input type =\"number\" name=\"qty\" value=\"1\" >\n");
      out.write("                                    <input type=\"hidden\" name=\"pid\" value=\"1\">\n");
      out.write("                                    <input type=\"submit\" name=\"AddToCart\" value=\"AddToCart\">\n");
      out.write("\n");
      out.write("                                </form>\n");
      out.write("\n");
      out.write("                                <a href=\"#portfolio-modal\" data-toggle=\"modal\" class=\"link-1\"><i class=\"fa fa-magic\"></i></a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <a href=\"#\" class=\"link-2\"><i class=\"fa fa-link\"></i></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <div class=\"portfolio-item\">\n");
      out.write("                            <img src=\"img/3.png\" class=\"img-responsive\" alt=\"\" />\n");
      out.write("                            <div class=\"portfolio-caption\">\n");
      out.write("                                <h4 align=\"center\">Model : Samsung Galaxy s10<br/>Price : 54,899.00</h4>\n");
      out.write("                                <a href=\"RAddToCart.jsp\" data-toggle=\"modal\" class=\"link-1\"><i class=\"fa fa-magic\"></i></a>\n");
      out.write("                                <form action=\"RAddToCart.jsp\" method=\"get\">\n");
      out.write("\n");
      out.write("                                    <input type =\"number\" name=\"qty\" value=\"1\" >\n");
      out.write("                                    <input type=\"hidden\" name=\"pid\" value=\"1\">\n");
      out.write("                                    <input type=\"submit\" name=\"AddToCart\" value=\"AddToCart\">\n");
      out.write("\n");
      out.write("                                </form>\n");
      out.write("                                <a href=\"#portfolio-modal\" data-toggle=\"modal\" class=\"link-1\"><i class=\"fa fa-magic\"></i></a>\n");
      out.write("                                <a href=\"#\" class=\"link-2\"><i class=\"fa fa-link\"></i></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("                <!-- End Portfolio items -->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!-- End Portfolio Section -->\n");
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
