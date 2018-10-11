

public class Conta {
	int numero;
	private double saldo;
	private double limite;
	private double salario;
	private static int totalDeContas;
	Cliente titular;
	
	
	Conta (){
		Conta.totalDeContas = Conta.totalDeContas +1;
	}
	
	public static int getTotalDeContas() {
		return Conta.totalDeContas;
	}
	

	public boolean saca(double quantidade) {
		if(this.getSaldo() < quantidade){
			return false;			
		}
		else {
			this.setSaldo(this.getSaldo() - quantidade);
			return true;
		}
	}
		
	void deposita(double quantidade) {
		this.setSaldo(this.getSaldo() + quantidade);
	}
	boolean transfere(Conta destino, double quantidade) {
		boolean retirou = this.saca(quantidade);
		if(retirou == false) {
			return false;
		}else {
			destino.deposita(quantidade);
			return true;
		}
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
