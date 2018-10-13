package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entities.Aluno;

public class AlunoDAO {

	public static void inserir(int matricula, String nome, String dataNascimento) {

		Conexao conexao = new Conexao();
		Connection conn = conexao.obtemConexao();

		String sqlInsert = "INSERT INTO aluno(matricula, nome, data_Nascimento) VALUES (?, ?, ?)";

		PreparedStatement declara = null;
		try {
			declara = conn.prepareStatement(sqlInsert);

			declara.setInt(1, matricula);
			declara.setString(2, nome);
			declara.setString(3, dataNascimento);
			declara.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (declara != null) {
				try {
					declara.close();
				} catch (SQLException e1) {
					System.out.println(e1.getStackTrace());
				}
			}
		}
	}
	
	public static Aluno buscar(int matricula) {
		Conexao conexao = new Conexao();
		Connection conn = conexao.obtemConexao();
		
		
		String sqlSelect = "SELECT * FROM aluno WHERE aluno.matricula = ?";
		
		PreparedStatement declara = null;
		ResultSet resultado = null; //manipula resultados da query
		
		try {
			
			declara = conn.prepareStatement(sqlSelect);
			declara.setInt(1, matricula);
			
			resultado = declara.executeQuery();
			
			return (Aluno) resultado;
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
		return (Aluno) resultado;
	}
}
