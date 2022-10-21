package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import br.com.comex.conexao.ConnectionFactory;
import br.com.comex.modelo.Categoria;
import dao.CategoriaDAO;

public class MainListagemCategoria {
	public static void main(String[] args) throws SQLException {

		Connection conexao = new ConnectionFactory().recuperarConexao();
		CategoriaDAO categoriaDao = new CategoriaDAO(conexao);
		List<Categoria> listaCategoria = categoriaDao.listar();
		System.out.println("Lista de Categorias: ");
		for (Categoria categoria : listaCategoria) {
			System.out.println(" ");
			System.out.println(categoria);
		}
		conexao.close();
	}
}