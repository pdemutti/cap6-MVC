package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DataSource;
import dao.UsuarioDAO;
import model.Usuario;

@WebServlet("/cadastro")
public class Cadastro extends HttpServlet {
	
	private UsuarioDAO user = new UsuarioDAO(new DataSource());

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String pagina = "/cadastro.jsp";	
		request.getSession().setAttribute("error", "");
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
		dispatcher.forward(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		HttpSession session = request.getSession();  
		
		if (!request.getParameter("nome").isEmpty() && !request.getParameter("email").isEmpty() && !request.getParameter("senha").isEmpty()) {
			Usuario usuario = new Usuario(request.getParameter("nome"), request.getParameter("email"), request.getParameter("senha"));	
			
			this.user.create(usuario);
			
			session.setAttribute("error", "Cadastro Realizado com sucesso!");
			
		
		} else {
			session.setAttribute("error", "Todos os campos sao obrigatorios!");
			System.out.println("PARAMETROS VAZIOS");
		}
		

		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/cadastro.jsp");
		dispatcher.forward(request, response);
	}
	
}
