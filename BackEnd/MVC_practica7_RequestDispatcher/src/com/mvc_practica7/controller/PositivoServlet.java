package com.mvc_practica7.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PositivoServlet
 */
@WebServlet("/PositivoServlet")
public class PositivoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Para generar respuesta visual
		PrintWriter salida=response.getWriter();
		response.setContentType("text/html charset='UTF-8'");
		
		int resultado=(int) request.getAttribute("pizza");
		//int resResta=(int)request.getAttribute("tacos");
		//int resMult=(int)request.getAttribute("tamal");
		//int resDiv=(int)request.getAttribute("tortas");
		
		salida.append("El valor de Num1:  "+request.getParameter("txtNum1"));
		salida.append("El valor de Num2 "+request.getParameter("txtNum2"));
		salida.append("El valor de la suma es "+resultado);
		salida.append("El resultado es positivo! =)");
		salida.close();
	}

}
