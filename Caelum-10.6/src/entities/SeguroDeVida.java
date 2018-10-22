package entities;

public class SeguroDeVida implements Tributavel {

	private double valor;
	private String titular;
	private int numeroApolice;

	public SeguroDeVida(double valor, String titular, int numeroApolice) {
		super();
		this.valor = valor;
		this.titular = titular;
		this.numeroApolice = numeroApolice;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getNumeroApolice() {
		return numeroApolice;
	}

	public void setNumeroApolice(int numeroApolice) {
		this.numeroApolice = numeroApolice;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	@Override
	public double getValorImposto() {
		return 42 + this.valor * 0.02;
	}

	@Override
	public String getTitular() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return null;
	}

}
