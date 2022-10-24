package br.com.comex.ws;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.com.comex.conexao.ConnectionFactory;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.Produto;
import dao.CategoriaDAO;
import dao.ClienteDAO;
import dao.ProdutoDAO;

@WebService(name = "ListaCategoria")
public class ComexWS {
	@WebMethod(operationName = "ListarCategorias")
	@WebResult(name = "Categorias")
	public List<Categoria> getCategorias() throws SQLException{
		Connection conexao = new ConnectionFactory().recuperarConexao();
		CategoriaDAO dao = new CategoriaDAO(conexao);
		List<Categoria> categorias = dao.listar();
		return categorias;
	}
	
	@WebMethod (operationName = "InserindoCategoria")
	@WebResult (name = "Categoria")
	public void inserirCategoria(Categoria categoria) throws SQLException{
		Connection conexao = new ConnectionFactory().recuperarConexao();
		CategoriaDAO dao = new CategoriaDAO(conexao);
		dao.inserir(categoria);
		System.out.println(categoria);
		conexao.close(); 
		//Não salva
	}
	
	@WebMethod(operationName = "ListarClientes")
	@WebResult(name= "Clientes")
	public List<Cliente> getclientes() throws SQLException{
		Connection conexao = new ConnectionFactory().recuperarConexao();
		ClienteDAO dao = new ClienteDAO(conexao);
		List<Cliente> clientes = dao.listar();
		System.out.println(clientes);
		return clientes;
	}
	
	@WebMethod(operationName = "InserindoCliente")
	public void inserir(Cliente cliente) throws SQLException{
		Connection conexao = new ConnectionFactory().recuperarConexao();
		ClienteDAO dao = new ClienteDAO(conexao);
		PreparedStatement stm = conexao.prepareStatement("INSERT INTO COMEX.CLIENTE (NOME,DESCRICAO,PRECO_UNITARIO,QUANTIDADE_ESTOQUE,CATEGORIA_ID) VALUES (?,?,?,?,?)");
		dao.inserir(cliente);
		stm.close();
		conexao.close();
		//Erro no ESTADO
	}
	
	public List<Produto> getProdutos() throws SQLException{
		Connection conexao = new ConnectionFactory().recuperarConexao();
		ProdutoDAO dao = new ProdutoDAO(conexao);
		PreparedStatement stm = conexao.prepareStatement("SELECT * FROM COMEX.PRODUTO");
		List<Produto> produtos = dao.listar();
		System.out.println(produtos);
		return produtos;
		
	}
	
}