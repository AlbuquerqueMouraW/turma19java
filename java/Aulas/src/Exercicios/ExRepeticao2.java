package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExRepeticao2 {
	/*
	 * 2 - Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
	 */

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numeros;
		int par = 0;
		int impar = 0;
		
		for(int x=0; x<10; x++) {
			System.out.print(x+1 + "- Digite um número: ");
			numeros = sc.nextInt();
			
			if (numeros % 2 == 0) {
				 par++;
			} else if (numeros % 2 == 1) {
				impar++;
			}
		}
		System.out.println();
		System.out.printf("Quantidade de números pares é = %d",par,"\n");
		System.out.printf("\nQuantidade de números impares é = %d",impar);
		
		
	sc.close();
	
	}

}
