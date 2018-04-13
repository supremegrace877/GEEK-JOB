<%-- 
    Document   : ifbun
    Created on : 2018/04/13, 17:33:41
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
        int num=5;
        
        if (num==1){
            out.print("１です!");
        }
        
        else if(num==2){
            out.print("プログラミングキャンプ！");
        }
        
        else {
            out.print("その他です！");
        }
        
        
        %>
    </body>
</html>
