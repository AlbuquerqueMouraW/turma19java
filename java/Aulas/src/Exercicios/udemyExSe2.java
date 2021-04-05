package Exercicios;

import java.util.Scanner;

/*
 * Fazer um programa para ler um número inteiro, e depois dizer se este 
 * número é negativo ou não.
 */

public class udemyExSe2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um número: ");
		numero = sc.nextInt();
		
		if (numero == 0) {
			System.out.println("O número zero é neutro");
		} else if (numero < 0) {
			System.out.println("O número é negativo");
		} else if (numero > 0) {
			System.out.println("O número é positivo");
		}

		sc.close();
	}

}
