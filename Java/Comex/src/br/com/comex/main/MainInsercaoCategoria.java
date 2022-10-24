package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.comex.conexao.ConnectionFactory;
import br.com.comex.modelo.Categoria;

public class MainInsercaoCategoria {
	public static void main(String[] args)throws SQLException {
		String nome = " ";
		String statusCategoria = " ";
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = ConnectionFactory.recuperarConexao();
		Categoria categoria = new Categoria();
		PreparedStatement stm = connection.prepareStatement("INSERT INTO COMEX.CATEGORIA (NOME,STATUS) VALUES (?,?)");
	
		stm.setString(1, categoria.getNome());
		stm.setString(2, categoria.getStatus().name());
		stm.execute();
		
		stm.close();
		connection.close();
	}
}
