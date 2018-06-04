<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>商品登録画面</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <form action="/JDBC/Toroku" method="post">
            <p>商品情報を入力してください。</p>
            <p>商品ID:<input type="text" name="syohinID"></p>
            <p>品名:<input type="text" name="hinmei"></p>
            <p>個数:<input type="text" name="kosu"></p>
            <p>種類:<input type="text" name="syurui"></p>
            <p><input type="submit" name="sent" value="送信"></p>
        </form>
    </body>
</html>
