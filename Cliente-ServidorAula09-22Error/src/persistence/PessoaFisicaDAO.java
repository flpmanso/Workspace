package persistence;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import entities.PessoaFisica;

public class PessoaFisicaDAO {
	
	private static String path = "E:\\Manso\\Pessoal\\Facul\\Desenv Cliente-Servidor\\Aula07\\PessoaFisica.csv";
	private static String pathSaida = "E:\\Manso\\Pessoal\\Facul\\Desenv Cliente-Servidor\\Aula07\\PessoaFisica2.csv";
	
	
	public static String getPath() {
		return path;
	}
	public static String getPathSaida() {
		return pathSaida;
	}
	
	public static void percorrerArquivo(String path, List<PessoaFisica> lista) {
	try (BufferedReader lerPath = new BufferedReader(new FileReader(path))) {

		String linha = lerPath.readLine();
		linha = lerPath.readLine();

		while (linha != null) {

			String[] campos = linha.split(";");

			int id = Integer.parseInt(campos[0]);
			double cpf = Double.parseDouble(campos[1]);
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
		Collections.sort(lista);
		

	} catch (IOException e) {
		System.out.println("Erro na abertura/fechamento do arquivo: " + e.getMessage());
	}
}

	
	public static void escreverArquivo(String pathSaida, List<PessoaFisica> lista) {

		try (BufferedWriter escreverPath = new BufferedWriter(new FileWriter(pathSaida))) {

			for (PessoaFisica pf : lista) {
				escreverPath.write(pf.id + ";" + pf.nomeCompleto + ";" + pf.cidade + ";" + pf.estado + ";" + pf.status
						+ ";" + pf.telefoneCelular + ";" + pf.telefoneContato + ";" + pf.telefoneComercial);
				escreverPath.newLine();

			}

		} catch (IOException e) {
			System.out.println("Erro na abertura/fechamento do arquivo: " + e.getMessage());
		}

	}
	
}
