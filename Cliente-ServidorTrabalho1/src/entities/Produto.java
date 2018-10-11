package entities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Produto {
	private int idProduto;
	private String nome;
	private double valor;
	
	public Produto() {
		
	}
	public Produto(int idProduto) {
		
	}
	public Produto(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}
	public int getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void inserir(Connection conn) {
		
		String sqlInsert = "INSERT INTO produto(nome, valor) VALUES (?, ?)";
		
		PreparedStatement declara = null;
		try {
			declara = conn.prepareStatement(sqlInsert);
			
			declara.setString(1, getNome());
			declara.setDouble(2, getValor());
			declara.execute();
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(declara != null) {
				try {
					declara.close();
				}catch (SQLException e1) {
					System.out.println(e1.getStackTrace());
				}
			}
		}
	}
	
	public void buscar(Connection conn) {
		
		String sqlSelect = "SELECT nome, valor FROM produto WHERE produto.id = ?";
		
		PreparedStatement declara = null;
		ResultSet resultado = null; //manipula resultados da query
		
		try {
			this.setNome(null);
			this.setValor(0);
			declara = conn.prepareStatement(sqlSelect);
			declara.setInt(1, getIdProduto());
			
			resultado = declara.executeQuery();
			
			while(resultado.next()) {
				this.setNome(resultado.getString(1));
				this.setValor(resultado.getDouble(2));
				
				
			}
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("excecao");
			
			try {
                conn.rollback();
            } catch (SQLException e1) {
                System.out.print(e1.getStackTrace());
            }
		}finally {
			if(declara != null) {
				try {
					declara.close();
				}catch(SQLException e1) {
					System.out.println(e1.getStackTrace());
				}
			}
		}
	}

}
