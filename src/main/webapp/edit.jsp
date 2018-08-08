<%--
  Created by IntelliJ IDEA.
  User: mingfei
  Date: 12/05/2018
  Time: 10:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>edit page</title>
</head>
<body>
<c:if test="${sessionScope.user eq null}">
    <c:redirect url="/index.jsp"/>
</c:if>
<h1>edit page</h1>
<p>${sessionScope.user.username}</p>
<p><a href="/user/signOut">Sign out</a></p>
<hr>
<form action="/book/update" method="post">
    <input type="hidden" name="id" value="${sessionScope.book.id}">
    <input type="hidden" name="userId" value="${sessionScope.user.id}">
    <input name="title" placeholder="Title" value="${sessionScope.book.title}"><br>
    <input name="price" placeholder="Price" value="${sessionScope.book.price}"><br>
    <input name="amount" placeholder="Amount" value="${sessionScope.book.amount}"><br>
    <input name="pubTime" placeholder="Publish time" value="${sessionScope.book.pubTime}"><br>
    <input type="submit" value="Save"><br>
</form>
</body>
</html>
