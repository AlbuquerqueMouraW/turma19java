package Exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		/*Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
		expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/
		
		Scanner leiaSegundos = new Scanner(System.in);
		//variaveis
		double horas,minutos,segundos;
		
		System.out.print("Digite a dura��o do Evento em segundos: ");
		segundos = leiaSegundos.nextDouble();
		
		horas = segundos/3600;
		minutos = (segundos%3600)/60;
		segundos = (segundos%3600)%60;
		
		System.out.println("Hora(s): "+horas);
		System.out.println("Minuto(s): "+minutos);
		System.out.println("Segundo(s): "+segundos);
		
		
leiaSegundos.close();
		
	}

}
