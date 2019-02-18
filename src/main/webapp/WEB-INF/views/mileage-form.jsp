<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>form</title>
</head>
<body>

	<h2>How many miles are left in your tank?</h2>
	<form action="/result">
	<p>
		Mileage (MPG): <input type="text" name="mpg" />
	</p>
	<p>
		Gallons in tank: <input type="text" name="gallons" />		
	</p>
	<p>
	<button type="submit">CALCULATE</button>
	</p>
	</form>

</body>
</html>