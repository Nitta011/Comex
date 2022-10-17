package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.comex.conexao.ConnectionFactory;
import br.com.comex.enums.estados;

public class MainInsereCliente {
	public static void main(String[] args) throws SQLException {
		String nome = " ";
		String CPF = " ";
		String Telefone = " ";
		String Rua = " ";
		String Numero = " ";
		String Complemento = " ";
		String Bairro = " ";
		String Cidade = " ";
		// estados Estado = ?;

		ConnectionFactory conexao = new ConnectionFactory();
		Connection connection = ConnectionFactory.recuperarConexao();
		PreparedStatement stm = connection.prepareStatement(
				"INSERT INTO COMEX.CLIENTE (NOME,CPF,TELEFONE,RUA,NUMERO,COMPLEMENTO,BAIRRO,CIDADE) VALUES (?,?,?,?,?,?,?,?)");

		stm.setString(1,nome);
		stm.setString(2, CPF);
		stm.setString(3, Telefone);
		stm.setString(4, Rua);
		stm.setString(5, Numero);
		stm.setString(6, Complemento);
		stm.setString(7, Bairro);
		stm.setString(8, Cidade);
		
		stm.execute();
		connection.close();
	}
}
