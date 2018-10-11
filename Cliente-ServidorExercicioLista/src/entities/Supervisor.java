package entities;

public class Supervisor implements Pessoa {
	public double salario;

	public double calcularSalario(double salario) {
		return this.salario = salario + salario * 20 / 100;
	}

}
