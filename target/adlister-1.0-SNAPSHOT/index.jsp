<%@ page import="java.util.Arrays" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%! int counter = 0; %>
<% counter += 1; %>
<html>
<head>
    <title><%= "Some Title" %></title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">

</head>
<body>


<%--include to bring in a file we want  this html file brings in a navbar to the page--%>
<%@include file="partials/navbar.html"%>


<%! String[] name = {"Cole", "Johnny", "Jacob", "Joe"};%>
<%--<h1><%= Arrays.toString(name)%></h1>--%>

<% int count = 0;%>
<h1 id="title"><% count++; %></h1>

<%--<% String cohort = request.getParameter("cohort"); %>--%>
<%--<%= cohort %>--%>
<%--can use expression language to access request parameters as well--%>
${param.cohort} is awesome!
<%--if we want a collection of parameter values, we can use paramValues as well--%>
<%--${paramValues}--%>

<h1>Welcome To The Site!</h1>
<p>Path: <%= request.getRequestURL() %></p>
<p>Query String: <%= request.getQueryString() %></p>
<p>"name" parameter: <%= request.getParameter("name") %></p>
<p>"method" attribute: <%= request.getMethod() %></p>
<p>User-Agent header: <%= request.getHeader("user-agent") %></p>





<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>

</body>
</html>
