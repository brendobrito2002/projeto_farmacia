package br.com.farmaciabd.basica;

public class Medicamento {
	
	private long id;
	private String nome;
	private String dosagem;
	private double preco;
	
	public Medicamento(long id, String nome, String dosagem, double preco) {
		super();
		this.id = id;
		this.nome = nome;
		this.dosagem = dosagem;
		this.preco = preco;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDosagem() {
		return dosagem;
	}
	public void setDosagem(String dosagem) {
		this.dosagem = dosagem;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
