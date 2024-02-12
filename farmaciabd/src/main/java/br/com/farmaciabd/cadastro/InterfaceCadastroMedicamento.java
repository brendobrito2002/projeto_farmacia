package br.com.farmaciabd.cadastro;

import java.util.List;

import br.com.farmaciabd.basica.Medicamento;

public interface InterfaceCadastroMedicamento {
	Medicamento procurarMedicamentoId(long id);
	Medicamento procurarMedicamentoNome(String nome);
	Medicamento procurarMedicamentoDosagem(String dosagem);
	Medicamento procurarMedicamentoPreco(double preco);
	Medicamento salvarMedicamento(Medicamento Entity);
	List<Medicamento> listarMedicamento();
}
