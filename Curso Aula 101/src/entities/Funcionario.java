package entities;

public class Funcionario {
	
	private String nome;
	protected int hora;
	protected Double valorHora;
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, int hora, Double valorHora) {
		this.nome = nome;
		this.hora = hora;
		this.valorHora = valorHora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public Double getValorHora() {
		return valorHora;
	}

	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}
	
	public double pagar() {
		return this.valorHora = valorHora * hora;
	}
	
	public String toString() {
		return nome
				+" - $"
				+ pagar();
	}
	
}
