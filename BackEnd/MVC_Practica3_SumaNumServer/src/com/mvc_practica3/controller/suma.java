package com.mvc_practica3.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class suma
 */
@WebServlet("/suma")
public class suma extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1=Integer.parseInt(request.getParameter("txtNum1"));
		int num2=Integer.parseInt(request.getParameter("txtNum2"));
		int res=num1+num2;
		
		response.getWriter().append("La suma de "+num1+" + "+num2+" es igual a "+res);
		response.getWriter().println("Puto puto!!");
	}

}
