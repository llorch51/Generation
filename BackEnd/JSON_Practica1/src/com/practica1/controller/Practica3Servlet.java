package com.practica1.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practica1.model.DatosPersonales;

/**
 * Servlet implementation class Practica3Servlet
 */
@WebServlet("/Practica3Servlet")
public class Practica3Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append(".l.");
//		DatosPersonales misDatosPersonales=new DatosPersonales(request.getParameter("txtNombre"),request.getParameter("txtApellidoPat"),
//				request.getParameter("txtApellidoMat"),request.getParameter("txtDomicilio"),Integer.parseInt(request.getParameter("txtEdad")),
//				request.getParameter("txtSexo"),Double.parseDouble(request.getParameter("txtEstatura")));
		
		String nombre=request.getParameter("txtNombre");
		String apellidoPat=request.getParameter("txtApellidoPat");
		String apellidoMat=request.getParameter("txtApellidoMat");
		String domicilio=request.getParameter("txtDomicilio");
		int edad=Integer.parseInt(request.getParameter("txtEdad"));
		String sexo=request.getParameter("txtSexo");
		double estatura=Double.parseDouble(request.getParameter("txtEstatura"));
		
		DatosPersonales dp=new DatosPersonales();
		dp.setNombre(nombre);
		dp.setApellidoPat(apellidoPat);
		dp.setApellidoMat(apellidoMat);
		dp.setDomicilio(domicilio);
		dp.setEdad(edad);
		dp.setSexo(sexo);
		dp.setEstatura(estatura);
		
		
		response.getWriter().append(dp.getNombre());
		response.getWriter().append(apellidoPat);
		response.getWriter().append(apellidoMat);
		response.getWriter().append(domicilio);
		response.getWriter().append("Edad: "+edad);
		response.getWriter().append(sexo);
		response.getWriter().append("Estatura: "+estatura);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
