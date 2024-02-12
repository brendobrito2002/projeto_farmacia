package br.com.farmaciabd.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.farmaciabd.basica.Medicamento;
import br.com.farmaciabd.basica.Promocao;
import br.com.farmaciabd.colecaodedados.ColecaoPromocao;

public class CadastroPromocao implements InterfaceCadastroPromocao{

	@Autowired
	ColecaoPromocao colecaoPromocao;
	@Override
	public Promocao procurarPromocaoId(long id) {
		colecaoPromocao.findById(id);
		return null;
	}

	@Override
	public Promocao procurarPromocaoMedicamento(Medicamento medicamento) {
		colecaoPromocao.findByMedicamento(medicamento);
		return null;
	}

	@Override
	public Promocao procurarPromocaoDesconto(double desconto) {
		colecaoPromocao.findByDesconto(desconto);
		return null;
	}

	@Override
	public Promocao procurarPromocaoDataInicio(String dataInicio) {
		colecaoPromocao.findByDataInicio(dataInicio);
		return null;
	}

	@Override
	public Promocao procurarPromocaoDataFim(String dataFim) {
		colecaoPromocao.findByDataFim(dataFim);
		return null;
	}

	@Override
	public Promocao salvarPromocao(Promocao Entity) {
		return colecaoPromocao.save(Entity);
	}

	@Override
	public List<Promocao> listarPromocao() {
		return colecaoPromocao.findAll();
	}

}
