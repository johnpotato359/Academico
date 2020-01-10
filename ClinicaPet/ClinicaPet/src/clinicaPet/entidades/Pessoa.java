package clinicaPet.entidades;

public abstract class Pessoa {
	
	protected String nome;
	protected String telefone;
	protected String endereco;
	protected String CPF;
	protected String sexo;
	
	protected String getNome() {
		return nome;
	}
	protected void setNome(String nome) {
		this.nome = nome;
	}
	protected String getTelefone() {
		return telefone;
	}
	protected void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	protected String getEndereco() {
		return endereco;
	}
	protected void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	protected String getCPF() {
		return CPF;
	}
	protected void setCPF(String cPF) {
		CPF = cPF;
	}
	protected String getSexo() {
		return sexo;
	}
	protected void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
}
