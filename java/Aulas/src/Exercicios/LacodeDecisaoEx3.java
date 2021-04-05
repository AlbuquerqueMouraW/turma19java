package Exercicios;

import java.util.Scanner;

/*
 * 3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
x 10-14 infantil
x 15-17 juvenil
x 18-25 adulto
 */

public class LacodeDecisaoEx3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade;
		
		System.out.print("Digite se nome: ");
		nome = leia.next();
		
		System.out.print("Olá "+nome+" quantos anos você tem? ");
		idade = leia.nextInt();
		
		if (idade < 10 || idade > 25) {
			System.out.println("Não existe uma categoria para sua idade.");
		} else if (idade < 15) {
			System.out.println("Sua categoria é a INFANTIL");
		} else if (idade < 18) {
			System.out.println("Sua categoria é a JUVENIL");
		} else if (idade <= 25) {
			System.out.println("Sua categoria é ADULTO");
		} 
		
				
		leia.close();
	}

}
