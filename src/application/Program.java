package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantos números você irá digitar? ");
		int numero = sc.nextInt();
		
		double[] vetor = new double[numero];
		
		for(int i=0; i<vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] += sc.nextDouble();
		}
		
		double soma = 0.0;
		double media = 0.0;
		
		System.out.println("");
		System.out.println("");
		System.out.printf("Valores = ");
		for(int i=0; i<vetor.length; i++) {
				
			System.out.printf("%.2f\t", vetor[i]);	
			soma +=vetor[i];
			
		}
		
		media = soma/vetor.length;
		System.out.println("");
		System.out.printf("Soma = %.2f%n", soma);
		System.out.printf("Média = %.2f%n", media);
		
		sc.close();
	}
}
