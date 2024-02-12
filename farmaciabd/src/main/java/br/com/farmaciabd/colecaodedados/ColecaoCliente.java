package br.com.farmaciabd.colecaodedados;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.farmaciabd.basica.Cliente;

@Repository
public interface ColecaoCliente extends JpaRepository<Cliente, Long> {

	void findByCpf(String cpf);

	void findByNome(String nome);

	void findByTelefone(String telefone);
	
}
