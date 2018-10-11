package arquitetura;

public class Diretor {
	private String nome;
	private float salario;
	
	
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
		
		System.out.println("Parabéns " + this.nome + " a sua bonificacao é de R$ " + (this.salario * 20/100)) ;
				
	}

}
