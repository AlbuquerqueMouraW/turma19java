package Exercicios;

import java.util.Scanner;

public class Exercicio4 {

public static void main(String[] args) {
		
		double A, B, C;
		
		Scanner leiaA = new Scanner(System.in);
		
		
		System.out.print("Escreva o primeiro n�mero(intentro): ");
		A = leiaA.nextDouble();
		
		System.out.print("Escreva o segundo n�mero(inteiro): ");
		B = leiaA.nextDouble();
		
		System.out.print("Escreva o terceiro n�mero(inteiro): ");
		C = leiaA.nextDouble();
		
		double R = Math.pow((A + B),2);
		double S = Math.pow((B+C),2);
		double D = R + S /2;

				
				System.out.println("Valor de R � igual a: "+ R);
				System.out.println("Valor de S � igual a: "+ S);
				System.out.print("Valor de D � igual a: "+ D);
				
		
		leiaA.close();
		
				
	}

}
