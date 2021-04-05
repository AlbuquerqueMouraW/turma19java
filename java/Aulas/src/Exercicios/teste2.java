package Exercicios;

import java.util.Scanner;

public class teste2 {

		public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			
			int num1, num2;
			int valores[] = new int[2];
			
			System.out.print("Digite o primeiro valor: ");
			valores[0] = leia.nextInt();
			
			System.out.print("Digite o segundo valor: ");
			valores[1] = leia.nextInt();

			num1 = valores[1]; 
			num2 = valores[0];
			
			System.out.printf("1° valor invetido %d\n2° valor invertido %d", num1, num2);
		}

	}

