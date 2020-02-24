<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*"%>

<%@include file="../header.jsp" %>

<!-- Heading -->
<div id="heading" >
    <h1>Temperature Convertor</h1>
</div>

<div align="center">
    <font color="green" size="3px">
        <br/>
        <%
        double c = 0;
        if (request.getParameter("f") != null) {
            double f = Double.parseDouble(request.getParameter("f"));
            c = ((f - 32) * 5) / 9;
            String conv = "f=" + f + " c=" + c + "<br/>";
            if (session.getAttribute("temp") != null) {
                conv = session.getAttribute("temp").toString() + conv;
            }
            session.setAttribute("temp", conv);
            out.println(conv);
        }
        %>
    </font>
</div>

<!-- Main -->
<section id="main" class="wrapper">
    <div class="inner">
        <div class="content">

            <!-- Elements -->
            <div class="row">
                <div class="col-6 col-12-medium">

                    <!-- Form -->
                    <form method="post">
                        <div class="row gtr-uniform">
                            <div class="col-7">
                                <input type="text" name="f" placeholder="Temperature in F" /><br/>
                                <input type="text" placeholder="Temperature in C" value="<%=c%>"/>
                            </div>
                            <!-- Break -->
                            <div class="col-12">
                                <ul class="actions">
                                    <li><input type="submit" value="Convert" class="primary" /></li>
                                    <li><input type="reset" value="Reset" /></li>
                                </ul>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</section>

<%@include file="../footer.jsp" %>
