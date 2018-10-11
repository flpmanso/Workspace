package application;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String path = "E:\\manso\\Pessoal\\Facul\\Desenv Cliente-Servidor\\Moodle\\15.09\\arquivo.txt";
		

		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			
			int escolha = 1;
			
			while(escolha != 0) {
			System.out.println("informe o texto desejado: ");
						
			String text = sc.nextLine();
			bw.write(text);
			bw.newLine();
			
			System.out.println("informe 1 para continuar ou 0 para sair.");
			escolha = sc.nextInt();
			sc.nextLine();
			}
			
		}catch(FileNotFoundException e){
			e.getMessage();
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
		sc.close();
	}

}
