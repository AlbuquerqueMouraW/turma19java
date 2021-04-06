package Exercicios;

import java.util.Scanner;

public class ExRepeticao3 {
	
	/*
	 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
	21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
	idade for =-99.
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idade = 0;
		int menos21 = 0;
		int mais50 = 0;
				
		while (idade != -99) {
			System.out.print("Digite sua idade: ");
			idade = sc.nextInt();
			if (idade < 21) {
				menos21++;
			} else if (idade > 50) {
				mais50++;
		}
	}
		
	System.out.println();
	System.out.printf("\nTotal de pessoas com menos de 21 anos é = %d",menos21);
	System.out.printf("\nTotal de pessoas com mais de 50 anos é = %d",mais50);
		

	sc.close();
	}

}
