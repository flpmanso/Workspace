package entities;

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
				System.out.println("Erro ao carregar o driver de conex�o\\n");
			} catch (SQLException e) {
				System.out.println("N�o foi poss�vel estabalecer conex�o com o banco de dados\\n");
			}
		}
		System.out.println("Banco de Dados Conectado!");
		return connection;
	}
	
	
}
	
	
	
	
	
	
	
	
//	// Carrega driver JDBC
//	static {
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			throw new RuntimeException(e);
//		}
//	}
//
//	// Obtem conexao com banco de dados
//	public Connection obtemConexao() throws SQLException{
//       
//        		String hostName = "localhost";
//                String dbName = "clienteservidor";
//                String user = "root";
//                String password = "root";
//                String url = String.format("jdbc:sqlserver://%s:3306;database=%s;user=%s;password=%s;encrypt=true;hostNameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
//                Connection connection = null;
//               
//                try {
//                    connection = DriverManager.getConnection(url);
//                    String schema = connection.getSchema();
//                    System.out.println("Successful connection - Schema: " + schema);
//                    
//                }catch(NullPointerException e) {
//                	e.getMessage();
//                }
//				return connection;
//    }
//}
