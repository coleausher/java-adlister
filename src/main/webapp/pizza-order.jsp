<%--
  Created by IntelliJ IDEA.
  User: coleusher
  Date: 5/17/23
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Pizza Order Form</title>
</head>
<body>
<h1>Pizza Order Form</h1>
<form action="PizzaOrderServlet" method="POST">
  <label for="crustType">Crust Type:</label>
  <select name="crustType" id="crustType">
    <option value="thin">Thin Crust</option>
    <option value="thick">Thick Crust</option>
    <option value="deep-dish">Deep Dish</option>
  </select>

  <br><br>

  <label for="sauceType">Sauce Type:</label>
  <select name="sauceType" id="sauceType">
    <option value="tomato">Tomato Sauce</option>
    <option value="pesto">Pesto Sauce</option>
    <option value="white">White Sauce</option>
  </select>

  <br><br>

  <label for="sizeType">Size:</label>
  <select name="sizeType" id="sizeType">
    <option value="small">Small</option>
    <option value="medium">Medium</option>
    <option value="large">Large</option>
  </select>

  <br><br>

  <label for="toppings">Toppings:</label>
  <input type="checkbox" name="toppings" value="pepperoni"> Pepperoni
  <input type="checkbox" name="toppings" value="mushrooms"> Mushrooms
  <input type="checkbox" name="toppings" value="onions"> Onions
  <input type="checkbox" name="toppings" value="sausage"> Sausage

  <br><br>

  <label for="deliveryAddress">Delivery Address:</label>
  <input type="text" name="deliveryAddress" id="deliveryAddress">

  <br><br>

  <input type="submit" value="Place Order">
</form>
</body>
</html>
