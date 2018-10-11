package application;

import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		System.out.println("Entre altura e largura: ");
		retangulo.x = sc.nextDouble();
		retangulo.y = sc.nextDouble();
		
		System.out.println("AREA = " + retangulo.Area());
		System.out.println("PERIMETRO = " + retangulo.Perimetro());
		System.out.println("DIAGONAL = " + retangulo.Diagonal()	);
		sc.close();

	}

}
