<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.http.HttpSession;" %>
<!DOCTYPE html>
<%
//    セッションの取得
HttpSession hs = request.getSession();
String data = (String)hs.getAttribute("data");

%>
<%
    if(hs.getAttribute("ac").equals(request.getAttribute("check"))&&data !=null){
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ログイン</title>
    </head>
        
    <body>
<!--        while(db_data.next()){-->
        <p>ようこそ<%= data %>さん</p>
        <br>
        <a href="http://localhost:8080/JDBC/zaikokanri_system/Toroku.jsp">商品を登録する</a><br>
        <a href="http://localhost:8080/JDBC/Shohin_itiran">商品一覧を見る</a><br>
        <br>
        <a href="http://localhost:8080/JDBC/Logout">ログアウト</a><br>
    </body>
</html>
<%
    }else{
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ログイン</title>
    </head>
        
    <body>
        <h4>ユーザーIDかパスワードが違います。</h4>
    </body>
</html>
<%
    }
%>