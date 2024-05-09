<!DOCTYPE html>
<html>
<head>
    <title>ab</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/addStudent" method="post">
    <label for="id">id:</label><br>
    <input type="number" id="id" name="id"><br>
    <label for="name">name:</label><br>
    <input type="text" id="name" name="name"><br><br>


    <label for="age">age:</label><br>
    <input type="number" id="age" name="age"><br><br>
    <label for="apogee">apogee:</label><br>
    <input type="text" id="apogee" name="apogee"><br><br>
    <input type="submit" value="Submit">
</form>
</body>
</html>
