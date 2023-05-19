<%@ page import="models.Ad" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Ads Listing</title>
</head>
<body>
<h1>Ads Listing</h1>

<%-- Iterate over the ads list and display each ad --%>
<ul>
  <% for (Ad ad : (List<Ad>) request.getAttribute("ads")) { %>
  <li>
    <h3><%= ad.getTitle() %></h3>
    <p><%= ad.getDescription() %></p>
    <!-- Add more ad details as needed -->
  </li>
  <% } %>
</ul>
</body>
</html>