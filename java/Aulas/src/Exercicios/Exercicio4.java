package Exercicios;

import java.util.Scanner;

public class Exercicio4 {

public static void main(String[] args) {
		
		double A, B, C;
		
		Scanner leiaA = new Scanner(System.in);
		
		
		System.out.print("Escreva o primeiro número(intentro): ");
		A = leiaA.nextDouble();
		
		System.out.print("Escreva o segundo número(inteiro): ");
		B = leiaA.nextDouble();
		
		System.out.print("Escreva o terceiro número(inteiro): ");
		C = leiaA.nextDouble();
		
		double R = Math.pow((A + B),2);
		double S = Math.pow((B+C),2);
		double D = R + S /2;

				
				System.out.println("Valor de R é igual a: "+ R);
				System.out.println("Valor de S é igual a: "+ S);
				System.out.print("Valor de D é igual a: "+ D);
				
		
		leiaA.close();
		
				
	}

}
