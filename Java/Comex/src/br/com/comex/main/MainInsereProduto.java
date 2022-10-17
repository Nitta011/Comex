package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.conexao.ConnectionFactory;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Produto;
import dao.ProdutoDAO;

public class MainInsereProduto {
	public static void main(String[] args) throws SQLException {
		Produto novoProduto = new Produto("Monitor LG", "Monitor 24 polegadas", 762.99, 2, new Categoria(10L));
		
		new ConnectionFactory();
		Connection conexao = ConnectionFactory.recuperarConexao();
		
		ProdutoDAO produtoDAO = new ProdutoDAO(conexao);
		ProdutoDAO.inserir(novoProduto);
		
		conexao.close();
	}
}
