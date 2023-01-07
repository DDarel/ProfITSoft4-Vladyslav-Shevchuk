
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User</title>
</head>
<body>

<script>
</script>

<h1>Hello <c:forEach items="${nickname}" var="nick">
    <c:out value="${nick} "/>
</c:forEach> </h1>

<h2>Users:</h2>
<c:forEach items="${users}" var="user">
    <c:out value="User id = ${user.id} | "/>
    <c:out value="User name = ${user.nickname}"/><br/>
</c:forEach>
<hr />

<a href="<c:url value="/logout"/>">Logout</a>
</body>
</html>
