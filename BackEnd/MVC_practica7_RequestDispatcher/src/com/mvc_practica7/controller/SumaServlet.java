package com.mvc_practica7.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SumaServlet
 */
@WebServlet(description = "Sumará dos números", urlPatterns = { "/SumaServlet" })
public class SumaServlet extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	//Request-paquetede datos que se obtiene del index al enviar(submit)						 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Parsear, pues todo lo que se manda es texto				  
		int num1=Integer.parseInt(request.getParameter("txtNum1"));
		//De todo ese paquete que trae desd index, pásame el q tiene etiqueta txtNum2
		int num2=Integer.parseInt(request.getParameter("txtNum2"));
		int resultado=num1+num2;
		//int resResta=num1-num2;
		//int resMult=num1*num2;
		//float resDiv=num1/num2;
		//******************************************************************
		//Al pack de datos que viene de index, le añadiré esto
		//Mover |qué| por todo el back
		//		como poner Name en html
		//					ID/NAME	,¿Qué voy a mover?
		request.setAttribute("pizza", resultado);
		//request.setAttribute("tacos", resResta);
		//request.setAttribute("tamal", resMult);
		//request.setAttribute("torta", resDiv);
		//************************************************************************
		if(resultado>0 && resultado !=37) {
			//Esto se va a mandar a otro lado(servlet)
			//Petición||nombreCualquiera				   ¿Dónde va a apuntar?
			RequestDispatcher rs=request.getRequestDispatcher("PositivoServlet");
			rs.forward(request, response);
		}else if(resultado<0) {
			RequestDispatcher rs=request.getRequestDispatcher("NegativoServlet");
			rs.forward(request, response);
		}
		else if(resultado==37) {
			RequestDispatcher rs=request.getRequestDispatcher("macho.jsp");
			rs.forward(request, response);
			
		}else {
			RequestDispatcher rs=request.getRequestDispatcher("Cero.jsp");
			rs.forward(request, response);
		}
		
	}

}
