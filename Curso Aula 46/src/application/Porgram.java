package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Porgram {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Valor do Dollar? ");
		CurrencyConverter.dollar = sc.nextDouble();
		
		System.out.println("quando será comprado? ");
		CurrencyConverter.compra = sc.nextDouble();
		
		
		System.out.printf("Valor a ser pago: %.2f%n" , CurrencyConverter.converter());

		
		
		sc.close();
	}

}
