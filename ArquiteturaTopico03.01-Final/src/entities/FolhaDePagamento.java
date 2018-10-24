package entities;

public class FolhaDePagamento {

	

	public static void obterSalario(int cargo, String nome, double salario) {

		Bonificacao funcionario = new Funcionario(); 
		switch (cargo) {
		case 1:
			System.out.printf("A bonifica��o do funcionario " + nome + " �: %.2f%n", funcionario.calcularBonificacao(salario));

			break;
		case 2:
			funcionario = new Coordenador();
			System.out.printf("A bonifica��o do coordenador " + nome + " �: %.2f%n", funcionario.calcularBonificacao(salario));

			break;
		case 3:
			funcionario = new Diretor();
			System.out.printf("A bonifica��o do direto " + nome + " �: %.2f%n", funcionario.calcularBonificacao(salario));

			break;
		case 4:
			funcionario = new Presidente();
			System.out.printf("A bonifica��o do presidente " + nome + " �: %.2f%n", funcionario.calcularBonificacao(salario));

			break;
		}

	}

}