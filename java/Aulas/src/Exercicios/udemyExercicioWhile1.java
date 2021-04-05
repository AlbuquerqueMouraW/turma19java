package Exercicios;

import java.util.Scanner;

public class udemyExercicioWhile1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite sua senha: ");
		int senha = sc.nextInt();
		
		
		while (senha != 2002) {
			System.out.println("Senha invalida. Tente novamente, tentativa");
			System.out.print("Digite sua senha: ");
			senha = sc.nextInt();	
		}  
				
		System.out.println("Acesso Permitido");
		
		sc.close();
	}
}
