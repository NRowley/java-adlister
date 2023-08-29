<%--
  Created by IntelliJ IDEA.
  User: nic
  Date: 8/29/23
  Time: 12:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<c:choose>
    <c:when test="${guess}">
        <h1>CORRECT</h1>
    </c:when>
    <c:when test="${!guess}">
        <h1>INCORRECT</h1>
    </c:when>
</c:choose>
</body>
</html>
