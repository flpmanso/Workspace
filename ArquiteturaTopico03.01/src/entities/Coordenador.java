package entities;

public class Coordenador extends Pessoa implements Bonificacao {

	@Override
	public double calcularSalario(double salario) {
		return this.salario = salario * 0.15;
	}

}
