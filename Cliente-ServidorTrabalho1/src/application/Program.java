package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import entities.Conexao;
import entities.Produto;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Connection conn = null;

		Produto pl;
		int n;
		System.out.println("informe a quantidade de id para buscar: ");
		n = sc.nextInt();

		try {

			// obtem conexao com o banco
			Conexao bd = new Conexao();
			conn = bd.obtemConexao();
			pl = new Produto();
			/*
			 * conn.setAutoCommit(false);
			 * 
			 * // Inclusao do Primeiro Cliente pl = new Produto("Iphone", 4530.65);
			 * pl.inserir(conn);
			 * 
			 * // Inclusao do Segundo Cliente pl = new Produto("Xiaomi MI 6", 1800.90);
			 * pl.inserir(conn);
			 * 
			 * // efetiva inclusoes conn.commit(); System.out.println("Inclusão concluída");
			 * System.out.println("Buscando...");
			 */
			// Busca Clientes no Banco

			for (int i = 1; i <= n; i++) {
				pl.setIdProduto(i);
				pl.buscar(conn);

				if (pl.getNome() != null) {
					String saida = "Nome: " + pl.getNome() + "\nValor: " + pl.getValor() + "\nid: " + pl.getIdProduto();

					System.out.println(saida);
				} else {
					System.out.println("Id: " + i + ", não existe dados cadastrados");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			if (conn != null) {
				try {
					conn.rollback();
				} catch (SQLException e1) {
					System.out.print(e1.getStackTrace());
				}
			}
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e1) {
					System.out.print(e1.getStackTrace());
				}
			}
		}
		sc.close();
		System.exit(0);
	}
}
