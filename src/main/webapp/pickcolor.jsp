<%--
  Created by IntelliJ IDEA.
  User: coleusher
  Date: 5/17/23
  Time: 15:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick a Color</title>
</head>
<body>
<h1>Pick Your Favorite Color</h1>
<form action="viewcolor.jsp" method="POST">
    <label for="color">Favorite Color:</label>
    <input type="text" name="color" id="color">
    <br><br>
    <input type="submit" value="Submit">
</form>
</body>
</html>
<%--servlets-with-jsps--%>