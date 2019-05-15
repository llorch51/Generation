package com.mvc_practica9.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AuthenticateServlet
 */
@WebServlet("/AuthenticateServlet")
public class AuthenticateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println("Estamos en el Servlet");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("Estamos en el Servlet");
		String user=request.getParameter("txtUsuario");
		String pass=request.getParameter("txtPass");
		response.setContentType("text/html charset=UTF-8");
		PrintWriter out=response.getWriter();
		
		if(user.equals("admin")&&pass.equals("1234")) {
			//true--si elobjeto session ya existe
			HttpSession objetoSesion=request.getSession(true);
			objetoSesion.setAttribute("Usuario", user);
			objetoSesion.setAttribute("Password", pass);
			objetoSesion.setMaxInactiveInterval(30);
			response.sendRedirect("logueado.jsp");
			
		}else {
			RequestDispatcher dis=request.getRequestDispatcher("login.jsp");
			out.println("<font color='red'>Credenciales inválidas</font>");
			dis.include(request, response);
		}
		out.close();
		
	}

}
