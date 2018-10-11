import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	// Carrega driver JDBC
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
 
    //Obtem conexao com banco de dados
    public Connection obtemConexao() throws SQLException{
        return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/clienteservidor?useTimezone=true&serverTimezone=UTC","root","root");
    }
}

