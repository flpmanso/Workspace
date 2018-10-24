package application;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Conta c1 = new Conta();

        c1.setTitular("Hugo");
        c1.setNumero(123);
        c1.setAgencia("45678-9");
        c1.setSaldo(500.0);
        c1.dataAbertura = "04/06/2015";
        
        Conta c2 = new Conta();

        c1.setTitular("Jorge");
        c1.setNumero(123);
        c1.setAgencia("45678-9");
        c1.setSaldo(300.0);
        c1.dataAbertura = "04/06/2015";
        
        c2 = c1;
        
        if (c1 == c2) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");        
        }

        c2.depositar(100.0);
        System.out.println("saldo atual:" + c2.getSaldo());
        System.out.println("rendimento mensal:" + c2.calculaRendimento());
        
        c2.sacar(200.0);
        System.out.println("saldo atual:" + c2.getSaldo());
        System.out.println("rendimento mensal:" + c2.calculaRendimento());
        
        System.out.println("\n");
        System.out.println(c2.recuperaDadosParaImpressao());
        
    }
}
