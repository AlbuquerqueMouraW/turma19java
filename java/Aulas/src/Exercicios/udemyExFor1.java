package Exercicios;

import java.util.Scanner;

public class udemyExFor1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um numero: ");
		int x = sc.nextInt();
		System.out.println("\n-------------------\n");
		
		for (int i=1; i<=x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}
}
