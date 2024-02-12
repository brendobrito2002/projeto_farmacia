package br.com.farmaciabd.colecaodedados;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.farmaciabd.basica.Medicamento;

@Repository
public interface ColecaoMedicamento extends JpaRepository<Medicamento, Long>{

	void findByNome(String nome);

	void findByDosagem(String dosagem);

	void findByPreco(double preco);

}
