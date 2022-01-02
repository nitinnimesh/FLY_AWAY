<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>

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
<body>

<h1 align="center">FlyAway </h1>
<h2 align="center">Welcome to Airline Booking Portal Dashboard </h2>
<div name="set flight" align="left">
<form action ="SETFlight" method="post">
<label>Destination Address </label>
<select id="Destination Address" name="Destination_Address">
 <option value="AP">Andhra Pradesh</option>
  <option value="ARP">Arunachal Pradesh</option>
  <option value="AS">Assam</option>
  <option value="BH">Bihar</option>
  <option value="CH">Chhattisgarh</option>

</select></br>
<label>Source Address </label>
<select id="Source Address" name="Source_Address">
   <option value="GO">Goa</option>
  <option value="Gu">Gujarat</option>
  <option value="HRY">Haryana</option>
  <option value="HP">Himachal Pradesh</option>
  <option value="JK">Jharkhand</option>
</select></br>
<label>Date of Travel</label><input type="date" name="date"></br>
<label>Price of flights</label><input type="text" name="price"></br>
<label>Select Flight</label>
<select id="Fligth" name="flight_no">
 <option value='1' >Flight1</option>
  <option value='2' >Flight2</option>
   <option value='3' >Flight3</option>
    <option value='4' >Flight4</option>
 
</select></br>

<input type="Submit" value="SET SCHDULE">

</form>



</div>




</div>
</body>
</html>