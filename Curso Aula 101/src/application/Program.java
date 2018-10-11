package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.FuncionarioTerceiro;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre o numero de funcionarios: ");
		int n = sc.nextInt();
		sc.nextLine();

		List<Funcionario> list = new ArrayList<>();

		
		for (int i = 1; i <= n; i++) {
			
			System.out.println("Tem deposito inicial? (y/n)");
			char escolha = sc.next().charAt(0);
			if (escolha == 'y') {
				System.out.println();
				System.out.println("Employee #" + i + ": ");
				System.out.print("Name: ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.println("Horas: ");
				int hora = sc.nextInt();
				System.out.print("Valor da Hora: ");
				double valorHora = sc.nextDouble();
				System.out.print("Valor do Acrescimo: ");
				double acrescimo = sc.nextDouble();
				list.add(new FuncionarioTerceiro(nome, hora, valorHora, acrescimo));
				
				

			} else {

				System.out.println();
				System.out.println("Employee #" + i + ": ");
				System.out.print("Name: ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.println("Horas: ");
				int hora = sc.nextInt();
				System.out.print("Valor da Hora: ");
				double valorHora = sc.nextDouble();
				list.add(new Funcionario(nome, hora, valorHora));

			}

		}
		
		System.out.println();
		System.out.println("Pagamentos: ");
		for(Funcionario x : list) {
			System.out.println(x);
		}
		sc.close();
	}

}
