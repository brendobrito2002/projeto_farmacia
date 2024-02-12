package br.com.farmaciabd.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.farmaciabd.basica.Vendedor;
import br.com.farmaciabd.colecaodedados.ColecaoVendedor;

public class CadastroVendedor implements InterfaceCadastroVendedor{

	@Autowired
	ColecaoVendedor colecaoVendedor;
	
	@Override
	public Vendedor procurarVendedorId(long id) {
		colecaoVendedor.findById(id);
		return null;
	}

	@Override
	public Vendedor procurarVendedorCpf(String cpf) {
		colecaoVendedor.findByCpf(cpf);
		return null;
	}

	@Override
	public Vendedor procurarVendedorNome(String nome) {
		colecaoVendedor.findByNome(nome);
		return null;
	}

	@Override
	public Vendedor procurarVendedorTelefone(String telefone) {
		colecaoVendedor.findByTelefone(telefone);
		return null;
	}

	@Override
	public Vendedor salvarVendedor(Vendedor Entity) {
		return colecaoVendedor.save(Entity);
	}

	@Override
	public List<Vendedor> listarVendedor() {
		return colecaoVendedor.findAll();
	}

}
