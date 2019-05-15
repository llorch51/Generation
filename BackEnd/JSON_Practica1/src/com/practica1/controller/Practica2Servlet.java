package com.practica1.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practica1.model.DatosPersonales;

/**
 * Servlet implementation class Practica2Servlet
 */
@WebServlet("/Practica2Servlet")
//*****IMPORTANTEEE cuando es por POST********MULTIPARTCONFIG
@MultipartConfig
public class Practica2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DatosPersonales misDatosPersonales=new DatosPersonales(request.getParameter("txtNombre"));
		
		response.setContentType("application/json");
		response.getWriter().append("{"+"\"nombre\":\""+misDatosPersonales.getNombre()+"\"}");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
