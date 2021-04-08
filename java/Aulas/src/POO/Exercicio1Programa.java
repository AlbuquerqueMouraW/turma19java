package POO;

import java.util.Scanner;

public class Exercicio1Programa {

	public static void main(String[] args) {
		
		Exercicio1classe cliente1 = new Exercicio1classe();
		Exercicio1classe cliente2 = new Exercicio1classe();
				
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu primeiro nome: ");
		cliente1.nome= sc.next();
		System.out.print("Digite seu CPF: ");
		cliente1.cpf= sc.next();
		System.out.print("Digite seu Ano de nascimento: ");
		cliente1.anoNascimento= sc.nextInt();
		
		
		System.out.print("\nDigite seu primeiro nome: ");
		cliente2.nome= sc.next();
		System.out.print("Digite seu CPF: ");
		cliente2.cpf= sc.next();
		System.out.print("Digite seu Ano de nascimento: ");
		cliente2.anoNascimento= sc.nextInt();
		
		System.out.printf("\nClinte 1) nome: %s\tCPF: %s\nIdade: %d anos",cliente1.nome,cliente1.cpf,cliente1.calculoIdade(2021));
		
		System.out.printf("\n\nClinte 2) nome: %s\tCPF: %s\nIdade: %d anos",cliente2.nome,cliente2.cpf,cliente2.calculoIdade(2021));
		
	}

}
