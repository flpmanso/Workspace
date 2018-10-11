package application;

import java.util.Scanner;

import entitites.Cliente;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos Quartos para aluguel ? ");
		int n = sc.nextInt();
		sc.nextLine();

		Cliente[] vect = new Cliente[10];

		for (int i = 1; i <= n; i++) {

			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.println("Quarto: ");
			int quarto = sc.nextInt();
			sc.nextLine();
			vect[quarto] = new Cliente(nome, email);
		}

		System.out.println("Quartos ocupados: ");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		sc.close();
	}
}
