package view;

import java.util.ArrayList;
import java.util.List;

import entities.PessoaFisica;
import persistence.PessoaFisicaDAO;
import service.PessoaFisiscaService;

public class vwPessoaFisica {

	public static void gerarPessoaFisica() {
	List<PessoaFisica> lista = new ArrayList<>();
	
	PessoaFisiscaService.percorrerArquivo(PessoaFisicaDAO.getPath(), lista);
	PessoaFisiscaService.escreverArquivo(PessoaFisicaDAO.getPathSaida(), lista);
	vwPessoaFisica.imprimir(lista);
	
	}
	public static void imprimir(List<PessoaFisica> lista) {
		
		for (PessoaFisica pessoa : lista) {
			System.out.println(pessoa);
		}
	}
	
	
}
