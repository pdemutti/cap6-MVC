package model;

public class Atracao {
	private String nome;
	private String descricao;
	private Double valor;
	private String data;
	
	public Atracao(String nome, String descricao, Double valor, String data) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
		this.data = data;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
}
