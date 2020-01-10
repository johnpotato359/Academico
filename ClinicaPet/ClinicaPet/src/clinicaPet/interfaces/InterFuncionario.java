package clinicaPet.interfaces;

import java.util.List;

import clinicaPet.entidades.Funcionario;

public interface InterFuncionario {
	void incluir(Funcionario funcionario);
	List<Funcionario> buscarFuncionario(String codigo);
	void apagar(String codigo);
	void atualizar(Funcionario Funcionario, String codigo);
}
