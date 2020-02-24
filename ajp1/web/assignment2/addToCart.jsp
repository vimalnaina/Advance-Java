<%@page import="java.util.*" %>

<%
        int pid = Integer.parseInt(request.getParameter("pid"));
        int qty = Integer.parseInt(request.getParameter("qty"));
        HashMap<Integer, Integer> cartItem = null;
        if (session.getAttribute("cart") != null) {
            cartItem = (HashMap<Integer, Integer>) session.getAttribute("cart");
        } else {
            cartItem = new HashMap<Integer, Integer>();
        }
        cartItem.put(new Integer(pid), new Integer(qty));
        session.setAttribute("cart", cartItem);
        response.sendRedirect("ecommerce.jsp?msg=Product added successfully");
        

%>