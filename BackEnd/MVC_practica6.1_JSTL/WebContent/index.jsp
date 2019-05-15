<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<!-- /*bootstrap CSS*/ -->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
		integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

	<link rel="stylesheet" href="Css/style.css">
	<title>JSTL</title>
</head>

<body>

	<h1>Práctica 6.1 - JSTL</h1>

	<c:out value="Testo!!1"></c:out>
	<% out.println("Testo2"); %>
	<c:set var="miMensajitu" value="Hola3"></c:set>
	<c:out value="${miMensajitu}"></c:out>

	<%-- <%-- 	<%for(int i=0;i<10;i++){ --%>
	<!-- // 		out.println("Número: "+i); -->
	<%-- <%-- 	} %> --%>


	<table class="table-hover">
		<thead>
			<tr>
				<th>Descripción</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="j" begin="1" end="10">
			<tr><td><c:out value="Número: ${j}"></c:out></td></tr>
			</c:forEach>
		</tbody>
	</table>

	<!-- jquery -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous">
	</script>
	<!-- popper -->
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous">
	</script>
	<!-- bootstrap Javascript -->
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous">
	</script>
	<!-- Script propio -->
	<script src="Script/script.js"></script>
</body>

</html>