<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"
%>
<html>
 <body bgcolor="PINK" >
   <center>
	<h1>Spring MVC Student Application Error Page</h1>
    	<hr>
			Message : <%= request.getAttribute("errorDetails") %> <br/>
			Message : ${errorDetails}
   </center>
 </body>
</html>
