package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExRepeticao2 {
	/*
	 * 2 - Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
	 */

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numeros;
		int par = 0;
		int impar = 0;
		
		for(int x=0; x<10; x++) {
			System.out.print(x+1 + "- Digite um n�mero: ");
			numeros = sc.nextInt();
			
			if (numeros % 2 == 0) {
				 par++;
			} else if (numeros % 2 == 1) {
				impar++;
			}
		}
		System.out.println();
		System.out.printf("Quantidade de n�meros pares � = %d",par,"\n");
		System.out.printf("\nQuantidade de n�meros impares � = %d",impar);
		
		
	sc.close();
	
	}

}
