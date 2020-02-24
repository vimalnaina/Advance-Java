<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>

<%
        int pid = Integer.parseInt(request.getParameter("pid"));
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "");
        Statement stmt = con.createStatement();
        String pname = request.getParameter("pname");
        int pstock = Integer.parseInt(request.getParameter("pstock"));
        //int pprice = Integer.parseInt(request.getParameter("pprice"));
        String pdesc = request.getParameter("pdesc");
        String pimage = request.getParameter("pimage");
        int row = stmt.executeUpdate("update products set pname='" + pname + "', pstock='" + pstock + "', pdesc='" + pdesc + "', pimage='" + pimage + "' where pid='" + pid + "'");
        if (row > 0) {
            response.sendRedirect("products.jsp");
        }
%>