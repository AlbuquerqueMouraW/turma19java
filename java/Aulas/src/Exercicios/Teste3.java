package Exercicios;

import java.util.Scanner;

public class Teste3 {


	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero1;
		int numero2;
		
		System.out.println("Digite o primeiro n?mero: ");
		numero1 = leia.nextInt();
		System.out.println("Digite o segundo n?mero: ");
		numero2 = leia.nextInt();
		
		System.out.println("O primeiro n?mero agora ?: "+numero2);
		System.out.println("O segundo n?mero agora ?: "+numero1);

	}

}

