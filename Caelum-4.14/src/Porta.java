
public class Porta {
	String aberta;
	String cor;
	double dimensaox;
	double dimensaoy;
	double dimensaoz;
	
	void abre() {
		this.aberta = "s";
	}
	
	void fecha() {
		this.aberta = "n";
		
	}
	
	void pinta(String c) {
		this.cor = c;
	}
	
	boolean estaAberta() {
		if(aberta == "s") {
			return true;
		}else {
			return false;
		}
	}
	
	void mostra() {
		System.out.println("a cor atual � "+ this.cor);
		System.out.println("a porta est� aberta? "+ estaAberta());
	}
}
