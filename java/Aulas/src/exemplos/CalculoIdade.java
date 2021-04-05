package exemplos;

import java.util.Scanner;

public class CalculoIdade {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); //instaciar - criar
		
		
		int a;
		int b;
		int soma;
		
		System.out.print("Digite o valor 1: ");
		a = leia.nextInt();
		System.out.print("Digite o valor 2: ");
		b = leia.nextInt();
		
		soma = a+b ;
				
		System.out.println("Soma de "+a+" + "+b+" = "+soma);
		
		
	}

}
