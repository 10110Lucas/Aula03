package Figuras_Geometricas;
import java.util.Scanner;
public class Aplicativo_Figuras_Geometricas {
	private static Scanner nova;
	public static void main(String[] args) {
		Geometria geometria = new Geometria();
		nova = new Scanner(System.in);
		try {
		int msg;
		do {
			System.out.println(
					"Digite o numero da Opção\n\n"+
					"1.Adicionar.\n"+
					"2.Listar.\n"+
					"3.Sair.");
			   msg = nova.nextInt();
			   if(msg == 1){
		            geometria.inserir();
		       }
			   else if(msg == 2) {
				   geometria.listar();
			   }
		}while(msg != 3);
		}catch(Exception e) {
			System.out.print("Ops deu erro!");
		}
	}
}
