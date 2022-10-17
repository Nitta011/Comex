package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.comex.conexao.ConnectionFactory;
import br.com.comex.modelo.Produto;
import dao.ProdutoDAO;

public class MainConsultaProduto {
	public static void main(String[] args) throws SQLException {
		Connection conexao = new ConnectionFactory().recuperarConexao();
		
		ProdutoDAO produtoDao = new ProdutoDAO(conexao);
		List<Produto> listaProdutos = produtoDao.listaTodas();
		
		for (Produto produto : listaProdutos) {
			System.out.println("Lista de produtos: ");
			System.out.println("");
			System.out.println(produto);
		}
		conexao.close();
	}
}
