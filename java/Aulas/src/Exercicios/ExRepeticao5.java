package Exercicios;

import java.util.Scanner;

public class ExRepeticao5 {
/*
 * 5- Crie um programa que leia um n�mero do teclado at� que encontre um
	n�mero igual a zero. No final, mostre a soma dos n�meros
	digitados.(DO...WHILE)
 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = 0;
		int somaNumero = 0;
		
		do {
			System.out.print("Digite um n�mero: ");
			numero = sc.nextInt();
			somaNumero += numero ;
		} while (numero != 0);
		
		
		System.out.println();
		System.out.printf("A soma dos n�meros � igual a %d",somaNumero);
		
		
		sc.close();
	}

}
