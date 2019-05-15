<%@page import="com.utileria.Usuario"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Éxito!</title>
</head>
<body>
	<h1>Ingresado con Éxito!!! :D</h1>
	
	<% Usuario user=(Usuario)request.getAttribute("user"); %>
	<h1>${user.email}</h1>

</body>
</html>