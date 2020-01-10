package clinicaPet.interfaces;

import java.util.List;
import clinicaPet.entidades.Cliente;

public interface InterCliente {
	void incluir(Cliente cliente);
	List<Cliente> buscarCliente(String codigo);
	void apagar(String codigo);
	void atualizar(Cliente cliente, String codigo);
}
