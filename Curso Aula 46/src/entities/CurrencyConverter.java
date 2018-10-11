package entities;

public class CurrencyConverter {
	
	public static double dollar;
	public static double compra;
	
	public static double converter(){
		double aux = dollar * compra;
		return aux + aux * 6 / 100;
		
		
	}

	
	

}
