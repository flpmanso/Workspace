package view;

import java.util.List;
import java.util.Scanner;

import entities.Aluno;
import service.AlunoService;

public class vwAluno {

	public static void receberAluno(List<Aluno> list) {
		Scanner sc = new Scanner(System.in);
		String n = "a";
		do {
			System.out.print("informe o nome do aluno: ");
			String nome = sc.nextLine();
			System.out.print("informe a N1: ");
			double n1 = sc.nextDouble();
			System.out.print("informe a N2: ");
			double n2 = sc.nextDouble();
			double mf = AlunoService.calcularMedia(n1, n2);

			list.add(new Aluno(nome, n1, n2, mf));

			System.out.println("digite c para continuar e s para sair");
			sc.nextLine();
			n = sc.nextLine();

		} while (!"s".equals(n));
		sc.close();
	}

	public static void imprimirLista(List<Aluno> list) {
		for (Aluno x : list) {
			System.out.println(x);
			AlunoService.verificarAprovacao(x);
		}

	}

}
