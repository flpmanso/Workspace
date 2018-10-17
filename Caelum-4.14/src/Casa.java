
public class Casa {

	public String cor;
	
	void pinta(String c) {
		this.cor = c;
	}
	
	public int quantasPortasAbertas() {
		return 0;
		
	}
	
	void mostra() {
		System.out.println("a cor atual é "+ this.cor);
		System.out.println("a porta está aberta? "+ quantasPortasAbertas());
	}
}
