<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="../header.jsp" %>


<%
        int ans = 0;
        if (request.getParameter("number1") != null && request.getParameter("number2") != null) {
            int number1 = Integer.parseInt(request.getParameter("number1"));
            int number2 = Integer.parseInt(request.getParameter("number2"));
            char op = request.getParameter("op").charAt(0);
            switch (op) {
                case '+':
                    ans = add(number1, number2);
                    break;
                case '-':
                    ans = sub(number1, number2);
                    break;
                case '*':
                    ans = mul(number1, number2);
                    break;
                case '/':
                    ans = div(number1, number2);
                    break;
            }
        }
%>


<%!
    int add(int n1, int n2) {
        return (n1 + n2);
    }

    int sub(int n1, int n2) {
        return (n1 - n2);
    }

    int mul(int n1, int n2) {
        return (n1 * n2);
    }

    int div(int n1, int n2) {
        return (n1 / n2);
    }
%>


<!-- Heading -->
<div id="heading" >
    <h1>Calculator</h1>
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
                            <div class="col-6 col-12-xsmall">
                                <input type="text" name="number1" placeholder="enter 1st number" />
                            </div>
                            <div class="col-6 col-12-xsmall">
                                <input type="text" name="number2" placeholder="enter 2nd number" />
                            </div>
                            <!-- Break -->
                            <div class="col-12">
                                <ul class="actions">
                                    <li><input type="submit" value="+" class="primary" name="op"/></li>
                                    <li><input type="submit" value="-" class="primary" name="op"/></li>
                                    <li><input type="submit" value="*" class="primary" name="op"/></li>
                                    <li><input type="submit" value="/" class="primary" name="op"/></li>
                                </ul>
                            </div>

                            <div class="col-6 col-12-xsmall">
                                <input type="text" name="ans" placeholder="Answer" value="<%= ans%>"/>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</section>

<%@include file="../footer.jsp" %>



