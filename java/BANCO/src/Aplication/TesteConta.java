package Aplication;

import java.util.Locale;
import java.util.Scanner;

import Entity.Conta;

public class TesteConta {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta contajoao = new Conta();
		
		System.out.println("Digite o numero da conta: ");
		contajoao.numero = sc.nextInt();
		System.out.println("Digite o cpf da conta: ");
		contajoao.cpf = sc.next();
		System.out.println("Operação de 1- credito ou 2-debito ?");
		char opcao = sc.next().charAt(0);
		if (opcao == '1') {
			contajoao.credito(opcao);
			
		} else if (opcao == '2') {
			contajoao.debito(opcao);
		}
		
		
		System.out.printf("CPF: %s \n",contajoao.cpf);
		System.out.printf("Numero conta %d : \n", contajoao.saldo);
		System.out.printf("Saldo : %.2f \n",contajoao.saldo);
		
		
		
		
	}

}
