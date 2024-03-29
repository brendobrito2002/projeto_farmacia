package br.com.farmaciabd.basica;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vendedor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String cpf;
	private String nome;
	private String telefone;
	private double salario;
	private double percentualComicao;
	
	public Vendedor(long id, String cpf, String nome, String telefone, double salario, double percentualComicao) {
		super();
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
		this.salario = salario;
		this.percentualComicao = percentualComicao;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		if(cpf.length() == 11) {
			this.cpf = cpf;
	}else {
		System.out.println("Cpf Inválido");
		}
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
		if(telefone.length() == 11) {
			this.telefone = telefone;
		} else{
			System.out.println("Número inválido");
		}
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = 1400.00;
	}
	public double getPercentualComicao() {
		return percentualComicao;
	}
	public void setPercentualComicao(double percentualComicao) {
		this.percentualComicao = 0.02;
	}

}
