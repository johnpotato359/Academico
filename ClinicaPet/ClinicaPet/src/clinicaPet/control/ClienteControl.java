package clinicaPet.control;

import java.util.List;

import clinicaPet.dao.ClienteDAO;
import clinicaPet.entidades.Cliente;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ClienteControl {
	private ObservableList<Cliente> lista = FXCollections.observableArrayList();
	private ClienteDAO cDAO = new ClienteDAO();
	
	public void manterCliente(Cliente q) {
		cDAO.incluir(q);
		
	}

	public void buscarCliente(String CPF) {
		List<Cliente> resultado = cDAO.buscarCliente(CPF);
		lista.clear();
		lista.addAll(resultado);
	}

	public ObservableList<Cliente> getLista() {
		return lista;
	}

	public void alterarCliente(Cliente clienteselect, String cpf) {
		cDAO.atualizar(clienteselect,cpf);
	}

	public void apagar(String cpf) {
		cDAO.apagar(cpf);
	}


}