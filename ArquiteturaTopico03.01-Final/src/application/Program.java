package application;

import java.util.Locale;

import view.vwBonificacao;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		vwBonificacao bon = new vwBonificacao();
		bon.obterInformacoes();


	}

}