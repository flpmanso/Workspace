package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
}
