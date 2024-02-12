package br.com.farmaciabd.cadastro;

import java.util.List;

import br.com.farmaciabd.basica.Cliente;
import br.com.farmaciabd.basica.Medicamento;
import br.com.farmaciabd.basica.Venda;
import br.com.farmaciabd.basica.Vendedor;

public interface InterfaceCadastroVenda {
	Venda procurarVendaId(long id);
	Venda procurarVendaMedicamento(Medicamento medicamento);
	Venda procurarVendaVendedor(Vendedor vendedor);
	Venda procurarVendaCliente(Cliente cliente);
	Venda salvarVenda(Venda Entity);
	List<Venda> listarVenda();
}
