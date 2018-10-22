package entities;

import java.util.Scanner;

public class FolhaDePagamento {

	Scanner sc = new Scanner(System.in);

	public void obterSalario() {

		System.out.println("informe o Nome: ");
		String nome = sc.nextLine();

		System.out.println("informe o salario: ");
		double salario = sc.nextDouble();
		Pessoa pessoa;

		System.out.println("\nQual o cargo do funcionario?\n" + "1 - Funcionario \n" + "2 - Coordenador \n"
				+ "3 - Diretor \n" + "4 - Presidente.\n ");
		int cargo = sc.nextInt();

		switch (cargo) {
		case 1:
			pessoa = new Funcionario();
			System.out.printf("A bonificação do funcionario " + nome + " é: %.2f%n", pessoa.calcularSalario(salario));

			break;
		case 2:
			pessoa = new Coordenador();
			System.out.printf("A bonificação do coordenador " + nome + " é: %.2f%n", pessoa.calcularSalario(salario));

			break;
		case 3:
			pessoa = new Diretor();
			System.out.printf("A bonificação do direto " + nome + " é: %.2f%n", pessoa.calcularSalario(salario));

			break;
		case 4:
			pessoa = new Presidente();
			System.out.printf("A bonificação do presidente " + nome + " é: %.2f%n", pessoa.calcularSalario(salario));

			break;
		}

	}

}
