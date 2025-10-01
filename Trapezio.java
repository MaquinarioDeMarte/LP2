package figurasGeometricasPlanas;

public class Trapezio implements Figura {
	
	private double baseMaior;
	private double baseMenor;
	private double altura;
	private double l1;
	private double l2;
	
	public Trapezio(double baseMaior, double baseMenor, double altura, double l1, double l2) {
		this.baseMaior = baseMaior;
		this.baseMenor = baseMenor;
		this.altura = altura;
		this.l1 = l1;
		this.l2 = l2;
	}

	@Override
	public double area() {
		return (((baseMaior + baseMenor) * altura / 2));
	}

	@Override
	public double perimetro() {
		return (baseMaior + baseMenor + l1 + l2);
	}

}
