package br.com.farmaciabd.basica;

public class Vendedor {
	
	private String cpf;
	private String nome;
	private String telefone;
	private double salario;
	private double percentualComicao;
	
	public Vendedor(String cpf, String nome, String telefone, double salario, double percentualComicao) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
		this.salario = salario;
		this.percentualComicao = percentualComicao;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getPercentualComicao() {
		return percentualComicao;
	}
	public void setPercentualComicao(double percentualComicao) {
		this.percentualComicao = percentualComicao;
	}
	
}
