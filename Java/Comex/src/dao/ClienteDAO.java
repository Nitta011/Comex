package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.comex.enums.estados;
import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.Produto;

public class ClienteDAO {
	private static Connection connection;
	
	public ClienteDAO(Connection connection) {
		this.connection = connection;
	}
	
	public static void inserir(Cliente cliente) throws SQLException {
		String sql = "INSERT INTO COMEX.CLIENTE (NOME,CPF,TELEFONE,RUA,NUMERO,COMPLEMENTO,BAIRRO,CIDADE,ESTADO) VALUES (?,?,?,?,?,?,?,?,?)";

		String[] colunaParaRetornar = { "id" };
		
		PreparedStatement pstm = connection.prepareStatement(sql, colunaParaRetornar);
			pstm.setString(1, cliente.getNome());
			pstm.setString(2, cliente.getCPF());
			pstm.setString(3, cliente.getTelefone());
			pstm.setString(4, cliente.getRua());
			pstm.setString(5,cliente.getNumero());
			pstm.setString(6, cliente.getComplemento());
			pstm.setString(7, cliente.getBairro());
			pstm.setString(8, cliente.getCidade());
			estados.valueOf((cliente.getEstado("asa")));
			
			pstm.execute();
			
			ResultSet rst = pstm.getGeneratedKeys();
			rst.next();
			
			
			pstm.close();
		}
	
}
