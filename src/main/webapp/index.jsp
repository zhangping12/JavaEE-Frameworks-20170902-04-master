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
    <title>index page</title>
</head>
<body>
<h1>index page</h1>
<form action="/user/signIn" method="post">
    <input name="username" placeholder="Username" value="Tom"><br>
    <input name="password" placeholder="Password" type="password" value="123"><br>
    <input type="submit" value="Sign in"><br>
</form>
${requestScope.message}
<p><a href="/signUp.jsp">Sign up</a></p>
<hr>
<p><a href="/user/queryAllUsers">List All Users and User Books.</a></p>
<p><a href="/book/queryAllBooks">List All Books</a></p>
<hr>
<p><a href="/user/toCreateAddress">Create Address</a></p>
<p><a href="/user/queryAll">List All Users -> users.jsp</a></p>
<p><a href="/address/queryAll">List All Addresses -> addresses.jsp</a></p>
<hr>
<p><a href="/student/queryAll">List All Students -> students.jsp</a></p>
<p><a href="/course/queryAll">List All Courses -> courses.jsp</a></p>
</body>
</html>
