<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h2>PRÁCTICA 5 MVC - Scriptlets</h2>
    <table>
        <thead>
            <tr><th>ID</th><th>Nombre</th></tr>
        </thead>
        <tbody>
<!--         //SCRIPTLETS -->
<!--         //USO DE CÓDIGO JAVA EN UN HTML -->
            <%
            for(int i=0;i<100;i++){
                out.println("<tr><td>"+i+"</td><td>El macho</td></tr>");
                
            }
            %>
        </tbody>
    </table>
	
</body>
</html>