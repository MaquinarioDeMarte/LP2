package figurasGeometricasPlanas;

public class Retangulo implements Figura {
	
	private double base;
	private double altura;
	
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double area() {
		return (base * altura);
	}

	@Override
	public double perimetro() {
		return (2 * (base * altura));
	}

}
