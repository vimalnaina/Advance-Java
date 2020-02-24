<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@include file="../header.jsp" %>

<!-- Heading -->
<div id="heading" >
    <h1>Dynamic Html</h1>
</div>

<!-- Main -->
<section id="main" class="wrapper">
    <div class="inner">
        <div class="content">

            <!-- Elements -->
            <div class="row">
                <div class="col-6 col-12-medium">

                    <!-- Form -->
                    <form method="post" action="">
                        <div class="row gtr-uniform">
                            <div class="col-6 col-12-xsmall">
                                <input type="text" name="number" placeholder="Enter no. of Textbox" />
                            </div>
                            <!-- Break -->
                            <div class="col-12">
                                <ul class="actions">
                                    <li><input type="submit" value="Generate" class="primary" /></li>
                                    <li><input type="reset" value="Reset" /></li>
                                </ul>
                            </div>

                            <div class="col-6 col-12-xsmall">
                                <%
                                if (request.getParameter("number") != null) {
                                    int no = Integer.parseInt(request.getParameter("number"));
                                    for (int i = 1; i <= no; i++) {
                                        out.println("<input type='text' placeholder='textbox " + (i) + "'><br/>");
                                    }
                                }
                                %>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</section>

<%@include file="../footer.jsp" %>
