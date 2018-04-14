<%-- 
    Document   : hairetunosakusei
    Created on : 2018/04/14, 14:34:58
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
        <%@page import="java.util.ArrayList"%>
        <%
            ArrayList<String> data = new ArrayList<String>();

            data.add("10");
            out.print("10" + "<br>");

            data.add("100");
            out.print("100" + "<br>");

            data.add("soeda");
            out.print("soeda" + "<br>");

            data.add("hayashi");
            out.print("hayashi" + "<br>");

            data.add("-20");
            out.print("-20" + "<br>");

            data.add("118");
            out.print("118" + "<br>");

            data.add("END");
            out.print("END");


        %>
    </body>
</html>
