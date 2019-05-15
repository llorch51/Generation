<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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

<title>Insert title here</title>
</head>
<body>

	<h1>Práctica 9 - Sesiones</h1>
	<div class="container">
		<div class="row">
			<div class="col"></div>

			<div class="col">
				<form method="post" action="AuthenticateServlet">
					<div class="form-group">
						<p>
							<label for="txtUsuario">Usuario: </label> <input type="text"
								id="txtUsuario" name="txtUsuario" class="form-control">
						</p>
					</div>
					<div class="form-group">
						<p>
							<label for="txtPass">Constraseña: </label> <input type="Password"
								id="txtPass" name="txtPass" class="form-control">
						</p>
					</div>
					<div class="form-actions">
					<p>
						<input type="submit" value="Login" class="btn btn-danger btn-md">
					</p>
					</div>
				</form>
			</div>
			<div class="col"></div>
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