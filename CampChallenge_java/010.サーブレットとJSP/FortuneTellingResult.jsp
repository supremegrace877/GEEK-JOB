<%-- 
    Document   : FortuneTellingResult
    Created on : 2018/04/17, 11:56:06
    Author     : onishiharuka
--%>
<%@page import="org.camp.servlet.ResultData" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
         ResultData data =(ResultData)request.getAttribute("DATA");
        %>
    </head>
    <body>
        <%
            if (data !=null){
                    out.print("<h1>あなたの運勢は、"+data.getLuck()+"です!<h1>"+data.getD());
            
            }
        
        %>
    </body>
</html>
