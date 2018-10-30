package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
		
		List<Aluno> listaAluno = new ArrayList<>();
		
		String sqlSelect = "SELECT * FROM aluno WHERE aluno.matricula = ?";
		
		
		
		PreparedStatement declara = null;
		ResultSet rs = null; //manipula resultados da query
		Aluno aluno = null;
		
		try {

			declara = conn.prepareStatement(sqlSelect);
			declara.setString(1,  Integer.toString(matricula));
			
			rs = declara.executeQuery();
			
			while (rs.next()) {
				listaAluno.add(new Aluno(Integer.parseInt(rs.getString(2)), rs.getString(3), rs.getString(4)));
			}
		}catch (Exception e) {
			System.out.println("excecao");
			e.printStackTrace();
			
			
			try {
                conn.rollback();
            } catch (SQLException e1) {
            	System.out.println("excecao 2");
                System.out.print(e1.getStackTrace());
            }
		}finally {
			if(declara != null) {
				try {
					declara.close();
				}catch(SQLException e1) {
					System.out.println("excecao 3");
					System.out.println(e1.getStackTrace());
				}
			}
		}
		
		if (listaAluno.isEmpty()) {
			return aluno = null;
		} else {
			return aluno = listaAluno.get(0);
		}
		
	}
}
