package entities;

public class Coordenador extends Funcionario implements Bonificacao {

	@Override
	public double calcularBonificacao(double salario) {
		return this.salario = salario * 0.15;
	}

}