package Exercicios;

import java.util.Scanner;

/*
 * Fazer um programa para ler um n�mero inteiro, e depois dizer se este 
 * n�mero � negativo ou n�o.
 */

public class udemyExSe2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um n�mero: ");
		numero = sc.nextInt();
		
		if (numero == 0) {
			System.out.println("O n�mero zero � neutro");
		} else if (numero < 0) {
			System.out.println("O n�mero � negativo");
		} else if (numero > 0) {
			System.out.println("O n�mero � positivo");
		}

		sc.close();
	}

}
