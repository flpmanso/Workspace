package entities;

public class FuncionarioTerceiro extends Funcionario {
	
	private double acrescimo;

	public FuncionarioTerceiro(String nome, int hora, Double valorHora, double acrescimo) {
		super(nome, hora, valorHora);
		this.acrescimo = acrescimo;
	}

	public FuncionarioTerceiro() {
		// TODO Auto-generated constructor stub
	}

	public double getAcrescimo() {
		return acrescimo;
	}

	public void setAcrescimo(double acrescimo) {
		this.acrescimo = acrescimo;
	}
	
	@Override
	public double pagar() {
		return this.valorHora = valorHora * hora + (acrescimo * 110 / 100) ;
	}
	

}
