package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.conexao.ConnectionFactory;
import dao.ProdutoDAO;

public class MainExcluiProduto {
	public static void main(String[] args) throws SQLException{
		Connection conexao = new ConnectionFactory().recuperarConexao();
		
		ProdutoDAO produtoDao = new ProdutoDAO(conexao);
		produtoDao.excluir(12L);
		
		conexao.close();
	}
}
