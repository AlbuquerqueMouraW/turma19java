package Exercicios;

import java.util.Scanner;

/*
 * Fazer um programa para ler um n�mero inteiro e dizer se este n�mero 
 * � par ou �mpar..
 */

public class udemyExSe1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.print("Digite um n�mero: ");
		numero = sc.nextInt();
		
		if (numero == 0) {
			System.out.print("N�mero zero � neutro.");
		} else if (numero < 0) {
			System.out.print("N�mero negativo.");
		} else if(numero % 2 == 0) {
			System.out.print("N�mero par");
		} else {
			System.out.print("N�mero impar");
		}

		
		sc.close();
		
		
	}

}
