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
<%--JSTL--%>

<%--<c:choose>--%>
<%--    <c:when test="${param.username.equals('admin') && param.password.equals('password')}">--%>
<%--        <c:redirect url="profile.jsp"/>    <!-- Redirect to the profile page -->--%>
<%--    </c:when>--%>
<%--</c:choose>--%>

<%--JSTL--%>


<%--JAVA--%>
<%
    if(request.getMethod().equalsIgnoreCase("post")){
    String username = request.getParameter("username");
    String password = request.getParameter("password");
if(username.equals("admin") && password.equals("password")){
    response.sendRedirect("profile.jsp");
}else{
    response.sendRedirect("login.jsp");
}
    }
%>
<%--JAVA--%>

<form action="/login.jsp" method="POST">

    <label for="username">Username</label>
    <input type="text" name="username" id="username" placeholder="username">

    <label for="password">Password</label>
    <input type="password" name="password" id="password" placeholder="password">

    <label for="submit"></label>
    <button type="submit" id="submit">Submit</button>


</form>







</body>
</html>