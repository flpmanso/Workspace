package entities;

public class Conta {
	private int numero;
	private String nome;
	private double saldo;

	public Conta(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}

	public Conta(int numero, String nome, double depositoInicial) {
		this.numero = numero;
		this.nome = nome;
		deposito(depositoInicial);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double valor) {
		saldo += valor;
	}

	public void saque(double valor) {
		if (valor <= saldo) {
			saldo -= valor + 5.0;
		} else
			System.out.println("saldo insuficiente, usando limite.	");
		saldo -= valor + 5.0;
	}

	public String toString() {
		return "Conta:" + numero + ", Nome: " + nome + ", Saldo: " + String.format("%.2f", saldo);

	}

}
