<%@page import="java.util.*,java.sql.*" %>

<%
        int pid = Integer.parseInt(request.getParameter("pid"));
        int qty = Integer.parseInt(request.getParameter("qty"));
        int stock=0;
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "");
        Statement stmt = con.createStatement();
        ResultSet rs=stmt.executeQuery("select pstock from product where pid='"+ pid +"'");
        while(rs.next()){
            stock=rs.getInt(1);
        }
        if (qty > stock) {
            response.sendRedirect("ecommerce2.jsp?msg=product not available");
        }
        else{
        HashMap<Integer, Integer> cartItem = null;
        if (session.getAttribute("cart") != null) {
            cartItem = (HashMap<Integer, Integer>) session.getAttribute("cart");
        } else {
            cartItem = new HashMap<Integer, Integer>();
        }
        cartItem.put(new Integer(pid), new Integer(qty));
        session.setAttribute("cart", cartItem);
        response.sendRedirect("../assignment3/ecommerce2.jsp?msg=Product added successfully");
        }

%>