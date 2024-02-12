package br.com.farmaciabd.colecaodedados;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.farmaciabd.basica.Vendedor;

@Repository
public interface ColecaoVendedor extends JpaRepository<Vendedor, Long> {

	void findByCpf(String cpf);

	void findByNome(String nome);

	void findByTelefone(String telefone);

}
