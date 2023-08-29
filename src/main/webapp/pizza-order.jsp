<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: nic
  Date: 8/28/23
  Time: 1:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="partials/navbar.jsp" />
<body>
<h1>PIZZA</h1>
<h2>Select your options</h2>
<form method="POST" action="${pageContext.request.contextPath}/pizza-order">
    <h3>Size</h3>
    <label for="small">Small</label><input type="radio" id="small" value="small" name="size">
    <label for="medium">Medium</label><input type="radio" id="medium" value="medium" name="size">
    <label for="large">Large</label><input type="radio" id="large" value="large" name="size">

    <h3>Crust</h3>
    <label for="thin">Thin</label><input type="radio" id="thin" name="crust" value="thin">
    <label for="regular">Regular</label><input type="radio" id="regular" name="crust" value="regular">
    <label for="thick">Thick</label><input type="radio" id="thick" name="crust" value="thick">

    <h3>Sauce</h3>
    <label for="red">Red</label><input type="radio" id="red" name="sauce" value="red">
    <label for="white">white</label><input type="radio" id="white" name="sauce" value="white">
    <label for="bbq">bbq</label><input type="radio" id="bbq" name="sauce" value="bbq">

    <h4>Toppings</h4>
    <label for="pepperoni">Pepperoni</label><input type="checkbox" id="pepperoni" name="pepperoni" value="pepperoni">
    <label for="sausage">Sausage</label><input type="checkbox" id="sausage" name="sausage" value="sausage">
    <label for="peppers">Peppers</label><input type="checkbox" id="peppers" name="peppers" value="peppers">
    <label for="olives">Olives</label><input type="checkbox" id="olives" name="olives" value="olives">
    <br>
    <input type="submit">
</form>
</body>

</html>
