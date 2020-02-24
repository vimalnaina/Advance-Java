<%@page import="java.util.*,com.vvp.web.Products"%>
<%
        HashMap<Integer, Integer> cartItems = (HashMap<Integer, Integer>) session.getAttribute("cart");
        HashMap<Integer, Products> items = (HashMap<Integer, Products>) application.getAttribute("product");
        Set<Integer> keys = cartItems.keySet();
        Iterator<Integer> it = keys.iterator();
        double total = 0.0;
        if (request.getParameter("buy") != null) {
            while (it.hasNext()) {
                int element = it.next();
                total = total + (items.get(element).price * cartItems.get(element));
            }
            response.sendRedirect("payment.jsp");
        }
%>