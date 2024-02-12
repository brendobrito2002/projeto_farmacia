package br.com.farmaciabd.cadastro;

import java.util.List;

import br.com.farmaciabd.basica.Cliente;

public interface InterfaceCadastroCliente {
	Cliente procurarClienteId(long id);
	Cliente procurarClienteCpf(String cpf);
	Cliente procurarClienteNome(String nome);
	Cliente procurarClienteTelefone(String telefone);
	Cliente salvarCliente(Cliente Entity);
	List<Cliente> listarCliente();
}
