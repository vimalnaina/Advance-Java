<%@page contentType="text/html" pageEncoding="UTF-8" import="com.vvp.web.* , java.util.*"%>
<%@include file="../header.jsp" %>

<!-- Heading -->
<div id="heading" >
    <h1>E-Commerce</h1>
</div>

<div align="center">
    <font color="green" size="4px">
        <br/>
        <%
        if (request.getParameter("msg") != null) {
            out.println(request.getParameter("msg"));
        }
        %>
    </font>
</div>

<%
        HashMap<Integer, Products> items = new HashMap<Integer, Products>();
        Products product[] = new Products[3];
        product[0] = new Products(1, "Redmi5", 5, 6999);
        product[1] = new Products(2, "Watch", 5, 499);
        product[2] = new Products(3, "AcerTravelmate", 5, 24999);
        if (application.getAttribute("product") != null) {
            items = (HashMap<Integer, Products>) application.getAttribute("product");
        } else {
            for (int i = 0; i < product.length; i++) {
                items.put(new Integer(product[i].pid), product[i]);
                application.setAttribute("product", items);
            }
        }


%>


<section id="main" class="wrapper">
    <div class="container1">
        <div class="row1">
            <div class="4u">
                <section class="special box">
                    <br/><br/>
                    <img src="images/redmi5.png" width="300px" height="205px"/>
                    <br/><br/><br/>
                    <h3>Redmi 5</h3>
                    <h3>Price: 6999 INR</h3>
                    <p>Ram: 4 GB<br/>Internal Storage: 64 GB<br/>Battery: 4000 mah<br/>Processor: Snapdragon 450</p>
                    <br/><br/>
                    <form method="post" action="addToCart.jsp">
                        <div class="row gtr-uniform">
                            <div class="col-6 col-12-xsmall">
                                <input type="text" name="qty" placeholder="Quantity" value="1"/>
                                <input type="hidden" name="pid" value="1"/>
                            </div>
                            <div class="col-6">
                                <ul class="actions">
                                    <li><input type="submit" value="Add To Cart" class="primary" /></li>
                                </ul>
                            </div>
                        </div>
                    </form>
                </section>
            </div>
            <div class="4u">
                <section class="special box">
                    <br/><br/>
                    <img src="images/watch.png" width="150px" height="200px"/>
                    <br/><br/><br/>
                    <h3>Watch</h3>
                    <h3>Price: 499 INR</h3>
                    <p>Type: Analog<br/>Material: Rubber<br/>Shape: Round<br/>Water Resistance: 30mtr</p>
                    <br/><br/>
                    <form method="post" action="addToCart.jsp">
                        <div class="row gtr-uniform">
                            <div class="col-6 col-12-xsmall">
                                <input type="text" name="qty" placeholder="Quantity" value="1"/>
                                <input type="hidden" name="pid" value="2"/>
                            </div>
                            <div class="col-6">
                                <ul class="actions">
                                    <li><input type="submit" value="Add To Cart" class="primary" /></li>
                                </ul>
                            </div>
                        </div>
                    </form>
                </section>
            </div>
            <div class="4u">
                <section class="special box">
                    <br><br>
                    <img src="images/laptop.png" width="250px" height="180px"/>
                    <br/><br/><br/>
                    <h3>Acer Travelmate</h3>
                    <h3>Price: 24999 INR</h3>
                    <p>Ram: 4 GB<br>Hdd: 1 TB<br>Processor: intel i3<br>Graphics: nVidia graphics<br>Display: 14" HD display</p>
                    <br><br>
                    <form method="post" action="addToCart.jsp">
                        <div class="row gtr-uniform">
                            <div class="col-6 col-12-xsmall">
                                <input type="text" name="qty" placeholder="Quantity" value="1"/>
                                <input type="hidden" name="pid" value="3"/>
                            </div>
                            <div class="col-6">
                                <ul class="actions">
                                    <li><input type="submit" value="Add To Cart" class="primary" /></li>
                                </ul>
                            </div>
                        </div>
                    </form>
                </section>
            </div>
        </div>
    </div>
</section>


<%@include file="../footer.jsp" %>