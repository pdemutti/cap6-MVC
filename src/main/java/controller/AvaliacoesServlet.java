package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Avaliacao;
import model.Parceiro;
import model.Usuario;

@WebServlet("/parceiro")
public class AvaliacoesServlet extends HttpServlet {
	

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String pagina;
		
		ArrayList<Parceiro> listaParceiros = this.criarParceiros();
		
		String id = request.getParameter("id");
		
		if (id == null) {
			pagina = "/error.jsp";
		} else {
			pagina = "/avaliacoes.jsp";
			
			try {
				listaParceiros.get(Integer.parseInt(id));
				request.setAttribute("Parceiro", listaParceiros.get(Integer.parseInt(id)));
			} catch (Exception e) {
				pagina = "/parceiro-n-encontrado.jsp";
			}
		}
		
		
		// RETORNA A TELA DE AVALIACOES
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
		dispatcher.forward(request, response);
	}
	
	private ArrayList<Parceiro> criarParceiros() {
		ArrayList<Avaliacao> avaliacoesDoZe = new ArrayList<Avaliacao>();
		ArrayList<Parceiro> parceiros = new ArrayList<Parceiro>();
		
		avaliacoesDoZe.add(new Avaliacao(
				new Usuario("Maria", "maria@maria.com.br", "12345"),
				"Ambiente Familiar",
				4
				));
		
		avaliacoesDoZe.add(new Avaliacao(
				new Usuario("Luiz", "luiz@luiz.com.br", "12345"),
				"Ambiente super agradavel",
				5
				));
		
		
		Parceiro bardoze = new Parceiro("Bar do Ze", "Esta e a descricao do bar do ze", "./assets/bar-do-ze.jpg", avaliacoesDoZe );
		
		parceiros.add(bardoze);
		
		Parceiro bardamaria = new Parceiro("Bar da maria", "Esta e a descricao do bar da maria", "./assets/bar-do-ze.jpg", avaliacoesDoZe );
		
		parceiros.add(bardamaria);
		
		return parceiros;
	}
}
