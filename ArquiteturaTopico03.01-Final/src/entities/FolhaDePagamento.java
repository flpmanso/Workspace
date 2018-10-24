package entities;

public class FolhaDePagamento {

	

	public static void obterSalario(int cargo, String nome, double salario) {

		Bonificacao funcionario = new Funcionario(); 
		switch (cargo) {
		case 1:
			System.out.printf("A bonificação do funcionario " + nome + " é: %.2f%n", funcionario.calcularBonificacao(salario));

			break;
		case 2:
			funcionario = new Coordenador();
			System.out.printf("A bonificação do coordenador " + nome + " é: %.2f%n", funcionario.calcularBonificacao(salario));

			break;
		case 3:
			funcionario = new Diretor();
			System.out.printf("A bonificação do direto " + nome + " é: %.2f%n", funcionario.calcularBonificacao(salario));

			break;
		case 4:
			funcionario = new Presidente();
			System.out.printf("A bonificação do presidente " + nome + " é: %.2f%n", funcionario.calcularBonificacao(salario));

			break;
		}

	}

}