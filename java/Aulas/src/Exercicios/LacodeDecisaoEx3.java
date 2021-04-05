package Exercicios;

import java.util.Scanner;

/*
 * 3- Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual
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
		
		System.out.print("Ol� "+nome+" quantos anos voc� tem? ");
		idade = leia.nextInt();
		
		if (idade < 10 || idade > 25) {
			System.out.println("N�o existe uma categoria para sua idade.");
		} else if (idade < 15) {
			System.out.println("Sua categoria � a INFANTIL");
		} else if (idade < 18) {
			System.out.println("Sua categoria � a JUVENIL");
		} else if (idade <= 25) {
			System.out.println("Sua categoria � ADULTO");
		} 
		
				
		leia.close();
	}

}
