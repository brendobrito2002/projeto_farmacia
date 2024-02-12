package br.com.farmaciabd.colecaodedados;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.farmaciabd.basica.Medicamento;
import br.com.farmaciabd.basica.Promocao;

@Repository
public interface ColecaoPromocao extends JpaRepository<Promocao, Long> {

	void findByMedicamento(Medicamento medicamento);

	void findByDesconto(double desconto);

	void findByDataInicio(String dataInicio);

	void findByDataFim(String dataFim);

}
