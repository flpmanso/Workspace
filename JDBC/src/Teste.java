import java.sql.Connection;
import java.sql.SQLException;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		 
	      Cliente cl;
	 
	      try {
	 
	      // obtem conexao com o banco
	         Conexao bd = new Conexao();
	         conn = bd.obtemConexao();
	 
	         conn.setAutoCommit(false);
	 /*
	      //  Inclusao do Primeiro Cliente
	         cl = new Cliente("Mariana Soares", "1127991999");
	         cl.incluir(conn);
	 
	      // Inclusao do Segundo Cliente
	         cl = new Cliente();
	         cl.setNome("João Neves");
	         cl.setFone("1160606161");
	         cl.incluir(conn);
	 
	      // Inclusao do Terceiro Cliente
	         cl = new Cliente("Maria Oliveira", "1121212121");
	         cl.incluir(conn);
	 
	      // efetiva inclusoes
	         conn.commit();
	         System.out.println("Inclusão concluída");
	         System.out.println("Buscando...");
	 */
	      // Busca Clientes no Banco
	         
	         for(int i=1; i<4;i++) {
	         cl = new Cliente(i);
	         cl.buscar(conn);
	 
	         String saida = "Nome: "+cl.getNome()+
	                         "\nTelefone: "+cl.getFone()+
	                         "\nid: "+cl.getIdCliente();
	 
	         System.out.println(saida);
	      }
	      }
	          catch (Exception e) {
	            e.printStackTrace();
	            if (conn != null) {
	               try {
	                  conn.rollback();
	               }
	                   catch (SQLException e1) {
	                     System.out.print(e1.getStackTrace());
	                  }
	            }
	         }
	      finally {
	         if (conn != null) {
	            try {
	               conn.close();
	            }
	                catch (SQLException e1) {
	                  System.out.print(e1.getStackTrace());
	               }
	         }
	      }
	      System.exit(0);
	    }
}
