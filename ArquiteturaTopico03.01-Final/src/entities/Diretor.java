package entities;

public class Diretor extends Funcionario implements Bonificacao {

	@Override
	public double calcularBonificacao(double salario) {
		return this.salario = salario * 0.2;
	}
}