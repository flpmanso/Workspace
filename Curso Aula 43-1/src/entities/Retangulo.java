package entities;

public class Retangulo {
	
	public double x;
	public double y;
	public double perimetro;
	
	public double Area() {
		return x * y;
	}
	
	public double Perimetro() {
		return  (x + y)* 2;
	}
	
	public double Diagonal() {
		return Math.sqrt((x*x)+(y*y));
	}
	
}
