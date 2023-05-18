<%--
  Created by IntelliJ IDEA.
  User: coleusher
  Date: 5/16/23
  Time: 15:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>

<%--<%--%>
<%--    String[] nationalParks = new String[] {"Glacier National Park", "Big Bend National Park", "Yosemite National Park"};--%>
<%--request.setAttribute("parks", nationalParks);--%>
<%--%>--%>

<body style="background-color: ${param.color}">

        <h1>Hello this is a test!</h1>
<%--        <ul>--%>
            <%--<li>${parks[0]}</li>--%>
            <%--<li>${parks[1]}</li>--%>
            <%--<li>${parks[2]}</li>--%>


<%--       JAVABEANS         --%>

<%--                <c:forEach items="${parks}" var="park">--%>
<%--                    <div>--%>
<%--                    <h3>${park.getName}</h3>--%>
<%--                    <p> Location: ${park.getLocation()}</p>--%>
<%--                    <p> Established: ${park.getdateOfEstablisment()}</p>--%>
<%--                    <p> Description: ${park.getdescription()}</p>--%>
<%--                    </div>--%>
<%--                </c:forEach>--%>




<%--------------  JSTL  ---------------%>
<%--    <c:choose>--%>
<%--   if statement "when"    --%>
<%--        <c:when>--%>

<%--        </c:when>--%>
<%--    else statement  "otherwise"  --%>
<%--        <c:otherwise>--%>

<%--        </c:otherwise>--%>
<%--    </c:choose>--%>

<%--    <c:if test='${param.color.equalsIgnoreCase("blue")}'>--%>
<%--        <h1>You chose blue!</h1>--%>
<%--    </c:if>--%>

<%--    <c:forEach items="${parks}" var="park">--%>
<%--        <li>${park}</li>--%>
<%--    </c:forEach>--%>
<%--        </ul>--%>




<%--&lt;%&ndash;   post example     &ndash;%&gt;--%>
<%--<c:choose>--%>
<%--&lt;%&ndash;  The userChoice parameter is being sent through a form from out post-example  &ndash;%&gt;--%>
<%--    <c:when test="${param.userChoice.equals('bubbles')}">--%>
<%--        <h1>ohh look bubbles!</h1>--%>

<%--   post example     --%>
<c:choose>
<%--  The userChoice parameter is being sent through a form from out post-example  --%>
    <c:when test="${param.userChoice.equals('bubbles')}">
        <h1>ohh look bubbles!</h1>


<%--    </c:when>--%>
<%--    <c:otherwise>--%>
<%--        <h1>I dont care what you typed</h1>--%>
<%--    </c:otherwise>--%>
<%--</c:choose>--%>


</body>
</html>
