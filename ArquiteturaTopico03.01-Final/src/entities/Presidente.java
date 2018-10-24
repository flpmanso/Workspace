package entities;

public class Presidente extends Funcionario implements Bonificacao {
	
	
	@Override
	public double calcularBonificacao(double salario) {
		return this.salario = salario * 0.25;
	}
}