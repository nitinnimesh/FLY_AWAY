<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FlyAway</title>
</head>
<body>
<h1 align="center">FlyAway </h1>
<h2 align="center">Welcome to Airline Booking Portal Dashboard </h2>
<div name="booking forma" align="left">
<form action ="FlyAway" method="post">

<label>Date of Travel</label><input type="date" name="date"></br>
<label>Source Address </label>
<select id="Source Address" name="Source_Address">
  <option value="AP">Andhra Pradesh</option>
  <option value="ARP">Arunachal Pradesh</option>
  <option value="AS">Assam</option>
  <option value="BH">Bihar</option>
  <option value="CH">Chhattisgarh</option>
</select></br>
<label>Destination Address </label>
<select id="Destination Address" name="Destination_Address">
  <option value="GO">Goa</option>
  <option value="Gu">Gujarat</option>
  <option value="HRY">Haryana</option>
  <option value="HP">Himachal Pradesh</option>
  <option value="JK">Jharkhand</option>
</select></br>
<label>Total number of Passengers</label><input type="text" name="numberofpassenger"></br>
<input type="Submit" value="CHECK THE FLIGHT AVAILABILTIY">
</form>
<a href="AdminLogin.jsp">CLICK HERE FOR ADMIN LOGIN</a>
</div>
</body>
</html>