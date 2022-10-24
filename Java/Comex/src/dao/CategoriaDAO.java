package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import br.com.comex.enums.StatusCategoria;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Produto;
@XmlAccessorType(XmlAccessType.FIELD)
public class CategoriaDAO {
	private static Connection connection;

	public CategoriaDAO(Connection connection) {
		this.connection = connection;
	}

	public static void inserir(Categoria categoria) throws SQLException {
		String sql = "INSERT INTO COMEX.CATEGORIA (NOME, STATUS) VALUES (?,?)";

		PreparedStatement pstm = connection.prepareStatement(sql);
		Statement stm = connection.createStatement();
		ResultSet rst = stm.getResultSet();
		while(rst.next()) {
			String nome = rst.getString("NOME");
			String statusCategoria = rst.getString("STATUS");
			System.out.println("ID: , " + nome + ", " + statusCategoria);
		}
		pstm.execute(sql);
		stm.close();
		connection.close();
	}
	
	public void excluir(Long ID) throws SQLException {
		String sql = "DELETE FROM COMEX.CATEGORIA WHERE ID = ?";
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setLong(1, ID);
		ps.execute();
		ps.close();
	}
	
	
	public void alterar(Categoria categoria) throws SQLException {
		String sql = "UPDATE COMEX.CATEGORIA" + "SET ID=?," +  " NOME = ?," + "STATUS = ?";
		
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1, categoria.getNome());
		ps.execute();
		ps.close();
	}
	
//	 public List<Categoria> listar() {
//	        String sql = "SELECT * FROM comex.CATEGORIA";
//	        try {
//	           PreparedStatement pstm = connection.prepareStatement(sql);
//	           List<Categoria> categorias = new ArrayList<>();
//	            ResultSet registros = pstm.executeQuery();
//	            while (registros.next()) {
//	                Categoria categoria = this.populaCategoria(registros);
//	               categorias.add(categoria);
//	            }
//	            registros.close();
//	            pstm.close();
//	            System.out.println(categorias);
//	            return categorias;
//
//	       } catch (Exception erro) {
//	            System.out.println("Erro ao listar " + erro);
//	        }
//	        return null;
//	   }
//	 
//	 private Categoria populaCategoria(ResultSet rst) throws SQLException {
//	        Categoria categoria = new Categoria(
//	                rst.getString("nome"),
//	                StatusCategoria.valueOf(rst.getString("status")));
//	        categoria.setID(rst.getInt("id"));
//	        return categoria;
//	    }
//	 
	 @XmlElement(name="categoria")
	public List<Categoria> listar() throws SQLException {
		PreparedStatement stm = connection.prepareStatement("SELECT * FROM COMEX.CATEGORIA");
		
		List<Categoria> categorias = new ArrayList<>();
		ResultSet rst = stm.executeQuery();
		
		while(rst.next()) {
			Categoria categoria = this.populaCategoria(rst);
			categorias.add(categoria);
		}
		System.out.println(categorias);
		rst.close();
		stm.close();
		return categorias;
		}
	
	private Categoria populaCategoria(ResultSet registros) throws SQLException {
        Categoria categoria = new Categoria(
            registros.getString("nome"),
            StatusCategoria.valueOf(registros.getString("status")));
        	categoria.setID(registros.getInt("id"));
        return categoria;
    }
	
	public Categoria buscaPorId(long id) throws SQLException {
		String sql = "select * from comex.categoria where id = ?";
		
		try (PreparedStatement ps = this.connection.prepareStatement(sql)) {
			ps.setLong(1, id);
			
			try (ResultSet registro = ps.executeQuery()) {
				Categoria categoria = null;
				if (registro.next()) {
					categoria = this.populaCategoria(registro);
				}
					
				return categoria;
			}
		}
	}
}