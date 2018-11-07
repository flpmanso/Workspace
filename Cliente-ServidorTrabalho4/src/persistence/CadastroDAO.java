package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entities.Cadastro;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class CadastroDAO {

	public static void inserir(Integer id, String nomeLoja, String responsavel, java.sql.Date dataInauguracao,
			double tamanhoLoja, double valorAluguel) {

		Conexao conexao = new Conexao();
		Connection conn = conexao.obtemConexao();

		String sqlInsert = "INSERT INTO cadastroloja(id, nome_loja, responsavel, data_inauguracao, tamanho_loja, valor_aluguel) VALUES (?, ?, ?, ?, ? , ?)";

		PreparedStatement declara = null;
		try {
			declara = conn.prepareStatement(sqlInsert);

			declara.setInt(1, id);
			declara.setString(2, nomeLoja);
			declara.setString(3, responsavel);
			declara.setDate(4, dataInauguracao);
			declara.setDouble(5, tamanhoLoja);
			declara.setDouble(6, valorAluguel);
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

	public static Cadastro buscar(int id) {
		Conexao conexao = new Conexao();
		Connection conn = conexao.obtemConexao();

		List<Cadastro> lista = new ArrayList<>();

		String sqlSelect = "SELECT * FROM cadastroloja WHERE id = ?";

		PreparedStatement declara = null;
		ResultSet rs = null; // manipula resultados da query
		Cadastro cadastro = null;

		try {

			declara = conn.prepareStatement(sqlSelect);
			declara.setInt(1, id);

			rs = declara.executeQuery();

			while (rs.next()) {
				lista.add(new Cadastro(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5),
						rs.getDouble(6)));
			}
		} catch (Exception e) {
			System.out.println("excecao");
			e.printStackTrace();

			try {
				conn.rollback();
			} catch (SQLException e1) {
				System.out.println("excecao 2");
				System.out.print(e1.getStackTrace());
			}
		} finally {
			if (declara != null) {
				try {
					declara.close();
				} catch (SQLException e1) {
					System.out.println("excecao 3");
					System.out.println(e1.getStackTrace());
				}
			}
		}

		if (lista.isEmpty()) {
			return cadastro = null;
		} else {
			return cadastro = lista.get(0);
		}

	}

	public static void alterar(Integer id, String nomeLoja, String responsavel, java.sql.Date dataInauguracao,
			double tamanhoLoja, double valorAluguel) {

		Conexao conexao = new Conexao();
		Connection conn = conexao.obtemConexao();

		String sqlUpdate = "update cadastroloja set nome_loja = ?, responsavel = ?, data_inauguracao = ?, tamanho_loja = ?, valor_aluguel = ? where id = ?";

		PreparedStatement declara = null;
		try {
			declara = conn.prepareStatement(sqlUpdate);

			// set
			declara.setString(1, nomeLoja);
			declara.setString(2, responsavel);
			declara.setDate(3, dataInauguracao);
			declara.setDouble(4, tamanhoLoja);
			declara.setDouble(5, valorAluguel);
			// where
			declara.setInt(6, id);
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

	public static void deletar(Integer id) {

		Conexao conexao = new Conexao();
		Connection conn = conexao.obtemConexao();

		String sqlDelete = "DELETE FROM cadastroloja WHERE id = ?";

		PreparedStatement declara = null;
		try {
			declara = conn.prepareStatement(sqlDelete);

			// where
			declara.setInt(1, id);
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

	public static ObservableList<Cadastro> converterArrayListToObservableList() {
		Conexao conexao = new Conexao();
		Connection conn = conexao.obtemConexao();
		List<Cadastro> listaCadastro = new ArrayList<>();

		String sqlSelect = "select * from cadastroloja";
		PreparedStatement stm = null;
		ResultSet rs = null;

		try {
			stm = conn.prepareStatement(sqlSelect);
			rs = stm.executeQuery();
			while (rs.next()) {
				listaCadastro.add(new Cadastro(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getDouble(5), rs.getDouble(6)));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		ObservableList<Cadastro> listaCadastroObservable = FXCollections.observableArrayList();

		for (int i = 0; listaCadastro.size() > i; i++) {

			listaCadastroObservable.add(listaCadastro.get(i));
		}

		return listaCadastroObservable;
	}

	public static int pegarUltimoId() {
		Conexao conexao = new Conexao();
		Connection conn = conexao.obtemConexao();
		List<Cadastro> listaCadastro = new ArrayList<>();

		String sqlSelect = "select * from cadastroloja";
		PreparedStatement stm = null;
		ResultSet rs = null;

		try {
			stm = conn.prepareStatement(sqlSelect);
			rs = stm.executeQuery();
			while (rs.next()) {
				listaCadastro.add(new Cadastro(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getDouble(5), rs.getDouble(6)));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		List<Integer> ids = listaCadastro.stream().map(x -> x.getId()).collect(Collectors.toList());

		return ids.get(ids.size() - 1) + 1;

	}
}
