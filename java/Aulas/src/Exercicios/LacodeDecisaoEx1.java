package Exercicios;


import java.util.Scanner;

/*
 * 1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
 */

public class LacodeDecisaoEx1 {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		int n1 = leia.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		int n2 = leia.nextInt();
		System.out.print("Digite o terceiro n�mero: ");
		int n3 = leia.nextInt();
		
		if (n1 > n2 && n1 > n3) {
			System.out.println("\nO maior n�mero � o "+n1);
		} else if (n2 > n3) {
			System.out.println("\nO maior n�mero � o "+n2);
		} else {
			System.out.println("\nO maior n�mero � o "+n3);
		}
				
		
		leia.close();
	}

}
