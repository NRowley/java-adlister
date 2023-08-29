<%--
  Created by IntelliJ IDEA.
  User: nic
  Date: 8/29/23
  Time: 10:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="partials/navbar.jsp"/>
<form method="POST" action="pickcolor">
    <label for="color-pick"></label><input type="text" name="color-pick" id="color-pick" placeholder="Enter a Color">
    <input type="submit">
</form>
</body>
</html>
