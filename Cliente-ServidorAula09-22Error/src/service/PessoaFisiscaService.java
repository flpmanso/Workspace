package service;

import java.util.List;

import entities.PessoaFisica;
import persistence.PessoaFisicaDAO;

public class PessoaFisiscaService {
	

	public static void percorrerArquivo(String path, List<PessoaFisica> lista) {

		PessoaFisicaDAO.percorrerArquivo(path, lista);
	}
		

	public static void escreverArquivo(String pathSaida, List<PessoaFisica> lista) {

		PessoaFisicaDAO.escreverArquivo(pathSaida, lista);
	}

}
