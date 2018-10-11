package application;

public class Program {

	public static void main(String[] args) {
		
		

		String string = "texto texte de inversao";
		String textoInverso = new StringBuffer(string).reverse().toString();
		
		
		System.out.println(textoInverso);

		
	}
}