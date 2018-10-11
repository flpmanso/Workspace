package application;

import java.util.Locale;

import entities.FolhaDePagamento;


public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		FolhaDePagamento fp = new FolhaDePagamento();
		fp.obterSalario();

	}

}
