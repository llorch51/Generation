package com.mvc_practica10.props.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
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
 * Servlet implementation class transactionServlet
 */
@WebServlet("/transactionServlet")
public class transactionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append(".l.");
		//Obtener datos del archivo de propiedades
				//String result="";
				//Crear elobjeto Properties
				Properties props=new Properties();
				//declarar elnombre del archivo de propiedades
				String nombreArchivo="config.properties";
				//Instanciamos el Stream
				InputStream inputStream=getClass().getClassLoader().getResourceAsStream(nombreArchivo);
				//Si se encontró el archivo o no
				if(inputStream!=null) {
					props.load(inputStream);
				}else {
					throw new FileNotFoundException("Property File"+nombreArchivo+"No se encontró en el classPath");
				}
				//Si sí lo encontró
				String urlServidor=props.getProperty("urlServidor");
				String usuario=props.getProperty("usuario");
				String password=props.getProperty("password");
				String aProducto1=props.getProperty("altaProductos1");
				String aProducto2=props.getProperty("altaProductos2");
				String aProducto3=props.getProperty("altaProductos3");
				String aProducto4=props.getProperty("altaProductos4");
				String aProducto5=props.getProperty("altaProductos5");
				String driver=props.getProperty("driver");
				//String query=props.getProperty("sentenciaSQL");
				
				//Declaración de los objetos
				Connection conn=null;
				PreparedStatement pstmnt=null;
				boolean nRegistros=false;
				
				try {
					//Abrir la conexión
					Class.forName(driver).getDeclaredConstructor().newInstance();
					conn=DriverManager.getConnection(urlServidor, usuario, password);
					conn.setAutoCommit(false);
					//Productos
					pstmnt=conn.prepareStatement(aProducto1);
					pstmnt.setString(1, "Coca Cola");
					pstmnt.setDouble(2, 3);
					pstmnt.setInt(3, 30);
					pstmnt.executeUpdate();
					pstmnt.close();
					
					pstmnt=conn.prepareStatement(aProducto2);
					pstmnt.setString(1, "Pecsi");
					pstmnt.setDouble(2, 13);
					pstmnt.setInt(3, 40);
					pstmnt.executeUpdate();
					conn.commit();
					
				}catch (Exception e) {
					e.printStackTrace();
					try {
						conn.rollback();
					}catch(SQLException e1){
						e1.printStackTrace();
					}
					e.printStackTrace();
				}finally {
					//response.getWriter().append("<hr/><a href='create.jsp'>Regresar</a>");
					try {
						pstmnt.close();
						conn.close();
					}catch (SQLException e2){
						e2.printStackTrace();
					}
				}
	}

}
