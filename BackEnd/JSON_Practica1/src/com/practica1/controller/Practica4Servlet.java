package com.practica1.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.practica1.model.DatosPersonales;

/**
 * Servlet implementation class Practica4Servlet
 */
@WebServlet("/Practica4Servlet")
public class Practica4Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append(".l.");
		
		response.setContentType("text/html");
		String json=request.getParameter("txtJson");
		DatosPersonales dp=new DatosPersonales();
		Gson gson=new Gson();
		dp=gson.fromJson(json, DatosPersonales.class);
		PrintWriter salida=response.getWriter();
		salida.append("Nombre: "+dp.getNombre()+" ");
		salida.append("Apellido Paterno: "+dp.getApellidoPat()+" ");
		salida.append("Apellido Materno"+dp.getApellidoMat()+" ");
		salida.append("Domicilio: "+dp.getDomicilio()+" ");
		salida.append("Edad: "+dp.getEdad()+" ");
		salida.append("Sexo: "+dp.getSexo()+" ");
		salida.append("Estatura: "+dp.getEstatura());
		
		
		
	}

}
