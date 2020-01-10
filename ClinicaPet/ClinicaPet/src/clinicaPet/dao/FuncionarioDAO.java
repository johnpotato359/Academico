package clinicaPet.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.List;

import javax.swing.JOptionPane;

import clinicaPet.entidades.Funcionario;
import clinicaPet.interfaces.InterFuncionario;

public class FuncionarioDAO implements InterFuncionario{
	private static final String URL = "jdbc:sqlserver://localhost:1433;"+"databaseName=Clinica;";
	private static final String USER = "sa";
	private static final String PASS = "1";
	Connection con;
	@Override
	public void incluir(Funcionario funcionario) {
	try{
		Class.forName ("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
		 con = DriverManager.getConnection (URL, USER, PASS);
		            
		         Statement st = con.createStatement();
		            
		           st.executeUpdate("INSERT INTO Funcionario (nome,cpf,sexo,telefone,endereco,dataadmin) VALUES ('"+funcionario.getNome()+"','"+funcionario.getCPF()+"','"+funcionario.getSexo()+"','"+funcionario.getTelefone()+"','"+funcionario.getEndereco()+"','"+funcionario.getData()+"')");
		            
		            
		           
		            
		           JOptionPane.showMessageDialog(null,"Registro Inserido Com Sucesso","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
		           
		           st.close();
		         con.close();
		       }
		     catch(Exception event)  { 
		    	 System.out.println(event.getMessage());
		         JOptionPane.showMessageDialog(null,"Conexão não estabelecida","Mensagem do Progama",JOptionPane.ERROR_MESSAGE);
		     }
		       
		
	}
	@Override
	public List<Funcionario> buscarFuncionario(String codigo) {
		
		return null;
	}
	@Override
	public void apagar(String codigo) {
		
		
	}
	@Override
	public void atualizar(Funcionario funcionario, String codigo) {
		
		
	}
}
