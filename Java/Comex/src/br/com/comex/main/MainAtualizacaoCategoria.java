package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.comex.conexao.ConnectionFactory;

public class MainAtualizacaoCategoria {
	public static void main(String[] args) throws SQLException {
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = ConnectionFactory.recuperarConexao();
		
		Statement stm = connection.createStatement();
		stm.execute("UPDATE COMEX.CATEGORIA SET NOME = 'LIVROS TÉCNICOS' WHERE NOME = 'LIVROS'");
	
		stm.close();
		connection.close();
	}
}