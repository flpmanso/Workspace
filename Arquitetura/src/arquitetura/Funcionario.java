package arquitetura;

public class Funcionario {
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
			
		System.out.println("Parab�ns " + this.nome + " a sua bonificacao � de R$ " + (this.salario * 10/100)) ;
				
	}

}
