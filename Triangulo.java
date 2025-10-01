package figurasGeometricasPlanas;

public class Triangulo implements Figura {
	
	private double base;
	private double altura;
	private double ladoA;
	private double ladoB;
	private double ladoC;
	
	public Triangulo(double base, double altura, double ladoA, double ladoB, double ladoC) {
		this.base = base;
		this.altura = altura;
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}

	@Override
	public double area() {
		return ((base * altura) / 2);
	}

	@Override
	public double perimetro() {
		return (ladoA + ladoB + ladoC);
	}

}
