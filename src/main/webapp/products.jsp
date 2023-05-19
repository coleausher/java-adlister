<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: coleusher
  Date: 5/19/23
  Time: 11:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cole's Hardware Store</title>
</head>
<body>

<h1>Welcome to Cole's Hardware Store</h1>
<p>Where we provide you with the tools and you provide the skill</p>


<form action="/products" method="POST">
    <label for="productId"></label>
    <input type="text" name="productId" id="productId">

    <label for="name">Name of Product: </label>
    <input type="text" name="name" id="name">

    <label for="price">Price: </label>
    <input type="text" name="price" id="price">

    <button type="submit">Add Product</button>
</form>


<h3>All Hardware Products:</h3>

<section>
    <c:forEach items="${allProducts}" var="product">
        <p>For Sale: ${product.name}</p>
        <small>Price: $${product.price}</small>
        <form action="/products/delete" method="POST">
            <input type="hidden" value="${product.id}">
            <button>Delete</button>

        </form>
    </c:forEach>
</section>

</body>
</html>
