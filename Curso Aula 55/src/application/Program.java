package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta conta;

		System.out.print("Informe o numero da conta: ");
		int numero = sc.nextInt();
		System.out.print("Informe o Nome: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.println("Tem deposito inicial? (y/n)");
		char escolha = sc.next().charAt(0);
		if (escolha == 'y') {
			System.out.print("informar valor do deposito");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numero, nome, depositoInicial);
		} else {
			conta = new Conta(numero, nome);
		}
		System.out.println();
		System.out.println("Dados da conta:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("informe o valor de Deposito: ");
		double deposito = sc.nextDouble();
		conta.deposito(deposito);
		System.out.println();
		System.out.println("Dados da conta:");
		System.out.println(conta);
		
		System.out.println();
		System.out.println("informe o valor do Saque: ");
		double saque = sc.nextDouble();
		conta.saque(saque);		
		System.out.println();
		System.out.println("Dados da conta:");
		System.out.println(conta);

		sc.close();
	}

}
