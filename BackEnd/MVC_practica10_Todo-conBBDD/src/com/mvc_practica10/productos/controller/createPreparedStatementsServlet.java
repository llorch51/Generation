package com.mvc_practica10.productos.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc_practica10.productos.model.Productos;

/**
 * Servlet implementation class createPreparedStatementsServlet
 */
@WebServlet("/createPreparedStatementsServlet")
public class createPreparedStatementsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Declarar credenciales para base de datos(cajón)
		String urlServidor = "jdbc:mysql://localhost:3306/tienditageneration?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String usuario = "root";
		String password = "root";
		//String query = "insert into productos values('0',?,?,?)";// encada campo requerido ?
		String query= "insert into productos (nombre_producto,precio_producto,existenciasProducto) values (?,?,?)";
		// instanciamos de Clase Productos para settear propiedades de objeto
		Productos miproducto = new Productos();
		miproducto.setNombre_producto(request.getParameter("txtProducto"));
		miproducto.setPrecio_producto(Double.parseDouble(request.getParameter("txtPrecio")));
		miproducto.setExistencias_producto(Integer.parseInt(request.getParameter("txtExist")));
		// Declarar objetos
		Connection conn = null;
		PreparedStatement pstmnt = null;
		boolean nReg = false;

		try {
			// instanciar Driver
			Class.forName("com.mysql.cj.jdbc.Driver").getConstructor().newInstance();
			conn = DriverManager.getConnection(urlServidor, usuario, password);
			pstmnt=conn.prepareStatement(query);
			pstmnt.setString(1, miproducto.getNombre_producto());
			pstmnt.setDouble(2, miproducto.getPrecio_producto());
			pstmnt.setInt(3, miproducto.getExistencias_producto());
			nReg=pstmnt.execute();
			//ResultSet rs=pstmnt.executeQuery();
			//pstmnt.execute();
			if (nReg == true) {
				response.getWriter().append("Sí se añadió el registro");
			} else {
				response.getWriter().append("No se añadió registro");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			response.getWriter().append("<hr/><a href='create.jsp'>Regresar</a>");
			try {
				pstmnt.close();
				conn.close();
			}catch (SQLException e2){
				
			}
		}

	};

}
