package Exercicios;

import java.util.Scanner;

public class ExRepeticao6 {
	/*
	 * Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
	final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
	0(zero).(DO...WHILE)
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double numero = 0;
		double multiplos3 = 0;
		double mediaMultiplos3 = 0;
		double contador = 0;
		
		
		
		do {
				contador++;
			System.out.print("Digite um n�mero: ");
			numero = sc.nextDouble();
			if (numero % 3 == 0) {
				multiplos3 += numero;
				
		} 
			} while(numero != 0);
								
			mediaMultiplos3 = multiplos3 / (contador -1);
			
			System.out.println();
			System.out.printf("A soma dos n�meros impares e multiplos de 3 � igual a: %.1f\nA m�dia de n�meros impares e multiplos de de 3 �: %.2f",multiplos3,mediaMultiplos3);
		
	
		sc.close();
	}

}
