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
    <title>home page</title>
    <script>
        function del() {
            return confirm("REMOVE?");
        }
    </script>
</head>
<body>
<c:if test="${sessionScope.user eq null}">
    <c:redirect url="/index.jsp"/>
</c:if>
<h1>home page</h1>
<p>${sessionScope.user.username}</p>
<p><a href="/user/signOut">Sign out</a></p>
<hr>
<form action="/book/create" method="post">
    <input type="hidden" name="userId" value="${sessionScope.user.id}">
    <input name="title" placeholder="Title"><br>
    <input name="price" placeholder="Price" value="123.45"><br>
    <input name="amount" placeholder="Amount" value="100"><br>
    <input name="pubTime" placeholder="Publish time" value="2018-05-12"><br>
    <input type="submit" value="Add"><br>
</form>
<hr>
<table border="1">
    <tr>
        <th>COUNT</th>
        <th>TITLE</th>
        <th>PRICE</th>
        <th>AMOUNT</th>
        <th>PUBLISH TIME</th>
        <th colspan="2">OPERATION</th>
    </tr>
    <c:forEach var="book" items="${sessionScope.books}" varStatus="vs">
        <tr>
            <td>${vs.count}</td>
            <td>${book.title}</td>
            <td>${book.price}</td>
            <td>${book.amount}</td>
            <td>${book.pubTime}</td>
            <td><a href="/book/queryById/${book.id}">EDIT</a></td>
            <td><a href="/book/remove/${book.id}" onclick="return del()">REMOVE</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
