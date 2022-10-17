package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.comex.conexao.ConnectionFactory;

public class MainExcluiCliente {
	public static void main(String[] args) throws SQLException{
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = ConnectionFactory.recuperarConexao();
		
		Statement stm = connection.createStatement();
		stm.execute("DELETE FROM COMEX.CLIENTE WHERE ID = ?");
		
		Integer linhasModificadas = stm.getUpdateCount();
		System.out.println("Quantidade de linhas modificadas: " + linhasModificadas);
		
		stm.close();
		connection.close();
	}
}
