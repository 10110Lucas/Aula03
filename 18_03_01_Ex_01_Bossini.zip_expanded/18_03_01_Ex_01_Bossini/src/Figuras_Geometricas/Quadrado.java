package Figuras_Geometricas;

public class Quadrado extends Poligono{

	public Quadrado(double altura, double base) {
		super(altura, base);
	}

	@Override
	public double area() {
		return Math.pow(getAltura(), 2);
	}
	
}
