<%-- 
    Document   : whilebun
    Created on : 2018/04/16, 14:06:14
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
        <%//変数を宣言　値を数値型の 1000 とする
        //変数の値を 2 で割り続け，割った結果が 100 より小さくなったらループを抜ける処理
        int count=1000;
        while(count>100){
            count=count/2;
        }
        out.print(count);
        
        
        %>
    </body>
</html>
