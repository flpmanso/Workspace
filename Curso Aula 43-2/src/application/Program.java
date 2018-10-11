package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Nome: ");
		funcionario.nome = sc.nextLine();
		System.out.print("Salario: ");
		funcionario.salario = sc.nextDouble();
		System.out.print("Imposto: ");
		funcionario.imposto = sc.nextDouble();
		
		System.out.printf("Funcionario: %s , $ %.2f%n" ,funcionario.nome, funcionario.NetSalary());
		System.out.println();
		
		System.out.print("Porcentagem para aumentar salario? " );
		double porcentagem = sc.nextDouble();
		funcionario.IncreaseSalary(porcentagem);
		
		System.out.printf("Dados atualizados Funcionario: %s , $ %.2f%n" ,funcionario.nome, funcionario.NetSalary());
			
		sc.close();
	}

}
