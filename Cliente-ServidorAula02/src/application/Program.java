package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Diretor;
import entities.Funcionario;
import entities.Gerente;
import entities.Supervisor;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("informe o salario: ");
		double salario = sc.nextDouble();

		if (salario < 1000.00) {
			System.out.println("Valor fora da faixa ");
		} else if (salario < 3000.00) {
			Funcionario.salario = salario;
			System.out.printf("salario do funcionario é: %.2f%n", Funcionario.calcSalario());
		} else if (salario < 5000.00) {
			Supervisor.salario = salario;
			System.out.printf("salario do Supervisor é: %.2f%n", Supervisor.calcSalario());
		} else if (salario < 10000.00) {
			Gerente.salario = salario;
			System.out.printf("salario do Gerente é: %.2f%n", Gerente.calcSalario());
		} else if (salario < 20000.00) {
			Diretor.salario = salario;
			System.out.printf("salario do Diretor é: %.2f%n", Diretor.calcSalario());
		} else {
			System.out.println("Valor fora da faixa ");
		}

		sc.close();
	}

}
