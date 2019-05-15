<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<link rel="stylesheet" href="Css/style.css">
<title>Insert title here</title>
</head>
<body>
<h1>CREATE</h1>

<div class="container center_div">
		<div class="row">
			<div class="col align-self-start">
				<li class="nav-item"><a class="nav-link" href="index.jsp">Regresar</a>
				</li>
			</div>
			<div class="col align-self-center">
				<form action="../createPreparedStatementsServlet" method="post">
					<div class="form-group">
						<label for="txtProducto">Producto</label> <input type="text"
							class="form-control" id="txtProducto" placeholder="Gansito" name="txtProducto">
					</div>
					<div class="form-group">
						<label for="txtPrecio">Precio</label> <input type="text"
							class="form-control" id="txtPrecio" placeholder="$10.00" name="txtPrecio">
					</div>
					<div class="form-group">
						<label for="txtExist">Existencias</label> <input type="text"
							class="form-control" id="txtExist" placeholder="" name="txtExist">
					</div>
					<button type="submit" class="btn btn-primary">Alta</button>
				</form>
			</div>
			<div class="col align-self-start"></div>
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