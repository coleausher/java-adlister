<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: coleusher
  Date: 5/19/23
  Time: 10:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bean</title>
</head>
<body>

<c:forEach items="${albums}" var="album">
  <h2>${album.recordName}</h2>
  <p>Artist: ${album.artistName}</p>
  <p>Release Date: ${album.releaseDate}</p>
  <p>Sales: ${album.sales}</p>
  <p>Genre ${album.genre}</p>
</c:forEach>

<c:forEach items="${quotes}" var="quote">
  <p>${quote.content} ${quote.author}</p>
</c:forEach>

</body>
</html>
