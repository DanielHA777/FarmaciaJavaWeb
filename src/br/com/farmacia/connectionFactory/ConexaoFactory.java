package br.com.farmacia.connectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {
	private static final String USUARIO = "root";
	private static final String senha = "root";
	private static final String url = "jdbc:mysql://localhost:3307/sistema?autoReconnect=true&useSSL=false";

	public static Connection conectar() throws SQLException {
	// referencia ao driver mysql para versoes antigas do java
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		
		Connection conexao = DriverManager.getConnection(url, senha, USUARIO);
		return conexao;
	}
    public static void main(String[] args) {
		try {
		Connection conexao = ConexaoFactory.conectar();
		System.out.println("Conectou");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Conexão falhou");
		}
	}
}
