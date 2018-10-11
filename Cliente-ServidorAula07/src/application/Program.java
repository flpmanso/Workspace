package application;


import java.util.ArrayList;
import java.util.List;

import entities.PessoaFisica;


public class Program {

	public static void main(String[] args) {
		List<PessoaFisica> lista = new ArrayList<>();
		String path = "E:\\Manso\\Pessoal\\Facul\\Desenv Cliente-Servidor\\Aula07\\PessoaFisica.csv";
		String pathSaida = "E:\\Manso\\Pessoal\\Facul\\Desenv Cliente-Servidor\\Aula07\\PessoaFisica2.csv";
		
		PessoaFisica.percorrerArquivo(path, lista);
		PessoaFisica.escreverArquivo(pathSaida, lista);
		
		
		
	}
}
