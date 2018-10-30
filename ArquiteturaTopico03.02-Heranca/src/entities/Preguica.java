package entities;

public class Preguica extends Animal implements EmiteSom {
	
	public Preguica() {
		
	}
	
	public Preguica(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	public static void escalar() {
		System.out.println("Preguiça Escala");
	}
	
	@Override
	public String emitirSom () {
		return "Preguiça Emite Som " ;
	}
}
