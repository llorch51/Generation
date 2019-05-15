<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- /*bootstrap CSS*/ -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<link rel="stylesheet" href="Css/style.css">
<title>Práctica 8</title>
</head>
<body>
	<h1>***Práctica 8 RoundTrip con JSTL***</h1>
	<div class="container center_div">
		<div class="row">
			<div class="col align-self-start"></div>
			<div class="col align-self-center">
				<form action="index.jsp" method="post" id="todo">
					<div class="form-group">
						<p>
							<label for="txtNom">Nombre Alumno: </label> <input type="text"
								name="txtNom" id="txtNom" class="form-control" value="">
						</p>
					</div>
					<div class="form-group">
						<p>
							<label for="txtCal">Calificación 1: </label> <input type="text"
								name="txtCal" id="txtCal" class="form-control" value="0.0">
						</p>
					</div>
					<div class="form-group">
						<p>
							<label for="txtCal2">Calificación 2: </label> <input type="text"
								name="txtCal2" id="txtCal2" class="form-control" value="0.0">
						</p>
					</div>
					<div id="btnEnviar" class="form-actions">
						<p>
							<input class="btn btn-danger btn-md" type="submit"
								value="Promedio">
						</p>
					</div>
					<p>
						<jsp:useBean id="objAlumno" class="com.mvc_practica8.model.AlumnoDatos"></jsp:useBean>
							
						<c:set target="${objAlumno}" property="nombre" value="${param.txtNom}"></c:set>
							
						<c:set target="${objAlumno}" property="cal1" value="${param.txtCal}"></c:set>
							
						<c:set target="${objAlumno}" property="cal2" value="${param.txtCal2}"></c:set>

						El promedio es
						<c:out value="${objAlumno.cal1}"></c:out>
						y
						<c:out value="${objAlumno.cal2}"></c:out>
					</p>
				</form>
			</div>
			<div class="col align-self-end"></div>
		</div>
	</div>





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