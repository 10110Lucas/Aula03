package Figuras_Geometricas;

public abstract class Poligono extends Figura{
	private double base;
	private double altura;
	public Poligono(double altura, double base){
		super();
	    this.altura = altura;
	    this.base = base;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}	
}
