package br.com.farmaciabd.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.farmaciabd.basica.Cliente;
import br.com.farmaciabd.colecaodedados.ColecaoCliente;

public class CadastroCliente implements InterfaceCadastroCliente{

	@Autowired
	ColecaoCliente colecaoCliente;
	
	@Override
	public Cliente procurarClienteId(long id) {
		colecaoCliente.findById(id);
		return null;
	}

	@Override
	public Cliente procurarClienteCpf(String cpf) {
		colecaoCliente.findByCpf(cpf);
		return null;
	}

	@Override
	public Cliente procurarClienteNome(String nome) {
		colecaoCliente.findByNome(nome);
		return null;
	}

	@Override
	public Cliente procurarClienteTelefone(String telefone) {
		colecaoCliente.findByTelefone(telefone);
		return null;
	}

	@Override
	public Cliente salvarCliente(Cliente Entity) {
		return colecaoCliente.save(Entity);
	}

	@Override
	public List<Cliente> listarCliente() {
		return colecaoCliente.findAll();
	}


}
