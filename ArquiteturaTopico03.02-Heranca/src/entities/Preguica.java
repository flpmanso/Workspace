package entities;

public class Preguica extends Animal implements EmiteSom {
	
	public Preguica() {
		
	}
	
	public Preguica(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	public static void escalar() {
		System.out.println("Pregui�a Escala");
	}
	
	@Override
	public String emitirSom () {
		return "Pregui�a Emite Som " ;
	}
}
