package br.com.farmaciabd.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.farmaciabd.basica.Medicamento;
import br.com.farmaciabd.colecaodedados.ColecaoMedicamento;

@Service
public class CadastroMedicamento implements InterfaceCadastroMedicamento {
	@Autowired
	private ColecaoMedicamento colecaoMedicamento;

	@Override
	public Medicamento procurarMedicamentoId(long id) {
		colecaoMedicamento.findById(id);
		return null;
	}

	@Override
	public Medicamento procurarMedicamentoNome(String nome) {
		colecaoMedicamento.findByNome(nome);
		return null;
	}

	@Override
	public Medicamento procurarMedicamentoDosagem(String dosagem) {
		colecaoMedicamento.findByDosagem(dosagem);
		return null;
	}

	@Override
	public Medicamento procurarMedicamentoPreco(double preco) {
		colecaoMedicamento.findByPreco(preco);
		return null;
	}

	@Override
	public Medicamento salvarMedicamento(Medicamento Entity) {
		return colecaoMedicamento.save(Entity);
	}

	@Override
	public List<Medicamento> listarMedicamento() {
		return colecaoMedicamento.findAll();
	}
	
}
