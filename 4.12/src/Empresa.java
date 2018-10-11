
public class Empresa {
	String nome;
	String cnpj;
	Funcionario[] empregados;
	int n = 0;
	
	void adiciona(Funcionario f) {
		this.empregados[n] = f;
		n++;
	}
	
	void mostraEmpregados() {
		for (int i =0; i < this.empregados.length; i++) {

			System.out.println("Funcionario na posição: "+ i );
			
		}
	}
}
