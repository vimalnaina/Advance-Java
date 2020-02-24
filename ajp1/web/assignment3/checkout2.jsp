<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.* , com.vvp.web.Products,java.sql.*"%>
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
        if (session.getAttribute("cart") != null) {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "");
            Statement stmt = con.createStatement();

            HashMap<Integer, Integer> cartItems = (HashMap<Integer, Integer>) session.getAttribute("cart");
            Set<Integer> keys = cartItems.keySet();
            Iterator<Integer> it = keys.iterator();
            int i = 0;
            while (it.hasNext()) {
                int element = it.next();
                ResultSet rs = stmt.executeQuery("select * from product where pid='" + element + "'");
                if (rs.next()) {
                    out.println("<tr>");
                    out.println("<td>" + (++i) + "</td>");
                    out.println("<td>" + rs.getString("pname") + "</td>");
                    out.println("<td>" + cartItems.get(element) + "</td>");
                    out.println("<td>" + (rs.getInt("pprice") * cartItems.get(element)) + "</td>");
                    out.println("<td>");
                    out.println("<form action='removeProduct.jsp'>");
                    out.println("<input type='hidden' name='key' value='" + element + "'>");
                    out.println("<input type='submit' name='remove' value='Remove' class='primary'>");
                    out.println("</form>");
                    out.println("</td>");
                    out.println("<td>");
                    out.println("<form action='buySingle2.jsp'>");
                    out.println("<input type='hidden' name='key' value='" + element + "' >");
                    out.println("<input type='submit' name='buysingle' value='Buy' class='blue'>");
                    out.println("</form>");
                    out.println("</td>");
                    out.println("</tr>");
                }
            }
        }
                        %>


                        <tr>
                            <td colspan="2">
                                <form action="buyProduct2.jsp">
                                    <input type="submit" name="buy" value="Buy All" class="blue">
                                </form>
                            </td>
                            <td colspan="4">
                                <form action="ecommerce2.jsp">
                                    <input type="submit" name="buymore" value="Add More Items" class="green">
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
