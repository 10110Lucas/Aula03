package Figuras_Geometricas;
import java.util.ArrayList;
public class Geometria {
	
	private ArrayList<Circulo>   circulo01;
	private ArrayList<Triangulo> triangulo01;
	private ArrayList<Losango>   losango01;
	private ArrayList<Retangulo> retangulo01;
	private ArrayList<Quadrado>  quadrado01;
	private double altura;
	private double base;
	
	public Geometria() {
		circulo01  = new ArrayList<Circulo>();
		triangulo01= new ArrayList<Triangulo>();
		losango01  = new ArrayList<Losango>();
		retangulo01= new ArrayList<Retangulo>();
		quadrado01 = new ArrayList<Quadrado>();
	}
	public void inserir() {
		double raio;
		raio = 6;
		
		altura = 36;
		base = 36;
		
		Circulo circulo = new Circulo(raio);
		Triangulo triangulo = new Triangulo(altura, base);
		Losango losango = new Losango(altura, base);
		Retangulo retangulo = new Retangulo(altura, base);
		Quadrado quadrado = new Quadrado(altura, base);

		circulo01.add(circulo);
		triangulo01.add(triangulo);
		losango01.add(losango);
		retangulo01.add(retangulo);
		quadrado01.add(quadrado);
	}
	public void listar() {
		for(Circulo cl:circulo01){
	         System.out.println(cl);
	    }
		for(Triangulo tr:triangulo01) {
			System.out.println(tr);
		}
		for(Losango lo: losango01) {
			System.out.println(lo);
		}
		for(Retangulo re:retangulo01) {
			System.out.println(re);
		}
		for(Quadrado qr:quadrado01) {
			System.out.println(qr);
		}
	}
}