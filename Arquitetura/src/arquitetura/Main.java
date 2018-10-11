package arquitetura;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Coordenador c = new Coordenador();
		Diretor d = new Diretor();
		Funcionario f = new Funcionario();
		Presidente p = new Presidente();
		

		System.out.println("Digite 1 para funcionario \n"
				+ "Digite 2 para Coordenador\n"
				+ "Digite 3 para Diretor\n"
				+ "Digite 4 para Presidente\n");
		Scanner s1 = new Scanner(System.in);
		int tipo;
		tipo = s1.nextInt();
		
			
		System.out.println("Digite o seu nome: ");
		Scanner s2 = new Scanner(System.in);
		String nome;
		nome = s2.nextLine();
		
		
		System.out.println("Digite o seu salario: ");
		Scanner s3 = new Scanner(System.in);
		float salario;
		salario = s3.nextFloat();
		
		
		if(tipo == 1) {
			f.setSalario(salario);
			f.setNome(nome);
			f.calcularSalario();
			
		}
					
			else if(tipo == 2) {				
				c.setSalario(salario);
				c.setNome(nome);
				c.calcularSalario();
			}
				else if(tipo == 3)  {
					d.setSalario(salario);
					d.setNome(nome);
					d.calcularSalario();
				}
					else if(tipo == 4)  {
						p.setSalario(salario);
						p.setNome(nome);
						p.calcularSalario();
					}
	}

}
