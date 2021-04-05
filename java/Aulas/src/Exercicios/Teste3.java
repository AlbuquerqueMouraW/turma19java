package Exercicios;

import java.util.Scanner;

public class Teste3 {


	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero1;
		int numero2;
		
		System.out.println("Digite o primeiro número: ");
		numero1 = leia.nextInt();
		System.out.println("Digite o segundo número: ");
		numero2 = leia.nextInt();
		
		System.out.println("O primeiro número agora é: "+numero2);
		System.out.println("O segundo número agora é: "+numero1);

	}

}

