<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lightyellow">
	<br>
	<u>Get invoke test controller:</u>
	<form action="./findTest.t" method="POST">
		<input type="submit" value="find A Test" />
	</form>
	<u>Get invoke add controller:</u>
	<form action="./findSum.t" method="POST">
		<br>Enter first number:<input type="text" name="num1" /> <br>Enter
		second number:<input type="text" name="num2" /> <input type="submit"
			value="get sum" />
	</form>

	<br>
	<u>Get a Student details by entering rollNum:</u>
	<form action="./findStudent.t" method="POST">
		<br>Enter rollNum:<input type="text" name="rollNum" /> <input
			type="submit" value="find A Student" />
	</form>



</body>
</html>
