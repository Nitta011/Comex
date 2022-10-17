package br.com.comex.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.comex.conexao.ConnectionFactory;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Produto;
import dao.ProdutoDAO;

public class MainAtualizaProduto {
	public static void main(String[] args) throws SQLException {
		Connection connection = ConnectionFactory.recuperarConexao();
		ProdutoDAO produtoDao = new ProdutoDAO(connection);
		Produto produto = produtoDao.buscaPorId(11L);
		produto.setNome("Monitor LG");
		produto.setDescricao("24 polegadas");
		produto.setCategoria(new Categoria(10L));
		
		
		produtoDao.alterar(produto);
		
		connection.close();
		
		System.out.println("Produto alterado!");
	}
}
