<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: coleusher
  Date: 5/18/23
  Time: 14:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cars</title>
</head>
<body>

<c:forEach items="${cars}" var="car">
        <h3>Model: ${car.model}</h3>
        <p>Vin: ${car.vin}</p>
        <p>Manufacturer: ${car.manufacturer} </p>
        <p>Year: ${car.year}</p>
        <p>Body Type: ${car.bodyType}</p>
        <p>Mileage: ${car.mileage}</p>
        <p>Fuel Type: ${car.fuelType}</p>
        <p>Is Automatic: ${car.isAutomatic()}</p>
    <c:choose>
        <c:when test="${car.isAutomatic()}">
            <p>Transmission: Automatic</p>
        </c:when>
        <c:otherwise>
            <p>Transmission: Manual</p>
        </c:otherwise>
    </c:choose>
</c:forEach>

</body>
</html>
