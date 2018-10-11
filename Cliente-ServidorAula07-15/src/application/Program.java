package application;


import java.util.ArrayList;
import java.util.List;

import entities.PessoaFisica;


public class Program {

	public static void main(String[] args) {
		List<PessoaFisica> lista = new ArrayList<>();
		List<String> telefone = new ArrayList<>();
		
		String path = "E:\\Manso\\Pessoal\\Facul\\Desenv Cliente-Servidor\\Aula07\\PessoaFisica.csv";
		
		PessoaFisica.percorrerArquivo(path, lista, telefone);
		
		for (PessoaFisica pessoa : lista) {
			System.out.println(pessoa);
		}
		
		
	}
}
