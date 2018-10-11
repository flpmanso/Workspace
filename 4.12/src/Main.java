
public class Main {
	public static void main(String[] args) {
		Funcionario c = new Funcionario();
		Empresa e = new Empresa();
		e.empregados = new Funcionario[3];
		
		
		
		c.nome = "Manso";
		c.rg = "5283783";
		c.salario = 2800.0;
		c.setRecebeAumento(100);
		e.adiciona(c);
		
		Funcionario c2 = new Funcionario();
		c2.nome = "Gundim";
		c2.salario = 3000.0;
		e.adiciona(c2);
		
		e.mostraEmpregados();
		
	
		
		
		//Funcionario c2 = c;
		//c2.nome = "Gundin";
		//c2.salario = 3000.0;
		//c2.recebeAumento(50);
		
		
		//if (c == c2) {
	//		System.out.println("iguais");
	//	}else {
	//		System.out.println("Diferentes");
	//	}
		//c.mostra();
		//c2.mostra();
		
	}
}
