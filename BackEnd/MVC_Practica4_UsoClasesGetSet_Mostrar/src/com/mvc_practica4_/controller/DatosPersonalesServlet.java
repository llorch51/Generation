package com.mvc_practica4_.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mvc_practica4_.model.DatosPersonales;

@WebServlet(description = "Datos personales", urlPatterns = { "/DatosPersonalesServlet" })
public class DatosPersonalesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nombre,apellidoPat,apellidoMat,sexo;
		String[] mascotas=new String[3];
		int estatura;
		int edad;
		
		nombre=request.getParameter("txtNombre");
		apellidoPat=request.getParameter("txtApellidoPat");
		apellidoMat=request.getParameter("txtApellidoMat");
		sexo=request.getParameter("rdbSexo");
		estatura=Integer.parseInt(request.getParameter("txtEstatura"));
		edad=Integer.parseInt(request.getParameter("txtEdad"));
		mascotas=request.getParameterValues("chkMas");
		
		response.getWriter().append("Nombre: "+nombre);
		response.getWriter().append(" Apellido Paterno: "+apellidoPat);
		response.getWriter().append(" Apellido Materno: "+apellidoMat);
		response.getWriter().append(" Sexo: "+sexo);
		response.getWriter().append(" Mascotas: "+mascotas+" ");
		//****************************************************
		//response.getWriter().append("Mascotas: "+mascotas[0]);
		//response.getWriter().append("Mascotas: "+mascotas[1]);
		//response.getWriter().append("Mascotas: "+mascotas[2]);
		
		for(String mascotita:mascotas) {
			response.getWriter().append("Mascotas: "+mascotita);
		}
		
		DatosPersonales Pau=new DatosPersonales();
		DatosPersonales Mike=new DatosPersonales();
		DatosPersonales Monche=new DatosPersonales();
		
		ArrayList<DatosPersonales> registros=new ArrayList<DatosPersonales>();
		
		registros.add(new DatosPersonales());
		
		Pau.setNombre(nombre);
		Pau.setApellidoMat(apellidoMat);
		Pau.setApellidoPat(apellidoPat);
		Pau.setEdad(edad);
		Pau.setEstatura(estatura);
		Pau.setSexo(sexo);
		Pau.setMascotas(mascotas);
		
		Mike.setNombre("Mike");
		Mike.setApellidoPat("papá mike");
		Mike.setApellidoMat("mamá mike");
		
		
		PrintWriter salida= response.getWriter();
		response.setContentType("text/html charset=UTF-8");
		
		salida.append("<html>");
		salida.append("<head>");
		salida.append("<title>");
		salida.append("Datos Personales");
		salida.append("</title>");
		salida.append("</head>");
		salida.append("<body>");
		salida.append("<h2>Datos Personales</h2>");
		salida.append("");
		salida.append("");
		salida.append("");
		salida.append("</body>");
		
		salida.append("</html>");
		
		//Mike.setNombre(request.getParameter("txtNombre"));
		//Mike.setNombreMadre(request.getParameter("txtNameP"));
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
