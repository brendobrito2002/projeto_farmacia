package br.com.farmaciabd.cadastro;

import java.util.List;

import br.com.farmaciabd.basica.Vendedor;

public interface InterfaceCadastroVendedor {
	Vendedor procurarVendedorId(long id);
	Vendedor procurarVendedorCpf(String cpf);
	Vendedor procurarVendedorNome(String nome);
	Vendedor procurarVendedorTelefone(String telefone);
	Vendedor salvarVendedor(Vendedor Entity);
	List<Vendedor> listarVendedor();
}
