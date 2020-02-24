<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<%@include file="../header.jsp" %>

<!-- Heading -->
<div id="heading" >
    <h1>Login</h1>
</div>
<div align="center">
    <font color="green" size="4px">
        <br>
        <%
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
        %>
    </font>
</div>

<!-- Main -->
<section id="main" class="wrapper">
    <div class="inner">
        <div class="content">

            <!-- Elements -->
            <div class="row">
                <div class="col-6 col-12-medium">

                    <!-- Form -->
                    <form method="post" action="">
                        <div class="row gtr-uniform">
                            <div class="col-6 col-12-xsmall">
                                <input type="text" name="username" placeholder="Username" />
                            </div>
                            <div class="col-6 col-12-xsmall">
                                <input type="password" name="pwd" placeholder="Password" />
                            </div>
                            <!-- Break -->
                            <div class="col-12">
                                <ul class="actions">
                                    <li><input type="submit" value="Login" class="primary" /></li>
                                    <li><input type="reset" value="Reset" /></li>
                                </ul>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</section>

<%@include file="../footer.jsp" %>
