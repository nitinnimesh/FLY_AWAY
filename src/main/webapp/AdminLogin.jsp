<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AdminLogin</title>
</head>
<body>
<form action ="AdminServlet" method="post">

<label>Username</label><input type="text" name="username"></br>
<label>PassWord</label><input type="text" name="password"></br>
<input type="Submit" value="LOGIN">
</form>
</body>
</html>