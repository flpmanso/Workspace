package entities;

public class Pessoa implements Bonificacao {
	String nome;
	double salario;
	public Pessoa(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	public Pessoa() {

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
	
	@Override
	public double calcularSalario(double salario) {
		return 0;
	}
	
	

}
