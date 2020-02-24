<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<%@include file="../header.jsp" %>

<!-- Heading -->
<div id="heading" >
    <h1>E-Commerce</h1>
</div>

<div align="center">
    <font color="green" size="4px">
        <br/>
        <%
        if (request.getParameter("msg") != null) {
            out.println(request.getParameter("msg"));
        }
        %>
    </font>
</div>

<div class="inner">
    <div class="content">
        <div class="row">
            <div class="col-12">
                <form method="post" action="">
                    <div class="row gtr-uniform">
                        <div class="col-4 col-12-xsmall">
                            <select name="srchby">
                                <option value="">- Search By -</option>
                                <option value="name">Name</option>
                                <option value="desc">Description</option>
                            </select>
                        </div>
                        <div class="col-5 col-12-xsmall">
                            <input type="text" name="search" placeholder="Search Product" />
                        </div>
                        <!-- Break -->
                        <div class="col-2 col-12-xsmall">
                            <ul class="actions">
                                <li><input type="submit" value="Search" class="primary" /></li>
                            </ul>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>

<section id="main" class="wrapper">
    <div class="container1">
        <div class="row1">

            <%

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from product");
        if (request.getParameter("search") != null) {
            String srchBy = request.getParameter("srchby");
            String search = request.getParameter("search");
            if (srchBy.equals("name")) {
                rs = stmt.executeQuery("SELECT * FROM `product` WHERE pname LIKE '%" + search + "%'");
            }
            if (srchBy.equals("desc")) {
                rs = stmt.executeQuery("SELECT * FROM `product` WHERE pdesc LIKE '%" + search + "%'");
            }
        }
        while (rs.next()) {

            out.println("<div class='4u'>");
            out.println("<section class='special box'>");
            out.println("<img src='../images/" + rs.getString(6) + "'/>");
            out.println("<br/><br/><h3>" + rs.getString(2) + "</h3>");
            out.println("<h3>Price: " + rs.getInt(4) + " INR</h3>");
            out.println("<p>" + rs.getString(5) + "</p>");
            out.println("<br/><br/>");
            out.println("<form method='post' action='addToCart2.jsp'>");
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

            %>

        </div>
    </div>
</section>