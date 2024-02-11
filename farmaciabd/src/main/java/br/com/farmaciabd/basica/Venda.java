package br.com.farmaciabd.basica;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Venda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@OneToOne(cascade = CascadeType.ALL)
	private Medicamento medicamento;
	@OneToOne(cascade = CascadeType.ALL)
	private Vendedor vendedor;
	@OneToOne(cascade = CascadeType.ALL)
	private Cliente cliente;
	private double precoFinal;
	
	public Venda(long id, Medicamento medicamento, Vendedor vendedor, Cliente cliente, double precoFinal) {
		super();
		this.id = id;
		this.medicamento = medicamento;
		this.vendedor = vendedor;
		this.cliente = cliente;
		this.precoFinal = precoFinal;
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
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public double getPrecoFinal() {
		return precoFinal;
	}
	public void setPrecoFinal(double precoFinal) {
		this.precoFinal = precoFinal;
	}
	
	
}
