package Exercicios;

import java.util.Scanner;

public class udemyExSe3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("digite o 1° número: ");
		int A = scan.nextInt();
		System.out.print("digite o 2° número: ");
		int B = scan.nextInt();
		
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("Os números são multiplos");
		} else {
			System.out.println("Os números não são multiplos");
		}
		
		scan.close();

	}

}
