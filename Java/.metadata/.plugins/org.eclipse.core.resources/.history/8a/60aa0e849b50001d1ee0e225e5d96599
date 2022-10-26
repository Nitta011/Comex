package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.comex.conexao.ConnectionFactory;

public class MainAtualizaCliente {
	public static void main(String[] args) throws SQLException {
		ConnectionFactory conexao = new ConnectionFactory();
		Connection connection = ConnectionFactory.recuperarConexao();

		Statement stm = connection.createStatement();
		stm.execute("UPDATE COMEX.CLIENTE SET NOME = 'ANA LUIZA' WHERE NOME = 'ANA SOUZA'");

		stm.close();
		connection.close();
	}
}
