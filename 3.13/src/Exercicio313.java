
public class Exercicio313 {
	public static void main(String[] args) {
		
		//3.13 - 4
		long fatorial = 1;
		for(long n = 1; n <= 10; n++) {
			fatorial *= n;
		}
		System.out.println("fatorial de "+ 10 + " é igual a "+ fatorial);
		
		
		
		//3.13 - 3
		/*int i = 1;
		
		while(i <= 100) {
			if(i % 3 == 0) {
				System.out.println("multiplo de 3: "+ i);
			}
			i++;
		}*/

		
		//3.13 - 2
		/*int i = 1;
		int soma;
		int j = 0;
		while(i <= 1000) {
			j = j + i;
			
			i++;
		}soma = j;
		System.out.println(soma);*/
	}
}
