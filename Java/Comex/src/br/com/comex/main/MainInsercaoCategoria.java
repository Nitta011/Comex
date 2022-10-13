package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.comex.conexao.ConnectionFactory;

public class MainInsercaoCategoria {
	public static void main(String[] args)throws SQLException {
		String nome = " ";
		String statusCategoria = " ";
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = ConnectionFactory.recuperarConexao();
		
		PreparedStatement stm = connection.prepareStatement("INSERT INTO COMEX.CATEGORIA (NOME,STATUS) VALUES (?,?)");
	
		stm.setString(1, nome);
		stm.setString(2, statusCategoria);
		stm.execute();
		

		stm.close();
		connection.close();
	}
}
