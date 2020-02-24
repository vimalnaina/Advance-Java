<%@page import="java.util.*,com.vvp.web.Products" %>

<%
        int key = Integer.parseInt(request.getParameter("key"));
        int qty = Integer.parseInt(request.getParameter("qty"));
        HashMap<Integer, Integer> cartItems = (HashMap<Integer, Integer>) session.getAttribute("cart");
        HashMap<Integer, Products> items = (HashMap<Integer, Products>) application.getAttribute("product");
        if (request.getParameter("buysingle") != null) {
            int price = (items.get(key).price * cartItems.get(key));
            response.sendRedirect("payment.jsp");
        }

%>