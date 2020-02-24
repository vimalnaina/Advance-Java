<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<%@include file="../header.jsp" %>

<!-- Heading -->
<div id="heading" >
    <h1>Products</h1>
</div>

<!-- Main -->
<section id="main" class="wrapper">
    <div class="inner">
        <div class="content">

            <!-- Elements -->
            <div class="row">
                <div class="col-12 col-12-medium">

                    <table>
                        <tr>
                            <td>pimage</td>
                            <td>pid</td>
                            <td>pname</td>
                            <td>pstock</td>
                            <td>pprice</td>
                            <td>pdesc</td>
                            <td>delete</td>
                            <td>update</td>
                        </tr>
                        <%
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from product");
        while(rs.next()){
            out.println("<tr>");
            out.println("<td><img src='images/"+rs.getString(6)+"' height='100px' width='100px'></td>");
            out.println("<td>"+rs.getInt(1)+"</td>");
            out.println("<td>"+rs.getString(2)+"</td>");
            out.println("<td>"+rs.getInt(3)+"</td>");
            out.println("<td>"+rs.getInt(4)+"</td>");
            out.println("<td>"+rs.getString(5)+"</td>");
            out.println("<td><a href='deleteProduct.jsp?pid="+rs.getInt(1)+"'><button class='primary'>Delete</button></a></td>");
            out.println("<td><a href='addProduct2.jsp?key="+rs.getInt(1)+"&msg=update'><button class='green'>Update</button></a></td>");
            out.println("</tr>");
        }
                        %>
                        <tr align="center">
                            <td colspan="8">
                                <br/>
                                <a href="addProduct2.jsp?msg=insert"><button class="blue">Add New Product</button></a>
                                <br/><br/>
                            </td>
                        </tr>
                    </table>

                </div>
            </div>
        </div>
    </div>
</section>

<%@include file="../footer.jsp" %>
