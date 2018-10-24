package entities;

public class Funcionario extends Pessoa implements Bonificacao {
	@Override
	public double calcularSalario(double salario) {
		return this.salario = salario * 0.1;

	}
}
