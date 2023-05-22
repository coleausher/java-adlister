<%--
  Created by IntelliJ IDEA.
  User: coleusher
  Date: 5/22/23
  Time: 11:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Please Log In" />
    </jsp:include>
</head>
<body>
<jsp:include page="partials/navbar.jsp" />

<form action="/logout" method="POST">

<input type="submit" class="btn btn-primary btn-block" value="Log Out">

</form>
</body>
</html>
