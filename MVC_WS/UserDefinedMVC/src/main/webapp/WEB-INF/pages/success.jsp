<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"
%>
<html>
<body bgcolor="lightblue">
	<center>
		<h1>Spring MVC Student Application</h1>
		<hr>
		Message :
		<%=request.getAttribute("studentDetails")%>
		<br /> Message : ${studentDetails}
	</center>
</body>
</html>
