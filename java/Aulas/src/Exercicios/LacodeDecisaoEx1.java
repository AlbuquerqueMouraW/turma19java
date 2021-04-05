package Exercicios;


import java.util.Scanner;

/*
 * 1- Faça um programa que receba três inteiros e diga qual deles é o maior.
 */

public class LacodeDecisaoEx1 {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int n1 = leia.nextInt();
		System.out.print("Digite o segundo número: ");
		int n2 = leia.nextInt();
		System.out.print("Digite o terceiro número: ");
		int n3 = leia.nextInt();
		
		if (n1 > n2 && n1 > n3) {
			System.out.println("\nO maior número é o "+n1);
		} else if (n2 > n3) {
			System.out.println("\nO maior número é o "+n2);
		} else {
			System.out.println("\nO maior número é o "+n3);
		}
				
		
		leia.close();
	}

}
