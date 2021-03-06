package persistence;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.PessoaFisica;

public class PessoaFisicaDAO {

	public static List<PessoaFisica> percorrerArquivo() {

		String path = "E:\\Manso\\Pessoal\\Facul\\Desenv Cliente-Servidor\\Aula07\\PessoaFisica.csv";
		List<PessoaFisica> lista = new ArrayList<>();

		try (BufferedReader lerPath = new BufferedReader(new FileReader(path))) {

			String linha = lerPath.readLine();
			linha = lerPath.readLine();

			while (linha != null) {

				String[] campos = linha.split(";");

				int id = Integer.parseInt(campos[0]);
				String cpf = campos[1];
				String nomeCompleto = campos[2];
				String cidade = campos[3];
				String estado = campos[4];
				String status = campos[5];
				String telefoneCelular = (campos[6]);
				String telefoneContato = "";
				String telefoneComercial = "";
				if (campos.length == 8) {
					telefoneContato = (campos[7]);
				} else if (campos.length == 9) {
					telefoneContato = (campos[7]);
					telefoneComercial = (campos[8]);
				}

				lista.add(new PessoaFisica(id, cpf, nomeCompleto, cidade, estado, status, telefoneCelular,
						telefoneContato, telefoneComercial));

				linha = lerPath.readLine();

			}

		} catch (IOException e) {
			System.out.println("Erro na abertura/fechamento do arquivo: " + e.getMessage());
		}
		return lista;
	}

	public static void escreverArquivo(int id, String cpf, String nome, String cidade, String estado, String status,
			String telefone1, String telefone2, String telefone3) {

		String pathSaida = "E:\\Manso\\Pessoal\\Facul\\Desenv Cliente-Servidor\\Aula07\\PessoaFisica2.csv";

		try (BufferedWriter escreverPath = new BufferedWriter(new FileWriter(pathSaida, true))) {

			escreverPath.write(id + ";" + cpf + ";" + nome + ";" + cidade + ";" + estado + ";" + status + ";"
					+ telefone1 + ";" + telefone2 + ";" + telefone2 + ";");
			escreverPath.newLine();

		} catch (IOException e) {
			System.out.println("Erro na abertura/fechamento do arquivo: " + e.getMessage());
		}

	}

}
