package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	private static Connection connection;
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String SERVIDOR = "localhost";
	private static final String PORTA = "3306";	
	private static final String BANCO = "clienteservidor";
	private static final String URL = "jdbc:mysql://" + SERVIDOR + ":" + PORTA + "/" + BANCO + "?useTimezone=true&serverTimezone=UTC"  ;
	private static final String USUARIO = "root";
	private static final String SENHA = "root";


	public Connection obtemConexao() {
		if (connection == null) {
			try {
				Class.forName(DRIVER);
				connection = DriverManager.getConnection(URL, USUARIO, SENHA);
			} catch (ClassNotFoundException e) {
				System.out.println("Erro ao carregar o driver de conexão\n");
			} catch (SQLException e) {
				System.out.println("Não foi possível estabalecer conexão com o banco de dados\n");
			}
		}
		System.out.println("Banco de Dados Conectado!");
		return connection;
	}
}
