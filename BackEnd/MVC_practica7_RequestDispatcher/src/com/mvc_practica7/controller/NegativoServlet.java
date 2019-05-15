package com.mvc_practica7.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NegativoServlet
 */
@WebServlet(description = "La respuesta será negativa", urlPatterns = { "/NegativoServlet" })
public class NegativoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter salida=response.getWriter();
		response.setContentType("text/html charset='UTF-8'");
		
		salida.append("El resultado es Negativo! =)");
		salida.close();
	}

}
