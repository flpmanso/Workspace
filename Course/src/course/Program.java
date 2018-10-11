package course;

import java.util.Locale;
import java.util.Scanner;

public class Program {

		public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			System.out.println("entre a quantidade de alunos");
			double alunos = sc.nextDouble();
			
			double nota1;
			double nota2;
			double nota3;
			double soma;
			for (int i = 1; i <= alunos; i++) {
				System.out.println("informe as 3 notas do " + i + " aluno");
				nota1 = sc.nextDouble();
				nota2 = sc.nextDouble();
				nota3 = sc.nextDouble();
				
				soma = nota1 + nota2 + nota3;
				System.out.println("nota final" + soma);
			}
			
			sc.close();
	}
}
