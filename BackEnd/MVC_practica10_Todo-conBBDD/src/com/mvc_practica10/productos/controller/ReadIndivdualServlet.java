package com.mvc_practica10.productos.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReadIndivdualServlet
 */
@WebServlet("/ReadIndivdualServlet")
public class ReadIndivdualServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// MIME TYPE
		response.setContentType("text/html charset='UTF-8'");
		PrintWriter salida = response.getWriter();
		// Declaramos e inicializamos las credenciales de acceso
		String url = "jdbc:mysql://localhost:3306/tienditageneration?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String usuario = "root";
		String password = "root";
		
		//***************************************
		//int id=Integer.parseInt(request.getParameter("txtProducto"));
		String idprod=request.getParameter("txtProducto");
		int idproducto=0;
		String nombreProducto="";
		double precioProducto=0.0;
		int existenciasProducto=0;

		// Declaramos e inicializamos los objetos de conexión
		Connection conn = null;
		java.sql.Statement stmnt = null;
		ResultSet rs = null;

		try {
			// Se instala el driver
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();// 8.0.15
			// se abre la conexion a la base de datos
			conn = DriverManager.getConnection(url, usuario, password);
			// se apunta el objeto statement que nos sirve para ejecutar comandos en la base
			// de datos
			stmnt = conn.createStatement();
			// rs es la TERMINAL
			rs = stmnt.executeQuery("select * from productos where nombre_producto= \""+idprod+"\"");
			
				rs.next();
				idproducto=rs.getInt("id_producto");
				nombreProducto=rs.getString("nombre_producto");
				precioProducto=rs.getDouble("precio_producto");
				existenciasProducto=rs.getInt("existenciasProducto");
				response.getWriter().append("ID PRODUCTO: "+rs.getDouble("id_producto"));
				response.getWriter().append("<br/>");
				response.getWriter().append("NOMBRE PRODUCTO: "+rs.getString("nombre_producto"));
				response.getWriter().append("<br/>");
				response.getWriter().append("PRECIO PRODUCTO: "+rs.getInt("precio_producto"));
				response.getWriter().append("<br/>");
				response.getWriter().append("EXISTENCIAS: "+rs.getInt("existenciasProducto"));
				response.getWriter().append("<br/>");
//				request.setAttribute("nombre_producto", nombreProducto);
//				request.setAttribute("id_producto", idproducto);
//				request.setAttribute("precio_producto", precioProducto);
//				RequestDispatcher rst =request.getRequestDispatcher("readindividual.jsp");
//				rst.forward(request, response);
				//response.getWriter().append("puto");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Cerramos las conexiones y colocamos los objetos a disposición del garbage
			// collector
			response.getWriter().append("<br/><a href='readindividual.jsp'>Regresar</a>");
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
