package Exercicios;

import java.util.Scanner;

public class udemyExEs1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
			
		System.out.println("Vamos somar!\n");
		System.out.print("Digite o 1° número: ");
		int A = scan.nextInt();
		System.out.println("+");
		System.out.print("Digite o 2° número: ");
		int B = scan.nextInt();
		int soma = A+B;
		
		System.out.println("\nResultado: \n"+A+" + "+B+" = "+soma);
		
		scan.close();
	}

}
