package entities;

public class Coordenador implements Pessoa {
	public String nome;
	public double salario;

	public double calcularSalario(double salario) {
		return this.salario = salario * 0.15;
	}

}
