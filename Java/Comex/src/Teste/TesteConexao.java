package Teste;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;

public class TesteConexao {
	public static void main(String[] args) throws SQLException, ClassNotFoundException { 
		//ConnectionFactory connectionFactory = new ConnnectionFactory(); 
		Connection conexao = DriverManager
		.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM","masterkey");
		System.out.println("Conexão estabelecida!");
		System.out.println("Fechando conexão");
		conexao.close();
	}
}