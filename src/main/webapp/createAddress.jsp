<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018-05-24
  Time: 22:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>create address page</title>
</head>
<body>
<h1>create address</h1>
<form action="/address/create" method="post">
    <input name="detail" placeholder="Detail"><br>
    <select name="userId">
        <c:forEach var="user" items="${sessionScope.users}">
            <option value="${user.id}">${user.username}</option>
        </c:forEach>
    </select>
    <input type="submit" value="Add">
</form>
${requestScope.message}
</body>
</html>
