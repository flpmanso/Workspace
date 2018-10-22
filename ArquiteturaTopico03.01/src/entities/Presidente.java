package entities;

public class Presidente extends Pessoa implements Bonificacao {
	@Override
	public double calcularSalario(double salario) {
		return this.salario = salario * 0.25;
	}
}
