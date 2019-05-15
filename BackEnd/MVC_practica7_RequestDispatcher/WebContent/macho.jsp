<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- /*bootstrap CSS*/ -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<link rel="stylesheet" href="Css/style.css">

<title>Macho</title>
</head>
<body>
	<h1>Macho!!! JSTL</h1>


	<%
		out.println("Has llegado hasta aquí!!!");
	%><br>
	<c:out value="${param.txtNum1}"></c:out>
	<br>
	<c:out value="${param.txtNum2}"></c:out>
	<br>
	<%-- <c:set var="respuesta" value="${param.txtNum1}"></c:set> --%>
	<%-- <c:set var="respuesta" value="${param.txtNum2}"></c:set> --%>
	<c:out value="${pizza}"></c:out>

	<%-- Cuando se requiere traer un input type="text" que utiliza el método request.getParameter("input"),
	 se utiliza la notación ${param.nombreDelInputType}  --%>
	<%-- Cuando se requiere traer un atributo específicado en servlet como request.setAttribute("nombreAtributo",nombreVariable) 
	que utiliza el método request.getAttribute("nombreAtributo"),
	 se utiliza la notación ${nombreAtributo} --%>
	<table class="table-bordered table-hover">
		<thead>
			<tr class="bg-danger">
				<th>Número 1:</th>
				<th>Número 2:</th>
				<th>Resultado:</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td><c:out value="${param.txtNum1}"></c:out></td>
				<td><c:out value="${param.txtNum2}"></c:out></td>
				<td><c:out value="${pizza}"></c:out></td>
			</tr>



		</tbody>

	</table>

	<!-- jquery -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<!-- popper -->
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<!-- bootstrap Javascript -->
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
	<!-- Script propio -->
	<script src="Script/script.js"></script>
</body>
</html>