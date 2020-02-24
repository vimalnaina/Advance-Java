<%@page import="java.util.*" %>

<%
        int key = Integer.parseInt(request.getParameter("key"));
        HashMap<Integer, Integer> cartItems = (HashMap<Integer, Integer>) session.getAttribute("cart");
        if (request.getParameter("remove") != null) {
            cartItems.remove(key);
            session.setAttribute("cart", cartItems);
        }
        response.sendRedirect("checkout2.jsp");
%>