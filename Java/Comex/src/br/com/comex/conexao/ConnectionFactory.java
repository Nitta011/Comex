package br.com.comex.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.management.RuntimeErrorException;

public class ConnectionFactory {

	public static Connection recuperarConexao() throws SQLException {
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "masterkey");
	}

//	public Connection getConnection() {
//		try {
//		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "masterkey");
//		}catch(SQLException e){
//			throw new RuntimeErrorException(e);
//		}
//	}
}
