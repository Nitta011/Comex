package br.com.comex.main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import br.com.comex.conexao.ConnectionFactory;
import br.com.comex.enums.StatusCategoria;

public class MainListagemCategoria {
	public static void main(String[] args) throws SQLException {
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = ConnectionFactory.recuperarConexao();
		
		Statement stm = connection.createStatement();
		stm.execute("SELECT ID,NOME,STATUS FROM COMEX.CATEGORIA");
		ResultSet rst = stm.getResultSet();
		while(rst.next()) {
			Integer ID = rst.getInt("ID");
			String nome = rst.getString("NOME");
			String statusCategoria = rst.getString("STATUS");
			System.out.println(ID + ", " + nome + "," + statusCategoria);
		}
	}
}
