package clinicaPet.control;


import java.util.Set;

import clinicaPet.dao.FuncionarioDAO;
import clinicaPet.entidades.Funcionario;
import javafx.collections.FXCollections;

public class FuncionarioControl {
	private Set<Funcionario> setFuncionario = FXCollections.observableSet();
	private FuncionarioDAO cDAO = new FuncionarioDAO();
	
	public void manterFuncioario(Funcionario fun) {
		cDAO.incluir(fun);
		setFuncionario.add(fun);
	}

	
}