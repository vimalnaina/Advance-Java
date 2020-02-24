<%@page import="java.util.*,java.sql.*" %>

<%
        if (session.getAttribute("user") != null) {
            int key = Integer.parseInt(request.getParameter("key"));
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from product where pid='" + key + "'");
            HashMap<Integer, Integer> cartItems = (HashMap<Integer, Integer>) session.getAttribute("cart");
            if (request.getParameter("buysingle") != null) {
                while (rs.next()) {
                    int price = rs.getInt("pprice") * cartItems.get(key);
                }
                response.sendRedirect("payment.jsp?key=" + key);
            }
        } else {
            response.sendRedirect("../assignment1/login.jsp");
        }
%>