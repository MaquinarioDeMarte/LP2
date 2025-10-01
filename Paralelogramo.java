package figurasGeometricasPlanas;

public class Paralelogramo implements Figura {
	
	private double base;
	private double altura;
	private double lado;
	
	public Paralelogramo(double base, double altura, double lado) {
		this.base = base;
		this.altura = altura;
		this.lado = lado;
	}

	@Override
	public double area() {
		return (base * altura);
	}

	@Override
	public double perimetro() {
		return (2 * (base + lado));
	}

}
