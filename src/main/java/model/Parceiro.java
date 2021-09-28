package model;

import java.util.ArrayList;

public class Parceiro {
	
	private String nome;
	private String descricao;
	private String caminhoImagem;
	private ArrayList<Avaliacao> listaDeAvaliacoes;
	
	public Parceiro(String nome, String descricao, String caminhoImagem, ArrayList<Avaliacao> listaDeAvaliacoes) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.caminhoImagem = caminhoImagem;
		this.listaDeAvaliacoes = listaDeAvaliacoes;
	}
	
	

	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public String getCaminhoImagem() {
		return caminhoImagem;
	}



	public void setCaminhoImagem(String caminhoImagem) {
		this.caminhoImagem = caminhoImagem;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	

}	