<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018-05-10
  Time: 22:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>sign up page</title>
</head>
<body>
<h1>sign up page</h1>
<form action="/user/signUp" method="post" enctype="multipart/form-data">
    <input name="username" placeholder="Username"><br>
    <input name="password" placeholder="Password" type="password"><br>
    <input type="file" name="avatarFile"><br>
    <input type="submit" value="Sign up"><br>
</form>
${requestScope.message}
</body>
</html>
