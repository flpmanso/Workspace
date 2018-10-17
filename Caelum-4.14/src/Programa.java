
public class Programa {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		
		p1.nome = "Thiago";
		p1.idade = 25;
		
		p1.fazAniversario();
		System.out.println(p1.idade);
		
		Porta p = new Porta();
		
		p.aberta = "n";
		p.cor = "preta";
		p.pinta("azul");
				
		p.mostra();
		
		Casa casa = new Casa();
		
		casa.cor = "preta";
		casa.pinta("Verde");
		
		casa.mostra();
	}
}
