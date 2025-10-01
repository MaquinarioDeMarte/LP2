package figurasGeometricasPlanas;

public class Circulo implements Figura {

	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double area() {
		return (Figura.PI * (raio * raio));
	}

	@Override
	public double perimetro() {
		return (2 * Figura.PI * raio);
	}
}
