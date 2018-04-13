<%-- 
    Document   : sisokuenzan
    Created on : 2018/04/13, 16:31:46
    Author     : onishiharuka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body><%
        int num1 = 10;
        final int num2 = 24;
        out.print(num1+num2+"<br>");
        out.print(num1-num2+"<br>");
        out.print(num1*num2+"<br>");
        out.print(num1/num2+"<br>");
        out.print(num1%num2+"<br>");
        %>
        
    </body>
</html>
