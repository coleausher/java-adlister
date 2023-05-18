<%--
  Created by IntelliJ IDEA.
  User: coleusher
  Date: 5/17/23
  Time: 14:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>National Parks</title>

</head>
<body>

<ul>
  <c:forEach var="park" items="${parks}">
    <li>${park}</li>
  </c:forEach>
</ul>

<form action="/parks" method="POST">
    <label for="userInput">Type something:</label>
    <input type="text" name="userInput" id="userInput">
    <button>Submit</button>
</form>

</body>
</html>
