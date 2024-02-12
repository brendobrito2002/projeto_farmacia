package br.com.farmaciabd.colecaodedados;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.farmaciabd.basica.Cliente;
import br.com.farmaciabd.basica.Medicamento;
import br.com.farmaciabd.basica.Venda;
import br.com.farmaciabd.basica.Vendedor;

@Repository
public interface ColecaoVenda extends JpaRepository<Venda, Long> {

	void findByMedicamento(Medicamento medicamento);

	void findByVendedor(Vendedor vendedor);

	void findByCliente(Cliente cliente);

}
