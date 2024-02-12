package br.com.farmaciabd.cadastro;

import java.util.List;

import br.com.farmaciabd.basica.Medicamento;
import br.com.farmaciabd.basica.Promocao;

public interface InterfaceCadastroPromocao {
	Promocao procurarPromocaoId(long id);
	Promocao procurarPromocaoMedicamento(Medicamento medicamento);
	Promocao procurarPromocaoDesconto(double desconto);
	Promocao procurarPromocaoDataInicio(String dataInicio);
	Promocao procurarPromocaoDataFim(String dataFim);
	Promocao salvarPromocao(Promocao Entity);
	List<Promocao> listarPromocao();
}
