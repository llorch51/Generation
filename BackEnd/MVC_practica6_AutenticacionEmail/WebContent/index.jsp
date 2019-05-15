<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="Css/style.css">
    <title>Insert title here</title>
</head>

<body>

    <h1>Practica 6 Autenticación JSP y Servlets</h1>
    <form action="ServletLogin" method="post">
        <div class="form-group">
            <p>
                <label for="txtMail">Mail: </label>
                <input type="text" name="txtMail" id="txtMail" class="form-control" placeholder="llorch@hotmail.es">
            </p>
        </div>
        <div class="form-group">
            <p>
                <label for="txtPassword">Password: </label>
                <input type="text" name="txtPassword" id="txtPassword" class="form-control"
                    placeholder="****">
            </p>
        </div>
        <div id="btnEnviar">
            <p>
                <input class="btn btn-primary" type="submit" value="ValidarEmail">
            </p>
        </div>
    </form>

    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous">
    </script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous">
    </script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous">
    </script>
    <script src="Script/script.js"></script>
</body>

</html>