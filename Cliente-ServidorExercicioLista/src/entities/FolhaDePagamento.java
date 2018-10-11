package entities;

import java.util.Scanner;

public class FolhaDePagamento {

	Scanner sc = new Scanner(System.in);

	public void obterSalario() {

		System.out.println("informe o salario: ");
		double salario = sc.nextDouble();
		Pessoa pessoa;
		if (salario < 1000.00) {
			System.out.println("Valor fora da faixa ");
		} else if (salario < 3000.00) {
			pessoa = new Funcionario();
			System.out.printf("salario do funcionario é: %.2f%n", pessoa.calcularSalario(salario));
		} else if (salario < 5000.00) {
			pessoa = new Supervisor();
			System.out.printf("salario do Supervisor é: %.2f%n", pessoa.calcularSalario(salario));
		} else if (salario < 10000.00) {
			pessoa = new Gerente();
			System.out.printf("salario do Gerente é: %.2f%n", pessoa.calcularSalario(salario));
		} else if (salario < 20000.00) {
			pessoa = new Diretor();
			System.out.printf("salario do Diretor é: %.2f%n", pessoa.calcularSalario(salario));
		} else {
			System.out.println("Valor fora da faixa ");
		}
	}

}

