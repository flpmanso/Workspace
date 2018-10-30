package entities;

public class Animal implements EmiteSom {

	public String nome;
	public int idade;

	public Animal() {

	}

	public Animal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String correr() {
		
		return null;
	}

	@Override
	public String emitirSom() {
		return null;
	}


}
