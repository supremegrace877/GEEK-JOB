
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>ログインページ</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <h1>ログイン画面</h1>
    </head>
    <body>
        <form action="/JDBC/Login" method="post">
            <p>ユーザーID:<input type="text" name="userID"></p>
            <p>パスワード:<input type="text" name="passward"></p>
            <p><input type="submit" name="sent" value="送信"></p>
        </form>
    </body>
</html>
