<%@page import="java.util.*" %>

<html>
<head>
    <title>Advance Java Practicals</title>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
    <meta name="description" content="" />
    <meta name="keywords" content="" />
    <link rel="stylesheet" href="../assets/css/main.css" />
</head>
<body class="is-preload">

<%
        int count = 0;
        String uname = "user";
        if (session.getAttribute("cart") != null) {
            HashMap<Integer, Integer> cartItem = (HashMap<Integer, Integer>) session.getAttribute("cart");
            for (int i = 0; i < cartItem.size(); i++) {
                count++;
            }
        }
        if (session.getAttribute("user") != null) {
            uname = session.getAttribute("user").toString();
        }
%>

<!-- Header -->
<header id="header">

    <a class="logo" href="index.jsp">Vimal Naina</a>

    <nav class="main-nav float-right d-none d-lg-block">
        <ul>
            <li><a href="../assignment1/index.jsp">HOME</a></li>
            <li class="drop-down"><a href="">ASSIGNMENT-1</a>
                <ul>
                    <li><a href="../assignment1/signup.jsp">Signup</a></li>
                    <li><a href="../assignment1/login.jsp">Login</a></li>
                    <li><a href="../assignment1/tablegenerator.jsp">Table-Generator</a></li>
                    <li><a href="../assignment1/visitorcounter.jsp">Visitor-Counter</a></li>
                </ul>
            </li>
            <li class="drop-down"><a href="">ASSIGNMENT-2</a>
                <ul>
                    <li><a href="../assignment2/calculator.jsp">Calculator</a></li>
                    <li><a href="../assignment2/tempconverter.jsp">Temp-Convertor</a></li>
                    <li><a href="../assignment2/dynamicHtml.jsp">Dynamic-Html</a></li>
                    <li><a href="../assignment2/ecommerce.jsp">E-commerce</a></li>
                </ul>
            </li>
            <li class="drop-down"><a href="">ASSIGNMENT-3</a>
                <ul>
                    <li><a href="../assignment3/ecommerce2.jsp">E-commerce:2</a></li>
                    <li><a href="../assignment3/products.jsp">Products</a></li>
                </ul>
            </li>
            <li><a href="../assignment3/checkout2.jsp"><i class="icon fa-cart-plus">&nbsp;</i>Cart-<%=count%></a></li>
            <li class="drop-down"><a>Hi, <%=uname%></a>
                <ul>
                    <li><a href="#">Profile</a></li>
                    <li><a href="#">My Orders</a></li>
                    <li><a href="../assignment1/logout.jsp">Login/Logout</a></li>
                </ul>
            </li>
        </ul>
    </nav>
</header>