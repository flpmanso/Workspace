package entities;

public class Aluno {
	
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	public double notaFinal;
	
	public double notaFinal() {
		notaFinal = nota1 + nota2 + nota3;
		return notaFinal;
	}
	
	public double diferencaNota() {
		return 60 - notaFinal; 
	}
	
	
}
