
class Funcionario {
	private String nome;
	private String departamento;
	private double salario;
	private String rg;
	private double ganhoAnual;
	private Data dataEntrada;
	
	
	
	public void setRecebeAumento(double quantidade) {
		this.salario += quantidade;
	}
	
	double getCalculaGanhoAnual() {
		return ganhoAnual = salario * 12;
	}
	
	
	void mostra() {
		
		System.out.println("nome do funcionario: "+ this.nome);
		System.out.println("seu RG �: "+ this.rg);
		System.out.println("seu novo salario "+ this.salario);
		System.out.println("seu ganho anual � "+ this.getCalculaGanhoAnual());
		System.out.println("a data � "+ this.dataEntrada.dia);
		System.out.println("a data � "+ this.dataEntrada.mes);
		System.out.println("a data � "+ this.dataEntrada.ano);
	}
	
}
