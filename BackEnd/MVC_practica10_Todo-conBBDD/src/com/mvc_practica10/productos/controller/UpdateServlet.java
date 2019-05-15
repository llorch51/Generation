package com.mvc_practica10.productos.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc_practica10.productos.model.Productos;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Declarar credenciales para base de datos(cajón)
				String urlServidor = "jdbc:mysql://localhost:3306/tienditageneration?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
				String usuario = "root";
				String password = "root";
				
				// Traerse valores del Front
				int idProducto=Integer.parseInt(request.getParameter("txtID"));
				String nombreProducto = request.getParameter("txtProducto");
				Double precioProducto = Double.parseDouble(request.getParameter("txtPrecio"));
				int existenciasProducto = Integer.parseInt(request.getParameter("txtExist"));
				//String query =  "update productos set values (";
//				update productos set nombre_producto="chocorroles",precio_producto=15,existenciasProducto=45 where id_producto=12;
				
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
					nReg=stmnt.executeUpdate("update productos set nombre_producto='"+nombreProducto+"',precio_producto=" +precioProducto+", existenciasProducto="+existenciasProducto+" where id_producto="+idProducto+"; ");
					if(nReg>0) {
						response.getWriter().append("Sí se actualizó el registro");
					}else {
						response.getWriter().append("No se actualizó el registro");
					}
				} catch (Exception e) {
					
					e.printStackTrace();
				} finally {
					response.getWriter().append("<a href='create.jsp'>Regresar</a>");
					try {
						stmnt.close();
						conn.close();
					}catch (SQLException e2){
						
					}
				}
		
	}

}
