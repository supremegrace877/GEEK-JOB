<%-- 
    Document   : forbun2
    Created on : 2018/04/16, 12:37:43
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
        <%//A が 30 文字続いたもの
            String text="A";
            for (int i=0;i<30;i++)
                out.print(text);
        
        
        %>
    </body>
</html>
