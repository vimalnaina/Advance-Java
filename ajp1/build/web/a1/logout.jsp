<%
    String name;
    if(session.getAttribute("user")!=null){
        name=session.getAttribute("user").toString();
        session.invalidate();
        out.print(name+ " you are logged out!");
    }
    else{
        out.print("you have to login first!");
    }
%>