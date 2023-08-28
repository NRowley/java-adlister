<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nic
  Date: 8/24/23
  Time: 4:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@ include file="partials/head.jsp" %>
<body>
<%@ include file="partials/navbar.jsp" %>
<h1>LOGIN</h1>
<form method="POST" action="${pageContext.request.contextPath}/login.jsp">
    <label for="username"></label><input type="text" id="username" name="username" placeholder="Enter Username">
    <br>
    <label for="password"></label><input type="text" id="password" name="password" placeholder="Enter Password">
    <br>
    <input type="submit" id="submit">
</form>
<%@ include file="partials/footer.jsp" %>
<c:choose>
    <c:when test="${param.username == 'admin' && param.password == 'password'}">
        <%response.sendRedirect("/profile.jsp"); %>
    </c:when>

</c:choose>
</body>
</html>
