package arquitetura;


public class Coordenador {
	
	private String nome;
	private float salario;
	public float calcularSalario;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
	public void calcularSalario() {
		
		System.out.println("Parab�ns " + this.nome + " a sua bonificacao � de R$ " + (this.salario * 15/100)) ;
				
	}
}
