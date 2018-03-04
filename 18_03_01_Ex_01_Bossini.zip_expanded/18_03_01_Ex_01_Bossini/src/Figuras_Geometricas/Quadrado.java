package Figuras_Geometricas;
public class Quadrado extends Poligono{
	private double diagonal;
	public Quadrado(double altura, double base) {
		super(altura, base);
	}
	public double getDiagonal() {
		return diagonal;
	}
	public void setDiagonal(double diagonal) {
		this.diagonal = diagonal;
	}
	@Override
	public double getAltura() {
		return super.getAltura();
	}
	@Override
	public double getBase() {
		return super.getBase();
	}
	@Override
	public void setAltura(double altura) {
		super.setAltura(altura);
	}
	@Override
	public void setBase(double base) {
		super.setBase(base);
	}
	@Override
	public double area() {
		return Math.pow(getAltura(), 2);
	}
	private double diagonal() {
		double calc = Math.pow(getBase(), 2) + Math.pow(getAltura(), 2);
		return Math.pow(calc, 0.5);
	}
	@Override
	public String toString() {
		return "-----Quadrado-----\n"+
		        "[ Altura: "+ getAltura() +
		        " ]\n[ Base: "+ getBase() +
		        " ]\n[ Diagonal: "+ diagonal() +
		        " ]\n[ Area: "+ area()+" ]";
	}
}
