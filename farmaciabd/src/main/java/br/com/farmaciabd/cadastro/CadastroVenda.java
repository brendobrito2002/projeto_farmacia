package br.com.farmaciabd.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.farmaciabd.basica.Cliente;
import br.com.farmaciabd.basica.Medicamento;
import br.com.farmaciabd.basica.Venda;
import br.com.farmaciabd.basica.Vendedor;
import br.com.farmaciabd.colecaodedados.ColecaoVenda;

public class CadastroVenda implements InterfaceCadastroVenda{

	@Autowired
	ColecaoVenda colecaoVenda;
	@Override
	public Venda procurarVendaId(long id) {
		colecaoVenda.findById(id);
		return null;
	}

	@Override
	public Venda procurarVendaMedicamento(Medicamento medicamento) {
		colecaoVenda.findByMedicamento(medicamento);
		return null;
	}

	@Override
	public Venda procurarVendaVendedor(Vendedor vendedor) {
		colecaoVenda.findByVendedor(vendedor);
		return null;
	}

	@Override
	public Venda procurarVendaCliente(Cliente cliente) {
		colecaoVenda.findByCliente(cliente);
		return null;
	}

	@Override
	public Venda salvarVenda(Venda Entity) {
		return colecaoVenda.save(Entity);
	}

	@Override
	public List<Venda> listarVenda() {
		return colecaoVenda.findAll();
	}

}
