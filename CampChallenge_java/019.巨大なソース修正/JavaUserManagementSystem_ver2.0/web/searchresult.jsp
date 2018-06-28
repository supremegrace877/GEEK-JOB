<%@page import="java.util.Date"%>
<%@page import="jums.JumsHelper"
        import="jums.UserDataDTO" %>
<%
    JumsHelper jh = JumsHelper.getInstance();
    //セッションからresultData取り出し
    UserDataDTO udd = (UserDataDTO) session.getAttribute("resultData");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS検索結果画面</title>
    </head>
    <body>
        <h1>検索結果</h1>
        <table border=1>
            <% 
                String name = udd.getName();
                Date birthday = udd.getBirthday();
                int type = udd.getType();
                if(!name.equals("")&&!birthday.equals("")&&type!=0){%>
            <tr>
                <th>名前</th>
                <th>生年月日</th>
                <th>種別</th>
                <th>登録日時</th>
            </tr>
            <tr>
                <td><a href="ResultDetail?userID=<%= udd.getUserID()%>"><%= udd.getName()%></a></td>
                <td><%= udd.getBirthday()%></td>
                <td><%= jh.exTypenum(udd.getType())%></td>
                <td><%= udd.getNewDate()%></td>
            </tr>
            <%}else{out.println("正確な値を入力してください。");}%>
            <br>
            
        </table>
            <br>
        <form action="insert" method="POST">
            <input type="submit" name="no" value="検索画面に戻る">
        </form>
            <br>
    </body>
    <%=jh.home()%>
</html>
