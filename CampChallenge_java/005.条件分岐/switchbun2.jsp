<%-- 
    Document   : switchbun2
    Created on : 2018/04/14, 11:24:21
    Author     : onishiharuka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        char text= 3;
        switch(text){
            case 1:
                out.print("A");
                break;
                
            case 2:
                out.print("B");
                break;
                
            default:
                out.print("");
                break;
        }
        
        
        %>
    </body>
</html>
