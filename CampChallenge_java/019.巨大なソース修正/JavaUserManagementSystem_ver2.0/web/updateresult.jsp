<%@page import="jums.UserDataBeans"%>
<%@page import="jums.JumsHelper" %>
<%
    JumsHelper jh = JumsHelper.getInstance();
    UserDataBeans udb = (UserDataBeans)request.getAttribute("udb");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS更新結果画面</title>
    </head>
    <body>
        <h1>変更結果</h1><br>
        名前:<% if(udb.getName().equals("")){
        out.println("※名前を入力してください");
        }else{
        out.println("名前:"+udb.getName());} %><br>
        生年月日:<% if((udb.getYear()+"年"+udb.getMonth()+"月"+udb.getDay()+"日").equals("")){
        out.println("※生年月日を入力してください");
        }else{
        out.println(udb.getYear()+"年"+udb.getMonth()+"月"+udb.getDay()+"日");}%><br>
        種別:<% if(udb.getType()==0){
        out.println("※種別を入力してください");
        }else{
        out.println("種別:"+jh.exTypenum(udb.getType()));} %><br>
        電話番号:<% if(udb.getTell().equals("")){
        out.println("※電話番号を入力してください");
        }else{
        out.println("電話番号:"+udb.getTell());}
        %><br>
        自己紹介:<% if(udb.getComment().equals("")){
        out.println("※自己紹介を入力してください");}else{
        out.println("自己紹介:"+udb.getComment());}
        %><br>
        <% if(!udb.getName().equals("")&&udb.getYear()!= 0&&udb.getMonth()!= 0&&udb.getDay()!= 0
                &&udb.getType()!=0&&!udb.getTell().equals("")&&!udb.getComment().equals("")){%>
        以上の内容に変更しました。<br>
        <%}%>
    </body>
    <br>
    <%=jh.home()%>
    </body>
</html>
