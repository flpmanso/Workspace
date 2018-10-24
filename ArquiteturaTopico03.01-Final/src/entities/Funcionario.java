package entities;

public class Funcionario implements Bonificacao {
	
	String nome;
	double salario;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	public Funcionario() {

	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double calcularBonificacao(double salario) {
		return this.salario = salario * 0.1;

	}
}