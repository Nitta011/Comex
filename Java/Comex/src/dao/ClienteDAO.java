package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.enums.StatusCategoria;
import br.com.comex.enums.estados;
import br.com.comex.modelo.Categoria;
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
		pstm.setString(5, cliente.getNumero());
		pstm.setString(6, cliente.getComplemento());
		pstm.setString(7, cliente.getBairro());
		pstm.setString(8, cliente.getCidade());
		pstm.setString(9, cliente.getEstado().name());

		pstm.execute();

		ResultSet rst = pstm.getGeneratedKeys();
		rst.next();

		pstm.close();
	}

	public List<Cliente> listar() throws SQLException {
		PreparedStatement stm = connection.prepareStatement("SELECT * FROM COMEX.CLIENTE");

		List<Cliente> clientes = new ArrayList<>();
		ResultSet rst = stm.executeQuery();

		while (rst.next()) {
			Cliente cliente = this.populaCliente(rst);
			clientes.add(cliente);
		}
		System.out.println(clientes);
		rst.close();
		stm.close();
		return clientes;
	}
//	public List<Cliente> listar() throws SQLException {
//		String sql = "SELECT * FROM comex.cliente";
//		PreparedStatement cp = connection.prepareStatement(sql);
//		List<Cliente> clientes = new ArrayList<>();
//		ResultSet reg = cp.executeQuery();
//		while (reg.next()) {
//			Cliente cli = this.populaCliente(reg);
//			clientes.add(cli);
//			System.out.println(clientes);
//		}
//		return clientes;
//	}
	private Cliente populaCliente(ResultSet registros) throws SQLException {
		Cliente cliente = new Cliente(registros.getString("nome"), registros.getString("CPF"),
				registros.getString("telefone"), registros.getString("rua"), registros.getString("numero"),
				registros.getString("complemento"), registros.getString("Bairro"), registros.getString("cidade"),
				estados.valueOf(registros.getString("uf")));
		cliente.setID(registros.getInt("id"));
		return cliente;
	}
	
	
//	private Cliente populaCliente (final ResultSet res) throws SQLException {
//        Cliente clie = new Cliente(res.getString("nome"),
//                                      res.getString("cpf"),
//                                      res.getString("telefone"),
//                                      res.getString("rua"),
//                                      res.getString("numero"),
//                                      res.getString("complemento"),
//                                      res.getString("bairro"),
//                                      res.getString("cidade"),
//                                      estados.valueOf(res.getString("uf")));
//        clie.setID(res.getLong("id"));
//        return clie;
//    }
}
