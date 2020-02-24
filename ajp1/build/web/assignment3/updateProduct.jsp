<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<%@include file="../header.jsp" %>

<!-- Heading -->
<div id="heading" >
    <h1>Update Product</h1>
</div>

<!-- Main -->
<section id="main" class="wrapper">
    <div class="inner">
        <div class="content">

            <!-- Elements -->
            <div class="row">
                <div class="col-12 col-12-medium">

                    <%
        int pid = Integer.parseInt(request.getParameter("key"));
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from products where pid='" + pid + "'");
        while (rs.next()) {
            out.println("<form action='updateProduct2.jsp'>");
            out.println("<input type='hidden' name='pid' value='" + pid + "' /><br/>");
            out.println("Product Name: <input type='text' name='pname' value='" + rs.getString(2) + "' /><br/>");
            out.println("Product Stock: <input type='text' name='pstock' value='" + rs.getString(3) + "' /><br/>");
            out.println("Product Price: <input type='text' name='pprice' value='" + rs.getString(4) + "' /><br/>");
            out.println("Product Description: <input type='text' name='pdesc' value='" + rs.getString(5) + "' /><br/>");
            out.println("Product Image: <input type='file' name='pimage'/><br/>");
            out.println("<input type='submit' name='update' value='Update' class='primary' />");
            out.println("</form>");
        }
                    %>

                </div>
            </div>
        </div>
    </div>
</section>

<%@include file="../footer.jsp" %>


