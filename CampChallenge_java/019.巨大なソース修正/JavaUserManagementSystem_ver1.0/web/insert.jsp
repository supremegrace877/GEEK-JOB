<%@page import="jums.UserDataBeans"%>
<%@page import="javax.servlet.http.HttpSession" %>
<%@page import="jums.JumsHelper" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    HttpSession hs = request.getSession();
%>
<%
    UserDataBeans jb = (UserDataBeans) hs.getAttribute("DATA");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS登録画面</title>
    </head>
    <body>
        <form action="insertconfirm" method="POST">
            名前:
            <input type="text" name="name" value="<% if (jb != null) {
                out.print(jb.getName());
            } %>">
            <br><br>

            生年月日:
            <select name="year">
                <option value="">----</option>
            <!--value=〜でinsertconfirmに値を渡す-->
            <!--option②＝二つ目の選択肢-->
            <!--初期値はselected属性-->
                <% if (jb != null) {
                        for (int i = 1950; i <= 2010; i++) {
                            if(Integer.parseInt(jb.getYear()) == i){%> 
                            <option value=<%=i%> selected><%=i%></option>
                            <%}else{%>
                            <option value=<%=i%> ><%=i%></option>
                            <%
                            }
                        }
                   }else{%>
                   <%
                        for (int i = 1950; i <= 2010; i++) {
                    %>
                         <option value=<%=i%> ><%=i%></option>
                <%}}%>
                
            </select>年
            <select name="month">
                <option value="">--</option>
                <%if (jb != null) {
                        for (int i = 1; i <= 12; i++) {
                            if(Integer.parseInt(jb.getMonth()) == i){%> 
                            <option value=<%=i%> selected><%=i%></option>
                            <%}else{%>
                            <option value=<%=i%> ><%=i%></option>
                            <%
                            }
                        }
                   }else{%>
                   <%
                        for (int i = 1; i <= 12; i++) {
                    %>
                         <option value=<%=i%> ><%=i%></option>
                <%}}%>
            </select>月
            <select name="day">
                <option value="">--</option>
                <%if (jb != null) {
                        for (int i = 1; i <= 31; i++) {
                            if(Integer.parseInt(jb.getDay()) == i){%> 
                            <option value=<%=i%> selected><%=i%></option>
                            <%}else{%>
                            <option value=<%=i%> ><%=i%></option>
                            <%
                            }
                        }
                   }else{%>
                   <%
                        for (int i = 1; i <= 31; i++) {
                    %>
                         <option value=<%=i%> ><%=i%></option>
                <%}}%>
            </select>日
            <br><br>

            種別:
            <br>
            <input type="radio" name="type" value="1" <%if(jb != null && jb.getType().equals("1")){out.print("checked");}%>>エンジニア<br>
            <input type="radio" name="type" value="2" <%if(jb != null && jb.getType().equals("2")){out.print("checked");}%>>営業<br>
            <input type="radio" name="type" value="3" <%if(jb != null && jb.getType().equals("3")){out.print("checked");}%>>その他<br>
            <br>

            電話番号:
            <input type="text" name="tell" value="<% if (jb != null) {
                out.print(jb.getTell());
            } %>">
            <br><br>

            自己紹介文
            <br>
            <textarea name="comment" rows=10 cols=50 style="resize:none" wrap="hard"><% if (jb != null) {
                out.print(jb.getComment());
            }%></textarea><br><br>
            <input type="hidden" name="ac"  value="<%= hs.getAttribute("ac")%>">
            <input type="submit" name="btnSubmit" value="確認画面へ">
        </form>
        <br>
        <%=JumsHelper.getInstance().home()%>
    </body>
</html>
