package Exercicios;

import java.util.Scanner;

/*
 * Fazer um programa para ler um número inteiro e dizer se este número 
 * é par ou ímpar..
 */

public class udemyExSe1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.print("Digite um número: ");
		numero = sc.nextInt();
		
		if (numero == 0) {
			System.out.print("Número zero é neutro.");
		} else if (numero < 0) {
			System.out.print("Número negativo.");
		} else if(numero % 2 == 0) {
			System.out.print("Número par");
		} else {
			System.out.print("Número impar");
		}

		
		sc.close();
		
		
	}

}
