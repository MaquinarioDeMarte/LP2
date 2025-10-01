package figurasGeometricasPlanas;

public class Losango implements Figura {
	
	private double diagMaior;
	private double diagMenor;
	private double lado;
	
	public Losango(double diagMaior, double diagMenor, double lado) {
		this.diagMaior = diagMaior;
		this.diagMenor = diagMenor;
		this.lado = lado;
		
	}

	@Override
	public double area() {
		return ((diagMaior * diagMenor) / 2);
	}

	@Override
	public double perimetro() {
		return (4 * lado);
	}

}
