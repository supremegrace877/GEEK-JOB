<%@page import="jums.UserDataBeans"%>
<%@page import="jums.JumsHelper"%>
<%@page import="javax.servlet.http.HttpSession" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS登録確認画面</title>
        <%
            HttpSession hs = request.getSession();
        %>
        <%
            UserDataBeans jb = (UserDataBeans)hs.getAttribute("DATA");
        %>
    </head>
    <body>
        <h1>登録確認</h1>
        <%if(jb.getName().equals("")){
        out.println("※名前を入力してください");}else{
        out.println("名前:"+jb.getName());}
        %><br>
        <%if((jb.getYear()+"年"+jb.getMonth()+"月"+jb.getDay()+"日").equals("")){
        out.println("※生年月日を入力してください");}else{
        out.println("生年月日:"+jb.getYear()+"年"+jb.getMonth()+"月"+jb.getDay()+"日");};
        %><br>
        <%if(jb.getType().equals("")){
        out.println("※種別を入力してください");}else{
        out.println("種別:"+jb.getType());}
        %><br>
        <%if(jb.getTell().equals("")){
        out.println("※電話番号を入力してください");}else{
        out.println("電話番号:"+jb.getTell());}
        %><br>
        <%if(jb.getComment().equals("")){
        out.println("※自己紹介を入力してください");}else{
        out.println("自己紹介:"+jb.getComment());}
        %><br>
    <% if(!jb.getName().equals("")&&!jb.getYear().equals("")&&!jb.getType().equals("")&&!jb.getTell().equals("")&&!jb.getComment().equals("")){%>
        上記の内容で登録します。よろしいですか？
        <form action="insertresult" method="POST">
            <input type="submit" name="yes" value="はい">
        </form>
        <% } %>
        <form action="insert" method="POST">
            <input type="submit" name="no" value="登録画面に戻る">
        </form>
        <br>
        <%=JumsHelper.getInstance().home()%>
    </body>
</html>
