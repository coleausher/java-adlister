<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guess</title>
</head>
<body>

<form action="/guess" method="POST">
    <h1>Enter a number between 1 and 3</h1>
    <label for="number">
        <input type="number" name="number" id="number">
        <button type="submit">Submit</button>
    </label>

</form>

</body>
</html>