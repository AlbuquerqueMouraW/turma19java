package Exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		/*Faça um sistema que leia o tempo de duração de um evento em uma fábrica
		expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/
		
		Scanner leiaSegundos = new Scanner(System.in);
		//variaveis
		double horas,minutos,segundos;
		
		System.out.print("Digite a duração do Evento em segundos: ");
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
