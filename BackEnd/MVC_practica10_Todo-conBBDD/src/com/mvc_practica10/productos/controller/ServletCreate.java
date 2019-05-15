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

/**
 * Servlet implementation class ServletCreate
 */
@WebServlet("/ServletCreate")
public class ServletCreate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//vemos si funciona
		//response.getWriter().append("Puto");
		
		//*******************Declar variables**********************CONNECTION STRING
		//Declarar credenciales para base de datos(cajón)
		String urlServidor = "jdbc:mysql://localhost:3306/tienditageneration?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String usuario = "root";
		String password = "root";
		
		// Traerse valores del Front
		String nombreProducto = request.getParameter("txtProducto");
		Double precioProducto = Double.parseDouble(request.getParameter("txtPrecio"));
		int existenciasProducto = Integer.parseInt(request.getParameter("txtExist"));
		//realizamos el query
		String query =  "insert into productos values ('0', '" + nombreProducto + "', " + precioProducto + ", "+ existenciasProducto + ")";
		
		//Declaramos objetos
		Connection conn = null;
		java.sql.Statement stmnt = null;
		int nReg=0;
		//instanciamos driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conn=DriverManager.getConnection(urlServidor, usuario, password);
			
			//creamos la consola
			stmnt=conn.createStatement();
			//realizamos el query
			nReg=stmnt.executeUpdate(query);
			if(nReg>0) {
				response.getWriter().append("Sí se dio de alta el registro");
			}else {
				response.getWriter().append("No se realizó el registro");
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
