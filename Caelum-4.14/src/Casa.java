
public class Casa {

	public String cor;
	
	void pinta(String c) {
		this.cor = c;
	}
	
	public int quantasPortasAbertas() {
		return 0;
		
	}
	
	void mostra() {
		System.out.println("a cor atual � "+ this.cor);
		System.out.println("a porta est� aberta? "+ quantasPortasAbertas());
	}
}
