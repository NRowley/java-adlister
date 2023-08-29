<%--
  Created by IntelliJ IDEA.
  User: nic
  Date: 8/29/23
  Time: 12:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="partials/navbar.jsp"/>
<form method="POST" action="${pageContext.request.contextPath}/guess">
    <label for="guess">Guess a Number from 1-3</label><input type="number" max="3" min="1" name="guess" id="guess">
    <input type="submit">
</form>
</body>
</html>
