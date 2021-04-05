package Exercicios;

import java.util.Scanner;

/*
 * 4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado. 
 */

public class LacodeDecisaoEx4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numero = leia.nextInt();
		
		if (numero == 0) {
			System.out.println("O número zero é neutro.");
		} else if (numero % 2 == 0) {
			System.out.println("\nO numero digitado foi "+numero+". Esse número é par\nSua raiz quadrada é: ");
			numero = (int) Math.sqrt(numero);
			System.out.print(numero);
		} else {
			System.out.println("\nO numero digitado foi "+numero+". Esse número é impar\n"+ numero+" elevado ao quadrado é: ");
			numero = numero*numero;
			System.out.print(numero);
		}
		
				
		leia.close();
		
	}

}
