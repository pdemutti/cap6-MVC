package model;

public class Avaliacao {

	private Usuario usuario;
	private String message;
	private Integer rate;
	

	public Avaliacao(Usuario usuario, String mensagem, Integer rate) {
		super();
		this.usuario = usuario;
		this.message = mensagem;
		this.rate = rate;
	}


}
