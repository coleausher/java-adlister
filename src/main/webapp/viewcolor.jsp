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
    <title>View Color</title>
</head>
<body style="background-color: <%= request.getParameter("color") %>;">
<h1>Your Selected Color: <%= request.getParameter("color") %></h1>
</body>
</html>
