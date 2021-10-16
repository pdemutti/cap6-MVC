package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Atracao;

@WebServlet("/cultura")
public class CulturaServlet extends HttpServlet {
	

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String pagina = "/cultura.jsp";	

		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
		dispatcher.forward(request, response);
	}
	
	private ArrayList<Atracao> criarAtracoes() {
		
		ArrayList<Atracao> atracoes = new ArrayList<Atracao>();
		
		return atracoes;
	}
}
