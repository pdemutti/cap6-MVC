package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DataSource;
import dao.UsuarioDAO;
import model.Usuario;


@WebServlet("/login")
public class Login extends HttpServlet {
	private UsuarioDAO user = new UsuarioDAO(new DataSource());

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String pagina = "/login.jsp";	
		
		request.getSession().setAttribute("login", "");

		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
		dispatcher.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String pagina = "/login.jsp";

		Usuario novoUser = new Usuario(null,request.getParameter("username"), request.getParameter("password"));
		
			
		if(this.user.read(novoUser) != null) {		
			pagina = "/home.jsp";
		} else {
			request.getSession().setAttribute("login", "Login invalido");
		};
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
		dispatcher.forward(request, response);
		
	}
}


