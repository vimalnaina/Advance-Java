<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<%@include file="../header.jsp" %>

<!-- Heading -->
<div id="heading" >
    <h1>Add New Products</h1>
</div>

<%
        
        if (request.getParameter("pid") != null) {
            int pid = Integer.parseInt(request.getParameter("pid"));
            String pname = request.getParameter("pname");
            int pstock = Integer.parseInt(request.getParameter("pstock"));
            int pprice = Integer.parseInt(request.getParameter("pprice"));
            String pdesc = request.getParameter("pdesc");
            String pimage = request.getParameter("pimage");

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "");
            Statement stmt = con.createStatement();
            int row = stmt.executeUpdate("insert into product values ('" + pid + "','" + pname + "','" + pstock + "','" + pprice + "','" + pdesc + "','" + pimage + "')");
            if (row > 0) {
                out.println("product added successfully!");
            }
        }
%>

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
                            <div class="col-8 col-12-xsmall">
                                <input type="text" name="pid" placeholder="Enter Product Id" />
                            </div>
                            <div class="col-8 col-12-xsmall">
                                <input type="text" name="pname" placeholder="Enter Product Name" />
                            </div>
                            <div class="col-8 col-12-xsmall">
                                <input type="text" name="pstock" placeholder="Enter Product Stock" />
                            </div>
                            <div class="col-8 col-12-xsmall">
                                <input type="text" name="pprice" placeholder="Enter Product Price" />
                            </div>
                            <div class="col-8 col-12-xsmall">
                                <textarea name="pdesc" placeholder="Enter Product Description" ></textarea>
                            </div>
                            <div class="col-8 col-12-xsmall">
                                <span>Product Image: </span><input type="file" name="pimage"  />
                            </div>
                            <!-- Break -->
                            <div class="col-12">
                                <ul class="actions">
                                    <li><input type="submit" value="Add" class="primary" /></li>
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
