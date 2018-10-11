package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.JdbcConnection;
import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		JdbcConnection conecta = new JdbcConnection();
		Scanner sc = new Scanner(System.in);
		
		conecta.getConnection();
		conecta.closeConnection();
		/*SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
		List<Produto> list = new ArrayList<>();
		
		System.out.print("Entre o numero de produtos: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i <= n; i++) {
			
		System.out.print("Comum, Usado ou Importado? ");
		char escolha = sc.next().charAt(0);
		if (escolha == 'i') {
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Preço: ");
			double preco = sc.nextDouble();
			sc.nextLine();
			System.out.print("Taxa: ");
			double taxa = sc.nextDouble();
			list.add(new ProdutoImportado(nome, preco, taxa));
			
		} else if(escolha == 'c'){
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Preço: ");
			double preco = sc.nextDouble();
			sc.nextLine();
			list.add(new Produto(nome, preco));
			
		}else if (escolha == 'u') {
			System.out.print("Nome: ");
			String nome = sc.next();
			sc.nextLine();
			System.out.print("Preço: ");
			double preco = sc.nextDouble();
			sc.nextLine();
			System.out.print("Data de Produção: ");
			String dataDeProducao = sc.nextLine();
			Date data = dt.parse(dataDeProducao);
			list.add(new ProdutoUsado(nome, preco, data));
						
		
			}
		}
		
		for(Produto x : list) {
			x.etiquetar();
		}
		
		
		
		

		sc.close();*/
	}

}
