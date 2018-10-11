package application;

public class ContagemLetra {

	private char letra;
	private int quantidade;

	public ContagemLetra(char letra) {
		this.letra = letra;
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void incrementarQuantidade() {
		quantidade++;
	}

}
