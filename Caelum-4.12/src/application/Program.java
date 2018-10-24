package application;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Conta c1 = new Conta();

        c1.titular = "Hugo";
        c1.numero = 123;
        c1.agencia = "45678-9";
        c1.saldo = 500.0;
        c1.dataAbertura = "04/06/2015";
        
        Conta c2 = new Conta();

        c2.titular = "Jorge";
        c2.numero = 123;
        c2.agencia = "12345-9";
        c2.saldo = 1000.0;
        c2.dataAbertura = "04/06/2016";
        
        c2 = c1;
        
        if (c1 == c2) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");        
        }

        c2.depositar(100.0);
        System.out.println("saldo atual:" + c2.saldo);
        System.out.println("rendimento mensal:" + c2.calculaRendimento());
        
        c2.sacar(200.0);
        System.out.println("saldo atual:" + c2.saldo);
        System.out.println("rendimento mensal:" + c2.calculaRendimento());
        
        System.out.println("\n");
        System.out.println(c2.recuperaDadosParaImpressao());
        
    }
}
