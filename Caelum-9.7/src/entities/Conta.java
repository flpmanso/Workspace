package entities;

public class Conta {
	private String titular;
	private int numero;
	private String agencia;
	private double saldo;
	public String dataAbertura;
	
	public Conta() {
		
	}

	public Conta(String titular, int numero, String agencia, double saldo, String dataAbertura) {
		this.titular = titular;
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.dataAbertura = dataAbertura;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public void sacar(double valor) {
		saldo = saldo - valor;

	}

	public void depositar(double valor) {
		saldo = saldo + valor;
	}

	public double calculaRendimento() {
		return saldo * 0.1;
	}

	
	public String recuperaDadosParaImpressao() {
         String dados = "Titular: " + this.titular;
         dados += "\nNúmero: " + this.numero;
         dados += "\nAgencia: " + this.agencia;
         dados += "\nSaldo: " + this.saldo;
         dados += "\nData da Abertura: " + this.dataAbertura;
         // imprimir aqui os outros atributos...
         // também pode imprimir this.calculaRendimento()
         return dados;
     }
}
