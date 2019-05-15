package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.autentication.AutenticationService;
import com.utileria.Usuario;

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet(description = "Para hacer un Login", urlPatterns = { "/ServletLogin" })
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email=request.getParameter("txtMail");
		String password=request.getParameter("txtPassword");
		
		
		AutenticationService autServ=new AutenticationService();
		Usuario usuario=autServ.authentication(email, password);
		
		if(usuario != null) {
			request.setAttribute("user", usuario);
			RequestDispatcher dispatcher=request.getRequestDispatcher("exito.jsp");
			dispatcher.forward(request, response);
		}else {
			PrintWriter out=response.getWriter();
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Usuario o contraseña no válido, intente de nuevo')");
			out.println("location='index.jsp'");
			out.println("</script>");
		}
		
	}

}
