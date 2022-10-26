package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Produto;

public class ProdutoDAO {

	private static Connection connection;

	public ProdutoDAO(Connection connection) {
		this.connection = connection;
	}

	public static void inserir(Produto produto) throws SQLException {
		String sql = "INSERT INTO COMEX.PRODUTO (NOME,DESCRICAO,PRECO_UNITARIO,QUANTIDADE_ESTOQUE,CATEGORIA_ID) VALUES (?,?,?,?,?)";

		String[] colunaParaRetornar = { "id" };
		
		PreparedStatement pstm = connection.prepareStatement(sql, colunaParaRetornar);
			pstm.setString(1, produto.getNome());
			pstm.setString(2, produto.getDescricao());
			pstm.setDouble(3, produto.getPrecoUnitario());
			pstm.setInt(4, produto.getQuantidadeEstoque());
			pstm.setLong(5,produto.getCategoria());
			pstm.execute();
			
			ResultSet rst = pstm.getGeneratedKeys();
			rst.next();
			
			produto.setID(rst.getLong(1));
			
			pstm.close();
		}
	

	public void excluir(Long ID) throws SQLException {
		String sql = "DELETE FROM COMEX.PRODUTO WHERE ID = ?";
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setLong(1, ID);
		ps.execute();
		ps.close();
	}

	public void alterar(Produto produto) throws SQLException {
		String sql = "UPDATE COMEX.PRODUTO" + "SET ID=?," +  " NOME = ?," + "DESCRICAO = ?," + "PRECOUNITARIO = ?,"
				+ "QUANTIDADE_ESTOQUE = ?," + "CATEGORIA_ID = ?," + "WHERE ID = ?";
		
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1, produto.getNome());
		ps.setString(2, produto.getDescricao());
		ps.setDouble(3, produto.getPrecoUnitario());
		ps.setInt(4, produto.getQuantidadeEstoque());
		ps.setLong(5, produto.getCategoria());
		ps.execute();
		ps.close();
	}

	
	public List<Produto> listaTodas() throws SQLException {
		PreparedStatement stm = connection.prepareStatement("SELECT * FROM COMEX.PRODUTO");
		
		List<Produto> produtos = new ArrayList<>();
		ResultSet rst = stm.executeQuery();
		
		while(rst.next()) {
			produtos.add(this.populaProduto(rst));
		}
		stm.close();
		rst.close();
		return produtos;
		}
	
	public Produto buscaPorId(long id) throws SQLException {
		String sql = "select * from comex.produto where id = ?";
		
		try (PreparedStatement ps = this.connection.prepareStatement(sql)) {
			ps.setLong(1, id);
			
			try (ResultSet registro = ps.executeQuery()) {
				Produto produto = null;
				if (registro.next()) {
					produto = this.populaProduto(registro);
				}
					
				return produto;
			}
		}
	}
	
	private Produto populaProduto(ResultSet rst) throws SQLException{
		Produto produto = new Produto(
				rst.getLong("id"),
				rst.getString("nome"),
				rst.getString("descricao"),
				rst.getDouble("preco_unitario"),
				rst.getInt("quantidade_estoque"),
				new Categoria(rst.getLong("categoria_id")));
		produto.setID(rst.getLong("id"));
		return produto;
	}
}