<%--
  Created by IntelliJ IDEA.
  User: coleusher
  Date: 5/17/23
  Time: 09:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Post example</title>
</head>
<body>
<%--We want to send data TO our test.jsp file so that we can render some HTML--%>
<form action="test.jsp" method="POST">

  <label for="userChoice">Type Something:</label>
  <input type="text" name="userChoise" id="userChoice">
  <button type="submit">Submit</button>
</form>

<form>
    <label for="color">Type Something:</label>
    <input type="text" name="color" id="color">
    <button type="submit">Submit</button>
</form>



</body>
</html>
