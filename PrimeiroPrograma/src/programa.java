import java.util.Scanner;


public class programa {
	public static int somaAlgarismosB(int num, int somaMomentanea) {
		if(num<1)
			return somaMomentanea;
		somaMomentanea+=(num%10);
		return somaAlgarismosB(num/10, somaMomentanea);
		
	}
	
	public static void main(String[] args) {
		System.out.println("informe um numero ");
		int num = new Scanner(System.in).nextInt();
		int soma = somaAlgarismosB(num, 0);
		System.out.println("o valor é: "+ soma);
		
				
		
		
		
		
		
		
		
		
		//Scanner in = new Scanner(System.in);
		//
		//System.out.println("informe um numero ");
		//int n = in.nextInt();
		//int soma = 0;
		//
		//while (n > 0) {
		//	int modulo = n%10;
		//	soma += modulo;
		//	n /= 10;
		//	System.out.println("O Valor de soma é: " + soma);
		//}
		//System.out.println();
		//System.out.println("a soma dos alg é: " + soma);
		//
		
		
		//Scanner in = new Scanner(System.in);
		//
		//System.out.println("informe o numero de inicio da contagem ");
		//int inicio = in.nextInt();
		//
		//System.out.println("informe o numero de termino da contagem ");
		//int fim = in.nextInt();
		//
		//int i = inicio;
		//int soma = inicio;
		//while (i<fim) {
		//	i++;
		//	soma+=i;	
		//}
		//System.out.println(soma);

			
		
		
		
		
		
		
		
		//Scanner in = new Scanner(System.in);
		//int n = 0;
		//
		//for (int t = 1; t <= 100; t++ ) {
		//	n += t;
		//	
		//}
		//System.out.println(n);
		//
		
			
		
		//Scanner in = new Scanner(System.in);
		//
		//System.out.println("simplifique expressoes");
		//
		//String s = (new Scanner(System.in).nextInt() > 10 ) ? "Maior":"menor";
		//System.out.println("o numero digitado é: " + s + " do que 10");
		
				
		//Scanner in = new Scanner(System.in);
		//
		//System.out.println("Digite o seu Login: ");
		//String login = in.nextLine();
		//
		//System.out.println("Digite sua senha: ");
		//String senha = in.nextLine();
		//
		//if (login.equals("123") && senha.equals("321")) {
		//	System.out.printf("usuario %s logado com sucesso:", login);
		//	
		//}else {
		//	System.out.println("usuario e senha incorreto");
		//	
		//}
		
		
		
		//Scanner in = new Scanner(System.in);
		//
		//System.out.println("informe a sua idade:");
		//int idade = in.nextInt();
		//		
		//System.out.println("informe a idade da sua mae: ");
		//int idade1 = in.nextInt();
		//
		//int diff = idade1 - idade;
        //// 4) é imprimir o texto e substituir a tag <anos>
        //System.out.printf("Minha mãe é %d anos mais velha do que eu!", diff);
		
		//Scanner in = new Scanner(System.in);
		//
		//System.out.println("digite o nome: ");
		//String nome = in.nextLine();
		//
		//System.out.println("informe sua idade: ");
		//int idade = in.nextInt();
		//in.nextLine();
		//
		//System.out.println("informe a cidade de nascimento: ");
		//String cidade = in.next();
		//
		//System.out.println("Ola, meu nome é " +nome);
		//System.out.println(", sou natural de "+cidade);
		//System.out.println("tenho "+idade);
		//System.out.println("anos e estou aprendendo a programar");
		
		
		
		
	}
		
	
}
