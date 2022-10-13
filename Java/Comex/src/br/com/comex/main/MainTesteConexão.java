package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.conexao.ConnectionFactory;

public class MainTesteConexão {
	public static void main(String[] args) throws SQLException {
	ConnectionFactory connectionFactory = new ConnectionFactory();
	Connection connection = ConnectionFactory.recuperarConexao();
	System.out.println("Conexão efetuada com sucesso");
	connection.close();
}
}