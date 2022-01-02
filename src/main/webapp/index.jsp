<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FlyAway</title>
<style>
input[type=text], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 100%;
  background-color: #f2c200;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #f2c200;
}

div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
</style>
</head>
<body>
<h1 align="center">FlyAway </h1>
<h2 align="center">Welcome to Airline Booking Portal Dashboard </h2>
<div name="booking forma" align="left">
<form action ="FlyAway" method="post">

<label>Date of Travel</label></br><input type="date" name="date"></br></br>
<label>Destination Address </label></br>
<select id="Destination Address" name="Destination_Address">
  <option value="AP">Andhra Pradesh</option>
  <option value="ARP">Arunachal Pradesh</option>
  <option value="AS">Assam</option>
  <option value="BH">Bihar</option>
  <option value="CH">Chhattisgarh</option>
</select></br>
<label>Source Address </label></br>
<select   id="Source Address" name="Source_Address">
  <option value="GO">Goa</option>
  <option value="Gu">Gujarat</option>
  <option value="HRY">Haryana</option>
  <option value="HP">Himachal Pradesh</option>
  <option value="JK">Jharkhand</option>
</select></br>
<label>Total number of Passengers</label></br><input type="text" name="numberofpassenger"></br>
<input type="Submit" value="CHECK THE FLIGHT AVAILABILTIY">
</form>


</br></br></br>
<a href="AdminLogin.jsp">CLICK HERE FOR ADMIN LOGIN</a>
</div>
</body>
</html>