package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.vvp.web.*;
import java.util.*;

public final class RCheckOut_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
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
        if (session.getAttribute("cart1") != null) {
            HashMap<Integer, Integer> cartItem = (HashMap<Integer, Integer>) session.getAttribute("cart1");
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
      out.write("\n");
      out.write("<!-- slider_area_start -->\n");
      out.write("<div class=\"slider_area\">\n");
      out.write("    <div class=\"slider_active owl-carousel\">\n");
      out.write("\n");
      out.write("        <div class=\"single_slider  d-flex align-items-center slider_bg_1 black_overlay\" style=\"height:1000px;padding-top:50px;\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row align-items-center\">\n");
      out.write("                    <div class=\"col-xl-12 col-md-12\">\n");
      out.write("                        ");

        if (session.getAttribute("cart1") != null) {
            int srNo = 1;
            HashMap<Integer, Integer> cartItems = (HashMap<Integer, Integer>) session.getAttribute("cart1");
            HashMap<Integer, RProducts> items = (HashMap<Integer, RProducts>) application.getAttribute("product");
            Set<Integer> pid = cartItems.keySet();
            Iterator<Integer> id = pid.iterator();
            out.println("<table border='1' class='table table-hover table-dark'>");
            out.println("<tr align='center'>");
            out.println("<th>Sr No.</th>");
            out.println("<th>Name of Product</th>");
            out.println("<th>Quantity</th>");
            out.println("<th>Price</th>");
            out.println("<th>Remove</th>");
            out.println("<th>Buy</th>");
            out.println("</tr>");

            while (id.hasNext()) {
            int element = id.next();
                 out.println("<tr>");
                    out.println("<td>" + (srNo++) + "</td>");
                    out.println("<td>" + items.get(element).pName + "</td>");
                    out.println("<td>" + cartItems.get(element) + "</td>");
                    out.println("<td>" + (items.get(element).price * cartItems.get(element)) + "</td>");
                    out.println("<td>");
                    out.println("<form action='removeProduct.jsp'>");
                    out.println("<input type='hidden' name='key' value='" + element + "'>");
                    out.println("<input type='submit' name='remove' value='Remove' class='primary'>");
                    out.println("</form>");
                    out.println("</td>");
                    out.println("<td>");
                    out.println("<form action='buySingle.jsp'>");
                    out.println("<input type='hidden' name='key' value='" + element + "'>");
                    out.println("<input type='submit' name='buysingle' value='Buy' >");
                    out.println("</form>");
                    out.println("</td>");
                    out.println("</tr>");
            }
        }
    /*while (id.hasNext()) {
    int p = id.next();
    //total = (Products.get(p).price + cartItems.get(p));
    // grandTotal += total;
    out.println(items.get(p).getPName());
    /*   out.println("<tr><td>" + (srNo++) + "</td>");
    out.println("<td>" + Products.get(p).pName + "</td>");
    out.println("<td>" + cartItems.get(p) + "</td>");
    out.println("<td>" + grandTotal + "</td>");
    out.println("<td><form action='RemoveProduct.jsp'>");
    out.println("<input type='hidden' name='pid' value='"+p+"'>");
    out.println("<input type='submit' name='remove' value='Remove'>");
    out.println("</form></td></tr>");
    }
    out.println("</table>");
    out.println("<h3>Final Total:" + grandTotal + "</h3>");

    }
    else{
    out.println("There Is No Items In Cart...!!");
    }
    }*/

                        
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!-- slider_area_end -->\n");
      out.write("\n");
      out.write("\n");
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
