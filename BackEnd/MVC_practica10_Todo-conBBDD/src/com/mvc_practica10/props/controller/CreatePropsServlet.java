package com.mvc_practica10.props.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc_practica10.productos.model.Productos;

/**
 * Servlet implementation class CreatePropsServlet
 */
@WebServlet("/CreatePropsServlet")
public class CreatePropsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("puto");
		
//		// Declarar credenciales para base de datos(cajón)
//		String urlServidor = "jdbc:mysql://localhost:3306/tienditageneration?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
//		String usuario = "root";
//		String password = "root";
//		String query = "insert into productos values('0',?,?,?)";
		
		//Obtener datos del archivo de propiedades
		String result="";
		//Crear elobjeto Properties
		Properties props=new Properties();
		//declarar elnombre del archivo de propiedades
		String nombreArchivo="config.properties";
		//Instanciamos el Stream
		InputStream inputStream=getClass().getClassLoader().getResourceAsStream(nombreArchivo);
		
		if(inputStream!=null) {
			props.load(inputStream);
		}else {
			throw new FileNotFoundException("Property File"+nombreArchivo+"No se encontró en el classPath");
		}
		String urlServidor=props.getProperty("urlServidor");
		String usuario=props.getProperty("usuario");
		String password=props.getProperty("password");
		String query=props.getProperty("sentenciaSQL");
		
		// Traerse valores del Front
		Productos miProducto=new Productos();
		miProducto.setNombre_producto(request.getParameter("txtProducto"));
		miProducto.setPrecio_producto(Double.parseDouble(request.getParameter("txtPrecio")));
		miProducto.setExistencias_producto(Integer.parseInt(request.getParameter("txtExist")));
		
		
		
		// Declarar objetos
		Connection conn=null;
		PreparedStatement pstmnt=null;
		boolean nRegistros=false;
		
		try {
			// instanciar Driver
			Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
			//se abre la conexion a la base de datos
			conn=DriverManager.getConnection(urlServidor, usuario, password);
			//realizamos el query
			pstmnt=conn.prepareStatement(query);
			//pstmnt.setInt(1, 0);
			pstmnt.setString(1, miProducto.getNombre_producto());
			pstmnt.setDouble(2, miProducto.getPrecio_producto());
			pstmnt.setInt(3, miProducto.getExistencias_producto());
			nRegistros=pstmnt.execute();
			nRegistros=true;
			
			if(nRegistros==true) {
				response.getWriter().append("Registro exitoso!");
			}else {
				response.getWriter().append("Registro NO exitoso!");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			response.getWriter().append("<hr/><a href='create.jsp'>Regresar</a>");
			try {
				pstmnt.close();
				conn.close();
			}catch (SQLException e2){
				
			}
		}
		
		
//		response.getWriter().append("Valor del parámetro urlServidor"+props.getProperty("urlServidor"));
//		response.getWriter().append("<br/>");
//		response.getWriter().append("Valor del parámetro Usuario: "+props.getProperty("usuario"));
//		response.getWriter().append("<br/>");
//		response.getWriter().append("Valor del parámetro Password: "+props.getProperty("password"));
//		response.getWriter().append("<br/>");
//		response.getWriter().append("Valor del parámetro SentenciaSQL: "+props.getProperty("sentenciaSQL"));
		
		inputStream.close();
				
				
		
	}

}
