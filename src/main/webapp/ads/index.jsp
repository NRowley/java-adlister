<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Ads Index</title>
</head>
<body>
<h1>Here are all the Current Ads:</h1>

<c:forEach var="ad" items="${ads}">
    <div class="product">
        <h2>${ad.title}</h2>
        <p>Description: ${ad.description}</p>
    </div>
</c:forEach>
</body>
</html>
