package entities;

public class Aluno {
	public String nome;
	public double n1;
	public double n2;
	public double mf;

	public Aluno(String nome, double n1, double n2, double mf) {
		this.nome = nome;
		this.n1 = n1;
		this.n2 = n2;
		this.mf = mf;
	}

	public double getMf() {
		return mf;
	}

	public void setMf(double mf) {
		this.mf = mf;
	}

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	public String toString() {
		return "nome " + nome + " N1 " + n1 + " N2 " + n2 + " MF " + mf;
	}

}
