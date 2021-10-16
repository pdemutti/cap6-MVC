package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class Login extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String pagina = "/login.jsp";	

		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
		dispatcher.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String pagina = "/error.jsp";
		System.out.println("username :: " + request.getParameter("username"));
		System.out.println("password :: " + request.getParameter("password"));
		
		
		if ( "lucas".equals(request.getParameter("username")) && "lucas".equals(request.getParameter("password"))) {
			System.out.println("entrei aqui");
			 pagina = "/home.jsp";
		} else {
			 pagina = "/parceiro-n-encontrado.jsp";
		}
		
		System.out.println(pagina);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
		dispatcher.forward(request, response);
		
	}
}
