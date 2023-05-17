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


<c:choose>
    <c:when test="${param.username = 'admin' && param.password = 'password'}">
        <c:redirect url="profile.jsp"/>    <!-- Redirect to the profile page -->
    </c:when>
    <c:otherwise>
        <c:redirect url="login.jsp"/>      <!-- Redirect back to the login form -->
    </c:otherwise>
</c:choose>

</body>
</html>
