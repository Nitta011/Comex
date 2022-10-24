package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.comex.conexao.ConnectionFactory;
import br.com.comex.enums.estados;
import br.com.comex.modelo.Cliente;

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

		
		ConnectionFactory conexao = new ConnectionFactory();
		Connection connection = ConnectionFactory.recuperarConexao();
		Cliente cliente = new Cliente();
		PreparedStatement stm = connection.prepareStatement(
				"INSERT INTO COMEX.CLIENTE (NOME,CPF,TELEFONE,RUA,NUMERO,COMPLEMENTO,BAIRRO,CIDADE,ESTADO) VALUES (?,?,?,?,?,?,?,?,?)");

		stm.setString(1,cliente.getNome());
		stm.setString(2, cliente.getCPF());
		stm.setString(3, cliente.getTelefone());
		stm.setString(4,cliente.getRua());
		stm.setString(5, cliente.getNumero());
		stm.setString(6, cliente.getComplemento());
		stm.setString(7, cliente.getBairro());
		stm.setString(8, cliente.getCidade());
		stm.setString(9, cliente.getEstado().name());
		
		stm.execute();
		connection.close();
	}
}
