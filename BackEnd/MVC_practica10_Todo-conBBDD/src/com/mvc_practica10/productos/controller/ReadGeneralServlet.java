package com.mvc_practica10.productos.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.xdevapi.Statement;

/**
 * Servlet implementation class ReadGeneralServlet
 */
@WebServlet("/ReadGeneralServlet")
public class ReadGeneralServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//							MIME TYPE
		response.setContentType("text/html charset='UTF-8'");
		PrintWriter salida=response.getWriter();
		//Declaramos e inicializamos las credenciales de acceso
		String url="jdbc:mysql://localhost:3306/tienditageneration?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String usuario="root";
		String password="root";
		
		//Declaramos e inicializamos los objetos de conexión
		Connection conn=null;
		java.sql.Statement stmnt=null;
		ResultSet rs=null;
		
		try {
			//Se instala el driver
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();//8.0.15
			//se abre la conexion a la base de datos
			conn=DriverManager.getConnection(url, usuario, password);
			//se apunta el objeto statement que nos sirve para ejecutar comandos en la base de datos 
			stmnt=conn.createStatement();
			//rs es la TERMINAL
			rs=stmnt.executeQuery("SELECT * FROM PRODUCTOS");
			while(rs.next()) {
				salida.append("ID PRODUCTO: "+rs.getDouble("id_producto"));
				salida.append("<br/>");
				salida.append("NOMBRE PRODUCTO: "+rs.getString("nombre_producto"));
				salida.append("<br/>");
				salida.append("PRECIO PRODUCTO: "+rs.getInt("precio_producto"));
				salida.append("<br/>");
				salida.append("EXISTENCIAS: "+rs.getInt("existenciasProducto"));
				salida.append("<br/>");
				salida.append("<hr/>");
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//Cerramos las conexiones y colocamos los objetos a disposición del garbage collector
			response.getWriter().append("<a href='readgeneral.jsp'>Regresar</a>");
			try {
				rs.close();
				stmnt.close();
				conn.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		salida.close();
		
	}

}
