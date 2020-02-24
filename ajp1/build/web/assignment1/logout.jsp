<%
    String name;
    if(session.getAttribute("user")!=null){
        name=session.getAttribute("user").toString();
        session.invalidate();
        response.sendRedirect("index.jsp");
    }
    else{
        response.sendRedirect("login.jsp");
    }
%>