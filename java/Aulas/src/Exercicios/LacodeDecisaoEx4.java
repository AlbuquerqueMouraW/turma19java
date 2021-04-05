package Exercicios;

import java.util.Scanner;

/*
 * 4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado. 
 */

public class LacodeDecisaoEx4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		int numero = leia.nextInt();
		
		if (numero == 0) {
			System.out.println("O n�mero zero � neutro.");
		} else if (numero % 2 == 0) {
			System.out.println("\nO numero digitado foi "+numero+". Esse n�mero � par\nSua raiz quadrada �: ");
			numero = (int) Math.sqrt(numero);
			System.out.print(numero);
		} else {
			System.out.println("\nO numero digitado foi "+numero+". Esse n�mero � impar\n"+ numero+" elevado ao quadrado �: ");
			numero = numero*numero;
			System.out.print(numero);
		}
		
				
		leia.close();
		
	}

}
