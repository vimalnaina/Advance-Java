<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<%@include file="../header.jsp" %>

<!-- Heading -->
<div id="heading" >
    <h1>Payment</h1>
</div>

<%
        if (request.getParameter("buymore") != null) {
            response.sendRedirect("ecommerce2.jsp");
        }
%>

<!-- Main -->
<section id="main" class="wrapper">
    <div class="inner">
        <div class="content" align="center">

            <!-- Elements -->
            <div class="row">
                <div class="col-12" >
                    <font color="green" size="5px">
                        <%

        if (request.getParameter("radio") != null) {
            String pmethod = request.getParameter("radio");
            if (pmethod.equals("netbanking")) {
                out.println("service not availabale!");
            }
            if (pmethod.equals("debit")) {
                out.println("service not availabale!");
            }
            if (pmethod.equals("credit")) {
                out.println("service not availabale!");
            }
            if (pmethod.equals("cod")) {
                out.println("Order place Successfully!");
                if (request.getParameter("pay") != null) {
                    if (request.getParameter("key") != null) {
                        int key = Integer.parseInt(request.getParameter("key"));
                        out.print(request.getParameter("key"));

                        HashMap<Integer, Integer> cartItems = (HashMap<Integer, Integer>) session.getAttribute("cart");
                        cartItems.remove(key);
                        session.setAttribute("cart", cartItems);
                    }
                    if (request.getParameter("msg") != null) {
                        session.removeAttribute("cart");
                        out.print(request.getParameter("msg"));
                    }
                }
            }
        }
                        %>
                    </font>
                    <br/><br/>
                    <form>
                        <input type="submit" name="buymore" value="Buy More Items">
                    </form>
                </div>
            </div>
        </div>
    </div>
</section>

<%@include file="../footer.jsp" %>
