<%@page import="java.util.*,com.vvp.web.Products,java.sql.*"%>
<%
if(session.getAttribute("user")!=null){
        if (session.getAttribute("cart") != null) {
            HashMap<Integer, Integer> cartItems = (HashMap<Integer, Integer>) session.getAttribute("cart");
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "");
            Statement stmt = con.createStatement();

            Set<Integer> keys = cartItems.keySet();
            Iterator<Integer> it = keys.iterator();
            int total = 0;
            if (request.getParameter("buy") != null) {
                while (it.hasNext()) {
                    int element = it.next();
                    ResultSet rs = stmt.executeQuery("select * from product where pid='" + element + "'");
                    while (rs.next()) {
                        total = total + (rs.getInt(4) * cartItems.get(element));
                    }

                }
                out.print(total);
                response.sendRedirect("payment.jsp?msg=buy all items");
            }
        }
       }
else{
    response.sendRedirect("login.jsp");
}
%>