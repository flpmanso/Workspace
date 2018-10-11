import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Cliente {
	 private int idCliente;
	    private String nome;
	    private String fone;
	    Cliente cl;
	    
	 
	    public Cliente(){
	 
	    }
	 
	    public Cliente(int idCliente) {
	        this.idCliente = idCliente;
	    }
	 
	    public Cliente(String nome, String fone) {
	        this.nome = nome;
	        this.fone = fone;
	    }
	 
	    public int getIdCliente() {
	        return idCliente;
	    }
	 
	    public void setIdCliente (int idCliente) {
	        this.idCliente = idCliente;
	    }
	 
	    public String getNome() {
	        return nome;
	    }
	 
	    public void setNome(String nome) {
	        this.nome = nome;
	    }
	 
	    public String getFone() {
	        return fone;
	    }
	 
	    public void setFone(String fone) {
	        this.fone = fone;
	    }
	 
	    public void adicionarCliente() {
	    	 //  Inclusao do Primeiro Cliente
	         c1 = new Cliente("Mariana Soares", "1127991999");
	         cl.incluir(conn);
	 
	      // Inclusao do Segundo Cliente
	         cl = new Cliente();
	         cl.setNome("Jo�o Neves");
	         cl.setFone("1160606161");
	         cl.incluir(conn);
	 
	      // Inclusao do Terceiro Cliente
	         cl = new Cliente("Maria Oliveira", "1121212121");
	         cl.incluir(conn);
	 
	      // efetiva inclusoes
	         conn.commit();
	         System.out.println("Inclus�o conclu�da");
	         System.out.println("Buscando...");
	    }
	    
	    
	    //  Inclusao de clientes
	    public void incluir(Connection conn) {
	 
	        //Armazena a string contento o comando sql numa variavel.
	        //Repare nos pontos de interroga��o, pois eles ser�o preenchidos!
	 
	        String sqlInsert = "INSERT INTO cliente(nome, fone) VALUES ( ?, ?)";
	 
	        //inicio um objeto que prepara a instru��o a ser executada.
	         //Veja o 'null'.Ele ainda est� vazio
	 
	        PreparedStatement stm = null;
	        try {
	 
	                //Agora sim. Atraves do objeto Connection eu
	                //recupero o objeto 'preparador de instru��o'.
	                //veja que j� inseri a variavel que tem o comando sql!
	 
	            stm = conn.prepareStatement(sqlInsert);
	 
	             //Lembra dos pontos de interroga��o, no seu comando sql?
	             //o m�todo setString seta estes pontos de interroga��o.
	             //substituindo-os pelo valor que vem no segundo par�metro.
	             //Portanto...
	 
	            //Aqui, substitui a primeira interroga��o pelo nome do cliente
	            stm.setString(1, getNome());
	 
	            //Aqui, substitui a segunda interroga��o pelo fone (telefone) do cliente
	            stm.setString(2, getFone());
	 
	            //E finalmente depois de tudo devidamente preparado ele chama
	            // o comando execute()
	            stm.execute();
	 
	        } catch (Exception e) {
	            //Caso tenha uma exce��o printa na tela
	            e.printStackTrace();
	                try {
	                    //Aqui ele 'tenta' retroceder, na a��o que deu errado.
	                    // quese um Ctrl+Z da vida.
	                    conn.rollback();
	                } catch (SQLException e1) {
	                    System.out.print(e1.getStackTrace());
	                }
	        } finally {
	            // Comando finally sempre � executado
	            if (stm != null) {
	                try {
	                    // Encerra as opera��es.
	                    stm.close();
	                } catch (SQLException e1) {
	                    System.out.print(e1.getStackTrace());
	                }
	            }
	        }
	    }
	 
	    public void buscar(Connection conn) {
	 
	        String sqlSelect = "SELECT nome, fone FROM cliente WHERE cliente.id = ?";
	 
	        PreparedStatement stm = null;
	 
	          // Aqui temos uma nova estrela no pauco.
	          // O objeto ResultSet � responsavel por manipular
	          // os resultados de uma query de busca.
	 
	        ResultSet rs = null;
	 
	        try {
	            //vide explica�ao anterior
	            stm = conn.prepareStatement(sqlSelect);
	 
	            //ponto de interroga��o por valor getIdCliente()
	            stm.setInt(1, getIdCliente());
	 
	            //O comando abaixo retorna um objeto ResultSet
	            //com os valores dos dados buscados.
	 
	            rs = stm.executeQuery();
	 
	            //use next() para verificar se ele veio preenchido
	            //de dados. Ele tamb�m pode ser usado em um while,
	            //para querys que resultem em mais de um registro.
	 
	            while (rs.next()){
	 
	                //Acima no nosso select foi declarado:
	                //SELECT nome, fone FROM..
	                //portanto o 1 = nome e o
	                //2 = fone
	 
	                //getString(1) refere-se ao atributo 'nome' da nossa query
	                this.setNome(rs.getString(1));
	 
	                //J� o getString(2) refere-se ao atributo 'fone'
	                this.setFone(rs.getString(2));
	            }
	 
	        } catch (Exception e) {
	            e.printStackTrace();
	                try {
	                    conn.rollback();
	                } catch (SQLException e1) {
	                    System.out.print(e1.getStackTrace());
	                }
	        } finally {
	            if (stm != null) {
	                try {
	                    stm.close();
	                } catch (SQLException e1) {
	                    System.out.print(e1.getStackTrace());
	                }
	            }
	        }
	    }
	}


