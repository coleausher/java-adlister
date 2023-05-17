<%--
  Created by IntelliJ IDEA.
  User: coleusher
  Date: 5/17/23
  Time: 09:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Login</title>
</head>
<body>



<form action="login.jsp" method="POST">

    <label for="username">Username</label>
    <input type="text" name="username" id="username" placeholder="username">

    <label for="password">Password</label>
    <input type="password" name="password" id="password" placeholder="password">

    <label for="submit"></label>
    <button type="submit" id="submit">Submit</button>


</form>




</body>
</html>