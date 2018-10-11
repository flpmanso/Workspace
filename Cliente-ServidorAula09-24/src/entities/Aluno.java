package entities;

public class Aluno {
	
	public int matricula;
	public String nome;
	public String data;
	
	public Aluno(int matricula, String nome, String data) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.data = data;
	}

	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	
	
	
	
	
}
