package br.com.comex.main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.comex.conexao.ConnectionFactory;

public class MainConsultaCliente {
	public static void main(String[] args) throws SQLException {
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = ConnectionFactory.recuperarConexao();
		
		Statement stm = connection.createStatement();
		stm.execute("SELECT * FROM COMEX.CLIENTE");
		ResultSet rst = stm.getResultSet();
		while(rst.next()) {
			Long ID = rst.getLong("ID");
			String nome = rst.getString("NOME");
			String CPF = rst.getString("CPF");
			System.out.println(ID + ", " + nome + ", portador do CPF" + CPF);
			
		}
		stm.close();
		connection.close();
	}
}
