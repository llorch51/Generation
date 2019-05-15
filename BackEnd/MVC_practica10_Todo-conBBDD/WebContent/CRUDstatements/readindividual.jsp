<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- /*bootstrap CSS*/ -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
        crossorigin="anonymous">

    <link rel="stylesheet" href="Css/style.css">

<title>Insert title here</title>
</head>
<body>
<h1>CONSULTA INDIVIDUAL</h1>

<p>
	
</p>

<nav class="navbar navbar-expand-lg navbar-light bg-light  ">
  <div class="collapse navbar-collapse justify-content-center" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link" href="create.jsp">CREATE</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="read.jsp">READ</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="update.jsp">UPDATE</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="delete.jsp">DELETE</a>
      </li>
    </ul>
  </div>
</nav>
<div class="container center_div">
		<div class="row">
			<div class="col align-self-start"></div>
			<div class="col align-self-center">
				<form action="ReadIndivdualServlet" method="post">
					<div class="form-group">
						<label for="txtProducto">Producto</label> <input type="text"
							class="form-control" id="txtProducto" placeholder="" name="txtProducto">
					</div>
					<button type="submit" class="btn btn-primary">Consultar</button>
				</form>
			</div>
			<div class="col align-self-start"></div>
		</div>
	</div>
<li class="nav-item">
        <a class="nav-link" href="index.jsp">HOME</a>
      </li>
<li class="nav-item">
        <a class="nav-link" href="read.jsp">Regresar</a>
      </li>



<!-- jquery -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
    <!-- popper -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
    <!-- bootstrap Javascript -->
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
    <!-- Script propio -->
    <script src="Script/script.js"></script>
</body>
</html>