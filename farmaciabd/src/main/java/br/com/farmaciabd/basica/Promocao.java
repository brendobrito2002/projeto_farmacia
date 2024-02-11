package br.com.farmaciabd.basica;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Promocao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@OneToOne(cascade = CascadeType.ALL)
	private Medicamento medicamento;
	private double desconto;
	private String data_incio;
	private String data_fim;
	
	public Promocao(long id, Medicamento medicamento, double desconto, String data_incio, String data_fim) {
		super();
		this.id = id;
		this.medicamento = medicamento;
		this.desconto = desconto;
		this.data_incio = data_incio;
		this.data_fim = data_fim;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Medicamento getMedicamento() {
		return medicamento;
	}
	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	public String getData_incio() {
		return data_incio;
	}
	public void setData_incio(String data_incio) {
		this.data_incio = data_incio;
	}
	public String getData_fim() {
		return data_fim;
	}
	public void setData_fim(String data_fim) {
		this.data_fim = data_fim;
	}
	
}
