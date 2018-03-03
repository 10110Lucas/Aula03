package Exercicios;
import java.io.*;
import java.util.Scanner;
@SuppressWarnings("unused")
public class Ex13_Vetor_50_Media_Menores_Da_Media{
	public static void main(String[] args){
		try {
			int [] vetor = new int[5];
			double total = 0, add = 0, soma = 0;
			for(int i = 0; i <= vetor.length-1; i++){
				add++;
				System.out.print(i+".Digite um numero: ");
				vetor[i] = new Scanner(System.in).nextInt();
				total += vetor[i];
			}
			for(int j = 0; j <= vetor.length-1; j++){
				System.out.println(j+".Numeros digitados: "+vetor[j]);
			}
			soma = add;
			double media;
			media = total / soma;
			System.out.println("\nMedia: "+media);
			for(int a = 0; a <= vetor.length-1; a++) {
				if(media > vetor[a]) {
					System.out.println("Valores abaixo da media: "+vetor[a]);
				}else if(media < vetor[a]) {
					System.out.println("Valores a cima da media: "+vetor[a]);
				}
			}
			
		} catch (Exception e) {
			System.out.print("Algoritmo errado!");
		}
	}
}
