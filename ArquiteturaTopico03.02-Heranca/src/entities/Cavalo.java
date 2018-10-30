package entities;

public class Cavalo extends Animal implements EmiteSom{
	
	public Cavalo() {
		
	}

	public Cavalo(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	public String correr() {
		return "Cavalo Corre";
		
	}
	
	@Override
	public String emitirSom () {
		return "Cavalo Emite Som ";

	}
}
