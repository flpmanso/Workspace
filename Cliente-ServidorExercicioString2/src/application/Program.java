package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String string = "texto teste para busca";
		
		System.out.println("Informe o caracter a ser buscado: ");
		String letra = sc.nextLine();
		
		if (string.indexOf(letra) != -1) {
			System.out.println("Caracter '" + letra + "' encontrado");
		} else {
			System.out.println("Caracter não encontrado");
		}
		sc.close();
	}
}
