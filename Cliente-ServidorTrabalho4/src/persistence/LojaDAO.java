package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entities.Loja;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class LojaDAO {

	public static void inserir(Loja loja) {

		Conexao conexao = new Conexao();
		Connection conn = conexao.obtemConexao();

		String sqlInsert = "INSERT INTO cadastroloja(nome_loja, responsavel, data_inauguracao, tamanho_loja, valor_aluguel) VALUES (?, ?, ?, ? , ?)";

		PreparedStatement declara = null;

		try {
			declara = conn.prepareStatement(sqlInsert);

			declara.setString(1, loja.getNomeLoja());
			declara.setString(2, loja.getResponsavel());
			declara.setString(3, loja.getDataInauguracao());
			declara.setDouble(4, loja.getTamanhoLoja());
			declara.setDouble(5, loja.getValorAluguel());
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

	public static Loja buscar(String nomeLoja) {
		Conexao conexao = new Conexao();
		Connection conn = conexao.obtemConexao();

		List<Loja> lista = new ArrayList<>();

		String sqlSelect = "SELECT * FROM cadastroloja WHERE nome_loja like ?";

		PreparedStatement declara = null;
		ResultSet rs = null; // manipula resultados da query
		Loja cadastro = null;

		try {

			declara = conn.prepareStatement(sqlSelect);
			declara.setString(1, nomeLoja);

			rs = declara.executeQuery();

			while (rs.next()) {
				lista.add(new Loja(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5),
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

	public static void alterar(Loja loja) {

		Conexao conexao = new Conexao();
		Connection conn = conexao.obtemConexao();

		String sqlUpdate = "update cadastroloja set nome_loja = ?, responsavel = ?, data_inauguracao = ?, tamanho_loja = ?, valor_aluguel = ? where id = ?";

		PreparedStatement declara = null;
		try {
			declara = conn.prepareStatement(sqlUpdate);

			// set
			
			declara.setString(1, loja.getNomeLoja());
			declara.setString(2, loja.getResponsavel());
			declara.setString(3, loja.getDataInauguracao());
			declara.setDouble(4, loja.getTamanhoLoja());
			declara.setDouble(5, loja.getValorAluguel());
			// where
			declara.setInt(6, loja.getId());
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

	public static ObservableList<Loja> converterArrayListToObservableList() {
		Conexao conexao = new Conexao();
		Connection conn = conexao.obtemConexao();
		List<Loja> listaCadastro = new ArrayList<>();

		String sqlSelect = "select * from cadastroloja";
		PreparedStatement stm = null;
		ResultSet rs = null;

		try {
			stm = conn.prepareStatement(sqlSelect);
			rs = stm.executeQuery();
			while (rs.next()) {
				listaCadastro.add(new Loja(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getDouble(5), rs.getDouble(6)));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if (stm != null) {
				try {
					stm.close();
				} catch (SQLException e1) {
					System.out.println(e1.getStackTrace());
				}
			}
		}

		ObservableList<Loja> listaCadastroObservable = FXCollections.observableArrayList();

		for (int i = 0; listaCadastro.size() > i; i++) {

			listaCadastroObservable.add(listaCadastro.get(i));
		}

		return listaCadastroObservable;
	}

	public static String pegarUltimoId() {
		Conexao conexao = new Conexao();
		Connection conn = conexao.obtemConexao();
		
		String sqlSelect = "SELECT LAST_INSERT_ID() as ultimoid ";
		PreparedStatement stm = null;
		ResultSet rs = null;
		String id = "1";
		try {
			stm = conn.prepareStatement(sqlSelect);
			rs = stm.executeQuery();
			
			//rs = stm.getGeneratedKeys();
			
			
			while (rs.next()) {
				id = rs.getString(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if (stm != null) {
				try {
					stm.close();
				} catch (SQLException e1) {
					System.out.println(e1.getStackTrace());
				}
			}
		}

		

		return id;
	}

}