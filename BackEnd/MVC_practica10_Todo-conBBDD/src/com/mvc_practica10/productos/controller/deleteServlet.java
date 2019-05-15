package com.mvc_practica10.productos.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class deleteServlet
 */
@WebServlet("/deleteServlet")
public class deleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String urlServidor = "jdbc:mysql://localhost:3306/tienditageneration?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String usuario = "root";
		String password = "root";
		
		// Traerse valores del Front
		String idProducto=request.getParameter("txtID");
//		String nombreProducto = request.getParameter("txtProducto");
//		Double precioProducto = Double.parseDouble(request.getParameter("txtPrecio"));
//		int existenciasProducto = Integer.parseInt(request.getParameter("txtExist"));
		//String query =  "update productos set values (";
//		update productos set nombre_producto="chocorroles",precio_producto=15,existenciasProducto=45 where id_producto=12;
		
		//Declaramos objetos
		Connection conn = null;
		java.sql.Statement stmnt = null;
		int nReg=0;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conn=DriverManager.getConnection(urlServidor, usuario, password);
			
			//creamos la consola
			stmnt=conn.createStatement();
			//realizamos el query
			//update productos set nombre_producto="chocorroles",precio_producto=15,existenciasProducto=45 where id_producto=12;
			nReg=stmnt.executeUpdate("delete from productos where id_producto="+idProducto+";");
			if(nReg>0) {
				response.getWriter().append("Sí se eliminó el registro");
			}else {
				response.getWriter().append("No se eliminó el registro");
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		} finally {
			
			response.getWriter().append("</br><a href='create.jsp'>Regresar</a>");
			try {
				stmnt.close();
				conn.close();
			}catch (SQLException e2){
				
			}
		}
	}

}
