package view;

import java.util.Scanner;

import entities.FolhaDePagamento;

public class vwBonificacao {
	
	Scanner sc = new Scanner(System.in);

	public void obterInformacoes() {
		
		System.out.println("informe o Nome: ");
		String nome = sc.nextLine();

		System.out.println("informe o salario: ");
		double salario = sc.nextDouble();

		System.out.println("\nQual o cargo do funcionario?\n" + "1 - Funcionario \n" + "2 - Coordenador \n"
				+ "3 - Diretor \n" + "4 - Presidente.\n ");
		int cargo = sc.nextInt();
		
		FolhaDePagamento.obterSalario(cargo, nome, salario);
	}
}
