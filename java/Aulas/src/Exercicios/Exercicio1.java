package Exercicios;
/*Fa�a um sistema que leia a idade de uma pessoa expressa em anos, 
meses e dias e mostre-a expressa apenas em dias.*/

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int idade, mes, dia, diasVida;
		Scanner leia = new Scanner(System.in);
		
		
				
		System.out.print("Digite sua idade: ");
		idade = leia.nextByte();
		
		System.out.print("Quantos meses se passaram ap�s a data de seu anivers�rio? : ");
		mes = leia.nextByte();
		
		System.out.print("Que dia(n�merico) do m�s � hoje? : ");
		dia = leia.nextByte();
		
		diasVida = ((idade*365)+(mes*30) + dia);
		System.out.println("Voc� tem "+diasVida+" dias de vida.");
			
	leia.close();	
	}

}
