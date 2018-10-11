package entities;

public class Diretor implements Pessoa {
	public double salario;

	public double calcularSalario(double salario) {
		return this.salario = salario + salario * 10 / 100;
	}
}
