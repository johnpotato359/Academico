package clinicaPet.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import clinicaPet.entidades.Cliente;
import clinicaPet.interfaces.InterCliente;



public class ClienteDAO implements InterCliente {
	private static final String URL = "jdbc:sqlserver://localhost:1433;"+"databaseName=Clinica;";
	private static final String USER = "sa";
	private static final String PASS = "1";
	Connection con;
	@Override
	public void incluir(Cliente cliente) {
	try{
		Class.forName ("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
		 con = DriverManager.getConnection (URL, USER, PASS);
		            
		         Statement st = con.createStatement();
		            
		           st.executeUpdate("INSERT INTO Cliente (nome,cpf,sexo,telefone,endereco) VALUES ('"+cliente.getNome()+"','"+cliente.getCPF()+"','"+cliente.getSexo()+"','"+cliente.getTelefone()+"','"+cliente.getEndereco()+"')");
		            
		            
		           
		            
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
	public List<Cliente> buscarCliente(String codigo) {
		
		return null;
	}
	@Override
	public void apagar(String codigo) {
		
		
	}
	@Override
	public void atualizar(Cliente cliente, String codigo) {
		try{
			Class.forName ("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
			 con = DriverManager.getConnection (URL, USER, PASS);
			            
			         Statement st = con.createStatement();
			            
			           st.executeUpdate("UPDATE Cliente Set nome = '"+cliente.getNome()+"',sexo='"+cliente.getSexo()+"',telefone='"+cliente.getTelefone()+"',endereco= '"+cliente.getEndereco()+"' where cpf='"+cliente.getCPF()+"'");
			            
			            
			           
			            
			           JOptionPane.showMessageDialog(null,"Registro Inserido Com Sucesso","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
			           
			           st.close();
			         con.close();
			       }
			     catch(Exception event)  { 
			    	 System.out.println(event.getMessage());
			         JOptionPane.showMessageDialog(null,"Conexão não estabelecida","Mensagem do Progama",JOptionPane.ERROR_MESSAGE);
			     }
			       
		
	}
	
	
}
