package figurasGeometricasPlanas;

public class Quadrado implements Figura {
	
	private double lado;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public double area() {
		return (lado * lado);
	}

	@Override
	public double perimetro() {
		return (4 * (lado));
	}

}
