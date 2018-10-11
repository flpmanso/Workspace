package entities;

public class Funcionario {
	
	public String nome;
	public double salario;
	public double imposto;
	
	
	public double NetSalary() {
		return salario - imposto;
	}
	
	public void IncreaseSalary(double porcentagem) {
		salario = salario + (salario * porcentagem) / 100;
	}

}
