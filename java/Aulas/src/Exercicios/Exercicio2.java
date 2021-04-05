package Exercicios;

import java.util.Scanner;

/*Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.*/

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		int ano, mes, dias;
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Digite quantos dias você viveu até hoje: ");
		dias = leia.nextInt();
		
		ano = dias/365;
		mes = (dias%365)/30;
		dias = (dias%365)%30;
		
		System.out.println(ano +"ano(s)");
		System.out.println(mes + "mese(s)");
		System.out.println(dias + "dia(s)");
	
	leia.close();
	
	}

}
