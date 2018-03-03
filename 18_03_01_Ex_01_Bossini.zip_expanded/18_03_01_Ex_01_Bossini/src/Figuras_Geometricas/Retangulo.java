package Figuras_Geometricas;

public class Retangulo extends Poligono{

	public Retangulo(double altura, double base) {
		super(altura, base);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		return getBase() * getAltura();
	}
	
}
