package com.mvc_practica2.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(description = "Manda Mensaje", urlPatterns = { "/MensajeServlet" })
public class MensajeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String miMensaje="";
		miMensaje=request.getParameter("txtMensaje");//identificador "name" en HTML
		response.getWriter().append("Tu mensaje fue: (M�todo GET)"+miMensaje);
		//GET pone todo lo escrito en la barra de direcci�n(Atributos)
		//acceder a un link
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String miMensaje="";
		miMensaje=request.getParameter("txtMensaje");//identificador "name" en HTML
		response.getWriter().append("Tu mensaje fue: (M�todo POST)"+miMensaje);
		//POST no aparecen atributos en barra de direcci�n
		//enviar informaci�n
	}

	

}
