package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();

		System.out.print("Nome do Aluno: ");
		aluno.nome = sc.nextLine();
		System.out.println("informe as 3 notas: ");
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();

		System.out.printf("NOTA FINAL: %.2f%n", aluno.notaFinal());

		if (aluno.notaFinal < 60.00) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n " ,aluno.diferencaNota());
		}
		else {
			System.out.println("PASS");
		}
		sc.close();
	}

}
