<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<%@include file="../header.jsp" %>
<%
        String msg = "";
        if (request.getParameter("msg") != null) {
            msg = request.getParameter("msg");
        }
%>
<!-- Heading -->
<div id="heading" >
    <h1><%=msg%> Product</h1>
</div>

<%
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

            int row = stmt.executeUpdate("insert into product(pname, pstock, pprice, pdesc, pimage) values ('" + ins_pname + "','" + ins_pstock + "','" + ins_pprice + "','" + ins_pdesc + "','" + ins_pimage + "')");
            if (row > 0) {
                response.sendRedirect("products.jsp");
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
            ResultSet rs = stmt.executeQuery("select * from product where pid='" + key + "'");
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
                int row = stmt.executeUpdate("update product set pname='" + pname + "', pstock='" + pstock + "', pprice='" + pprice + "', pdesc='" + pdesc + "', pimage='" + pimage + "' where pid='" + key + "'");
        if (row > 0) {
            response.sendRedirect("products.jsp");
        }
                //response.sendRedirect("updateProduct2.jsp?pid=" + key + "&pname=" + pname + "&pstock=" + pstock + "&pprice=" + pprice + " &pdesc=" + pdesc + "&pimage=" + pimage + "");
            }
        }

%>

<!-- Main -->
<section id="main" class="wrapper">
    <div class="inner">
        <div class="content">

            <!-- Elements -->
            <div class="row">
                <div class="col-12 col-12-medium">

                    <!-- Form -->
                    <form method="post" action="">
                        <div class="row gtr-uniform">
                            <div class="col-12 col-12-xsmall">
                                <span>Product Name</span>
                                <input type="text" name="pname" value="<%=pname%>"  />
                            </div>
                            <div class="col-12 col-12-xsmall">
                                <span>Product Stock</span>
                                <input type="text" name="pstock" value="<%=pstock%>"  />
                            </div>
                            <div class="col-12 col-12-xsmall">
                                <span>Product Price</span>
                                <input type="text" name="pprice" value="<%=pprice%>"  />
                            </div>
                            <div class="col-12 col-12-xsmall">
                                <span>Product Description</span>
                                <input type="text" name="pdesc" value="<%=pdesc%>" />
                            </div>
                            <div class="col-12 col-12-xsmall">
                                <span>Product Image: </span><input type="file" name="pimage"  />
                            </div>
                            <!-- Break -->
                            <div class="col-12">
                                <ul class="actions">
                                    <li><input type="submit" name="add" value="Add" class="primary" /></li>
                                    <li><input type="submit" name="upd" value="Update" class="primary" /></li>
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
