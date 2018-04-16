<%-- 
    Document   : forbun3
    Created on : 2018/04/16, 13:44:23
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
        <%//変数を宣言　値を 0 から 100 までの合計値
        int total=0;
            for (int i=0;i<=100;i++)
                total=total+i;
            
            out.print(total);
        
        
        
        %>
    </body>
</html>
