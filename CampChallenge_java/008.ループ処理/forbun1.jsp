<%-- 
    Document   : forbun1
    Created on : 2018/04/16, 10:58:13
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
        <%//8の20乗
        long total=1;
            for(long i=0;i<20;i++){
                total=total* 8;
        }
            out.print(total);
        
        
        
        %>
    </body>
</html>
