package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class registration_005fJDBC_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    public String emailValidation(String email) {

        if (email.isEmpty()) {
            return "Email Field Empty!!!";
        }

        int firstCharUniCode = email.codePointAt(0);
        if (!((firstCharUniCode >= 48 && firstCharUniCode <= 57) || (firstCharUniCode >= 97 && firstCharUniCode <= 122))) {
            return "Not ValidateEmail,Your first Letter must be small";
        }
        String emailPart[] = email.split("@");
        int emailNameLength = emailPart[0].length();

        if (emailNameLength <= 8 || emailNameLength >= 20) {
            return "Not ValidateEmail,Username Length between 8 to 20";
        }
        for (int i = 1; i < emailNameLength; i++) {
            int charUniCode = emailPart[0].codePointAt(i);
            //Ascii Code= (48 to 57-> 0 to 9),(46->.),(95->_),(45->-)
            if (!((charUniCode >= 48 && charUniCode <= 57) || (charUniCode >= 65 && charUniCode <= 90) || (charUniCode >= 97 && charUniCode <= 122) || (charUniCode == 46) || (charUniCode == 95) || (charUniCode == 45))) {
                return "Not ValidateEmail,Only a-z, A-z, 0 to 9 and underscore, - and dot are valid";
            }
        }
        int atPosition = email.indexOf('@');
        if (atPosition == -1) {
            return "Not ValidateEmail,Atleast One '@' is required!!";
        }
        if (atPosition != -1) {
            int dotPosition = email.indexOf('.');
            if (dotPosition == -1) {
                return "Not ValidateEmail,Domain name is required";
            }
            if (dotPosition != -1) {
                if (dotPosition - atPosition <= 3) {
                    return "Not ValidateEmail,Distance between @ and . must be more than 2";
                }
            }
        }
        return "Valid Email Adreess";

    }

    public boolean passwordValidation(String pwd) {
        boolean flag;
        int intCounter = 0, charCounter = 0, specialCounter = 0;
        if (pwd.length() >= 6 && pwd.length() <= 20) {
            for (int i = 0; i < pwd.length(); i++) {
                if (pwd.charAt(i) >= '0' && pwd.charAt(i) <= '9') {
                    intCounter++;
                } else if (pwd.charAt(i) >= 'A' && pwd.charAt(i) <= 'Z') {
                    charCounter++;
                } else if (!(pwd.charAt(i) >= 'a' && pwd.charAt(i) <= 'z')) {
                    specialCounter++;
                }
            }
            if (intCounter < 1 || charCounter < 1 || specialCounter < 1) {
                flag = false;
            } else {
                flag = true;
            }
        } else {
            flag = false;
        }
        return flag;

    }

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
      response.setContentType("text/html");
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
      out.write("<section>\n");
      out.write("    <main id=\"main\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            \n");
      out.write("\n");
      out.write("\n");
      out.write("            <div align=\"center\">\n");
      out.write("                <div class=\"col-7\">\n");
      out.write("                    <br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>\n");

        if (request.getParameter("submit") != null) {

            String firstname = request.getParameter("name");
            String password = request.getParameter("pwd");
            String email = request.getParameter("email");
            String cpassword = request.getParameter("cpwd");
            String phoneNo = request.getParameter("mobile");
            String sem = request.getParameter("sem");
            String branch = request.getParameter("branch");
            String gender = request.getParameter("gender");
            String hobbies[] = request.getParameterValues("hobbies[]");
            String address = request.getParameter("address");
            String msg = "";

            if (firstname.length() >= 6 && firstname.length() <= 20) {
                //Confirm Password Validate
                if (password.equals(cpassword)) {
                    //Password Validate
                    if (passwordValidation(password)) {
                        //Email Validate
                        String em = emailValidation(email);
                        if (em.equals("Valid Email Adreess")) {
                            //phone number Validate
                            if (phoneNo.length() >= 10 && phoneNo.length() <= 11) {
                                //hobbies Validate
                                if (!(hobbies == null || hobbies.length < 3)) {
                                    //address Validate
                                    String addressLine[] = address.split("\n");
                                    if (!(addressLine == null || addressLine.length < 3)) {
                                        msg = "Successfully";
                                        //out.println("<script>alert('Registered Successfully')</script>");
                                    //out.print("<h1>Registered Successfully</h1>");
                                    } else {
                                        out.println("<script>alert('Invalid Address At Least Contains 3 Address Line')</script>");
                                    //out.print("<h1>Invalid Address At Least Contains 3 Address Line</h1>");
                                    }
                                } else {
                                    out.println("<script>alert('Please Select Atleast 3 Hobbies')</script>");
                                //out.print("<h1>Please Select Atleast 3 Hobbies</h1>");
                                }
                            } else {
                                out.println("<script>alert('Invalid Phone Number')</script>");
                            //out.print("<h1>Invalid Phone Number</h1>");
                            }
                        } else {
                            out.println("<script>alert('" + em + "')</script>");
                        //out.println(em);
                        }
                    } else {
                        out.println("<script>alert('Invalid Passowrd')</script>");
                    //out.println("<h1>Invalid Passowrd</h1>");
                    }
                } else {
                    out.println("<script>alert('Password & Confirm Password Does not Match ')</script>");
                //out.println("alert('Login Sucessfully!!')");
                //out.print("<script>alert('Password & Confirm Password Doesn't Match')</script>");
                }
            } else {
                out.println("<script>alert('Invalid Username')</script>");
            //out.println("<h1>Invalid Username</h1>");
            }


            String datahobbies = "";

            for (int i = 0; i < hobbies.length; i++) {
                datahobbies += hobbies[i] + ",";
            }


            if (msg == "Successfully") {
                out.println("All Parameters are correct!");
                Class.forName("com.mysql.jdbc.Driver");
                out.println("Driver loaded...");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "");
                out.println("Connection Established...");
                /*String query = "INSERT INTO user" +
                        "  (name, password, cpassword, email, mobilenum, sem , branch, gender, hobbies, address ) VALUES " +
                        " (?, ?, ?, ?, ?, ?, ?, ?, ?, ? );";

                //int countQuery = 0;

                PreparedStatement pstmt = con.prepareStatement(query);
                pstmt.setString(1, firstname);
                pstmt.setString(2, password);
                pstmt.setString(3, cpassword);
                pstmt.setString(4, email);
                pstmt.setString(5, phoneNo);
                pstmt.setString(6, sem);
                pstmt.setString(7, branch);
                pstmt.setString(8, gender);
                pstmt.setString(9, datahobbies);
                pstmt.setString(10, address);*/
                Statement stmt = con.createStatement();
                stmt.executeUpdate("Insert into user2 values ('"+firstname+"','"+password+"','"+cpassword+"','"+email+"','"+phoneNo+"','"+sem+"','"+branch+"','"+gender+"','"+datahobbies+"','"+address+"')");
                out.println("Value Inserted...");
            /* countQuery = pstmt.executeUpdate();

            if (countQuery != 0) {
            out.println("<script>alert('" + countQuery + "Updated..')</script>");
            //out.println(countQuery+"Updated... ");

            } else {
            out.println("<script>alert('Error...')</script>");
            }*/
            }
        }

      out.write("\n");
      out.write("                    <div class=\"form\">\n");
      out.write("                        <form action=\" \" method=\"post\">\n");
      out.write("                            <u><font style=\" font-family:sans-serif;\" size=7>Registration Form</font></u><br/><br/>\n");
      out.write("                            <div>\n");
      out.write("                                <font style=\" font-family:sans-serif;\">Name:</font>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"name\"  ><br/>\n");
      out.write("\n");
      out.write("                            </div><div>\n");
      out.write("                                <font style=\" font-family:sans-serif;\">Password:</font>\n");
      out.write("                                <input type=\"password\" class=\"form-control\" name=\"pwd\"><br/>\n");
      out.write("                            </div><div>\n");
      out.write("                                <font style=\" font-family:sans-serif;\">Confirm Password:</font>\n");
      out.write("                                <input type=\"password\" class=\"form-control\" name=\"cpwd\"><br/>\n");
      out.write("                            </div><div>\n");
      out.write("                                <font style=\" font-family:sans-serif;\">Email:</font>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"email\"><br/>\n");
      out.write("                            </div><div>\n");
      out.write("                                <font style=\" font-family:sans-serif;\">Mobile No:</font>\n");
      out.write("                                <input type=\"tel\" class=\"form-control\" name=\"mobile\"><br/>\n");
      out.write("                            </div><div>\n");
      out.write("                                <font style=\" font-family:sans-serif;\">Semester:</font>\n");
      out.write("                                <select id=\"sem\" name=\"sem\" >\n");
      out.write("                                    <option>1</option>\n");
      out.write("                                    <option>2</option>\n");
      out.write("                                    <option>3</option>\n");
      out.write("                                    <option>4</option>\n");
      out.write("                                    <option>5</option>\n");
      out.write("                                    <option>6</option>\n");
      out.write("                                    <option>7</option>\n");
      out.write("                                    <option>8</option>\n");
      out.write("                                </select><br/><br/>\n");
      out.write("                            </div><div>\n");
      out.write("                                <font style=\" font-family:sans-serif;\">Branch:</font>\n");
      out.write("                                <select id=\"branch\" name=\"branch\" >\n");
      out.write("                                    <option>Computer</option>\n");
      out.write("                                    <option>IT</option>\n");
      out.write("                                    <option>EC</option>\n");
      out.write("                                    <option>EEE</option>\n");
      out.write("                                    <option>Civil</option>\n");
      out.write("                                    <option>Mechanical</option>\n");
      out.write("                                    <option>Bio-Tech</option>\n");
      out.write("                                    <option>Neno-Tech</option>\n");
      out.write("                                    <option>Chemical</option>\n");
      out.write("                                </select><br/><br/>\n");
      out.write("                            </div><div>\n");
      out.write("                                <font style=\" font-family:sans-serif;\">Gender:</font>\n");
      out.write("                                <input type=\"radio\" id=\"gender-male\" name=\"gender\" value=\"male\" checked>\n");
      out.write("                                <label for=\"gender-male\">Male</label>\n");
      out.write("                                <input type=\"radio\" id=\"gender-female\" name=\"gender\" value=\"female\">\n");
      out.write("                                <label for=\"gender-female\">Female</label>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </div><div>\n");
      out.write("                                <font style=\" font-family:sans-serif;\">Hobbies:</font>\n");
      out.write("                                <input type=\"checkbox\" id=\"1\" name=\"hobbies[]\" value=\"Sports\"><label for=\"1\">Sports</label><br/>\n");
      out.write("                                <input type=\"checkbox\" id=\"2\" name=\"hobbies[]\" value=\"Reading\"><label for=\"2\">Readiing</label><br/>\n");
      out.write("                                <input type=\"checkbox\" id=\"3\" name=\"hobbies[]\" value=\"Travelling\"><label for=\"3\">Travelling</label><br/>\n");
      out.write("                                <input type=\"checkbox\" id=\"4\" name=\"hobbies[]\" value=\"Tv\"><label for=\"4\">TV Watching</label><br/>\n");
      out.write("                                <input type=\"checkbox\" id=\"5\" name=\"hobbies[]\" value=\"other\"><label for=\"5\"> Other</label><br/><br/>\n");
      out.write("                            </div><div>\n");
      out.write("                                <font style=\" font-family:sans-serif;\">Address:</font>\n");
      out.write("                                <td><textarea class=\"form-control\" name=\"address\"></textarea><br/>\n");
      out.write("                            </div><div>\n");
      out.write("                                <input type=\"submit\" name=\"submit\" value=\"Submit\" class=\"form-control\" style=\"background-color:green; color:white\">\n");
      out.write("                                <input type=\"reset\" name=\"reset\" value=\"Reset\" class=\"form-control\" style=\"background-color:red; color:white\" >\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </main>\n");
      out.write("</section>\n");
      out.write("\n");
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
