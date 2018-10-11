package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Contrato;
import entities.Parcelas;
import services.ServicoContrato;
import services.SevicoPaypal;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Informe o numero do contrato: ");
		int numero = sc.nextInt();
		System.out.println("Informe a data do contrato: ");
		Date data = sdf.parse(sc.next());
		System.out.println("Informe o valor Total do contrato: ");
		double valorTotal = sc.nextDouble();
		
		Contrato contrato = new Contrato(numero, data, valorTotal);
		
		System.out.println("Informe o numero de parcelas: ");
		int meses = sc.nextInt();
		
		ServicoContrato servicoContrato = new ServicoContrato(new SevicoPaypal());
		
		servicoContrato.ProcessoContrato(contrato, meses);
		
		System.out.println("Parcelas: ");
		for(Parcelas x : contrato.getParcelas()) {
			System.out.println(x);
			
		}
		
		
		
		
		
		
		sc.close();
	}

}
