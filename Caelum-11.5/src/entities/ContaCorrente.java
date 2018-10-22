package entities;

public class ContaCorrente extends Conta {

	private double limiteEmprestimo;

	public ContaCorrente(String titular, int numero, String agencia, double saldo, String dataAbertura,
			double limiteEmprestimo) {
		super(titular, numero, agencia, saldo, dataAbertura);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public ContaCorrente() {
		// TODO Auto-generated constructor stub
	}

	public double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}
	
	
}
