<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.* , com.vvp.web.Products"%>
<%@include file="../header.jsp" %>

<!-- Heading -->
<div id="heading" >
    <h1>Cart</h1>
</div>

<!-- Main -->
<section id="main" class="wrapper">
    <div class="inner">
        <div class="content">

            <!-- Elements -->
            <div class="row">
                <div class="col-12">

                    <table>
                        <tr>
                            <th>Sr.No.</th>
                            <th>Product Name</th>
                            <th>Quantity</th>
                            <th>Amount</th>
                            <th></th>
                            <th></th>
                        </tr>

                        <%
                        if(session.getAttribute("cart")!=null){
        HashMap<Integer, Integer> cartItems = (HashMap<Integer, Integer>) session.getAttribute("cart");
        HashMap<Integer, Products> items = (HashMap<Integer, Products>) application.getAttribute("product");
        Set<Integer> keys = cartItems.keySet();
        Iterator<Integer> it = keys.iterator();
        int i = 0;
        while (it.hasNext()) {
            int element = it.next();
                 out.println("<tr>");
                    out.println("<td>" + (++i) + "</td>");
                    out.println("<td>" + items.get(element).name + "</td>");
                    out.println("<td>" + cartItems.get(element) + "</td>");
                    out.println("<td>" + (items.get(element).price * cartItems.get(element)) + "</td>");
                    out.println("<td>");
                    out.println("<form action='removeProduct.jsp'>");
                    out.println("<input type='hidden' name='key' value='" + element + "'>");
                    out.println("<input type='submit' name='remove' value='Remove' class='primary'>");
                    out.println("</form>");
                    out.println("</td>");
                    out.println("<td>");
                    out.println("<form action='buySingle.jsp'>");
                    out.println("<input type='hidden' name='key' value='" + element + "'>");
                    out.println("<input type='submit' name='buysingle' value='Buy' >");
                    out.println("</form>");
                    out.println("</td>");
                    out.println("</tr>");
            }
        }
                        %>

                        
                        <tr>
                            <td colspan="6">
                                <form action="buyProduct.jsp">
                                    <input type="submit" name="buy" value="Buy All" >
                                </form>
                            </td>
                        </tr>


                    </table>

                </div>
            </div>
        </div>
    </div>
</section>

<%@include file="../footer.jsp" %>
