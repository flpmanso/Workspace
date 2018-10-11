
public class BalancoTrimestral {
	public static void main(String[] args) {
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		int mediaMensal = gastosTrimestre / 3;
		System.out.println("o valor é: "+ gastosTrimestre);
		System.out.println("a media mensal é = "+ mediaMensal);
	}
}
