package br.com.crud.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	public static Connection createConnectionToSQLServer() throws Exception {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); // Faz com que a classe seja carregada pela JVM

		// Cria a conex�o com o banco de dados
		Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=crud;integratedSecurity=true;");

		// Cria a conex�o com o banco de dados com login e senha
		// Connection connection =
		// DriverManager.getConnection("jdbc:sqlserver://localhost;","sa","@dmin123");

		return connection;
	}

	public static void main(String[] args) throws Exception {

		// Recupera uma conex�o com o banco de dados
		Connection con = createConnectionToSQLServer();

		// Testa se a conex�o � nula
		if (con != null) {
			System.out.println("Conex�o obtida com sucesso! " + con);
			con.close();
		}
	}
}
