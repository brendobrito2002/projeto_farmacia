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
	private String dataIncio;
	private String dataFim;
	
	public Promocao(long id, Medicamento medicamento, double desconto, String dataIncio, String dataFim) {
		super();
		this.id = id;
		this.medicamento = medicamento;
		this.desconto = desconto;
		this.dataIncio = dataIncio;
		this.dataFim = dataFim;
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
	public String getDataIncio() {
		return dataIncio;
	}
	public void setDataIncio(String dataIncio) {
		this.dataIncio = dataIncio;
	}
	public String getDataFim() {
		return dataFim;
	}
	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}
	
}
