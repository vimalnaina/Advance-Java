<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<%
int pid=Integer.parseInt(request.getParameter("pid"));
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "");
Statement stmt = con.createStatement();
int row= stmt.executeUpdate("delete from product where pid='"+pid+"'");
if(row>0){
    response.sendRedirect("products.jsp");
}
%>