package Exercicios;

import java.util.Scanner;

public class udemyExSe3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("digite o 1� n�mero: ");
		int A = scan.nextInt();
		System.out.print("digite o 2� n�mero: ");
		int B = scan.nextInt();
		
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("Os n�meros s�o multiplos");
		} else {
			System.out.println("Os n�meros n�o s�o multiplos");
		}
		
		scan.close();

	}

}
