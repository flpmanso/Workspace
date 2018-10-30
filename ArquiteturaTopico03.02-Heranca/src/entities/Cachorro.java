package entities;

public class Cachorro extends Animal implements EmiteSom{


	public Cachorro() {
		
	}

	public Cachorro(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	public String correr() {
		return "Cachorro Corre";
	
	}
	
	@Override
	public String emitirSom () {
		return "Cachorro Emite Som ";
		
	}
}
