<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@include file="../header.jsp" %>

<!-- Heading -->
<div id="heading" >
    <h1>Payment</h1>
</div>

<%
        int key = 0;
        String msg = null;
        if (request.getParameter("key") != null) {
            key = Integer.parseInt(request.getParameter("key"));
        }
        if (request.getParameter("msg") != null) {
            msg = request.getParameter("msg");
        }
%>

<!-- Main -->
<section id="main" class="wrapper">
    <div class="inner">
        <div class="content">

            <!-- Elements -->
            <div class="row">
                <div class="col-6 col-12-medium">

                    <form action="payment2.jsp" method="post">
                        <div class="col-4 col-12-small">
                            <input type="radio" id="nb" name="radio" value="netbanking" checked>
                            <label for="nb">Net-Banking</label>
                        </div>
                        <div class="col-4 col-12-small">
                            <input type="radio" id="db" name="radio" value="debit">
                            <label for="db">Debit Card</label>
                        </div>
                        <div class="col-4 col-12-small">
                            <input type="radio" id="cc" name="radio" value="credit">
                            <label for="cc">Credit Card</label>
                        </div>
                        <div class="col-4 col-12-small">
                            <input type="radio" id="cod" name="radio" value="cod">
                            <label for="cod">COD</label>
                        </div>
                        <input type="hidden" name="key" value="<%=key%>">
                        <input type="hidden" name="msg" value="<%=msg%>">
                        <div class="col-6">
                            <ul class="actions">
                                <li><input type="submit" name="pay" value="PAY" class="primary" /></li>
                            </ul>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</section>

<%@include file="../footer.jsp" %>
