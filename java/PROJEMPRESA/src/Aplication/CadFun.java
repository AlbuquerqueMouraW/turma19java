package Aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Funcionario;
import Entities.Terceiro;

public class CadFun {

public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> lista = new ArrayList<>();
		
		System.out.println("Cadasrtro de funcionarios - Pagamentos");
		System.out.println("Quantos funcionarios serão cadastrados: ");
		
		int qtde = sc.nextInt();
		
		for(int x=1; x<=qtde;x++) {
			System.out.printf("Funcionario %d\n,",x);
			System.out.println("Digite 1 - Funcionario ou 2 - Terceiro: ");
			char tipo = sc.next().charAt(0);
			System.out.println("digite a matricula: ");
			String matricula = sc.next();
			System.out.println("Digite o nome: ");
			String nome = sc.next();
			System.out.println("Digite as horas trabalhadas: ");
			int horasTrabalhadas = sc.nextInt();
			System.out.println("Digite o valor por hora: R$");
			double adicional = sc.nextDouble();
			if (tipo =='2') {
				System.out.println("Digite o valor do adicional: R$");
				double adicional1   = sc.nextDouble();
				lista.add(new Terceiro (matricula, nome, horasTrabalhadas, valorHoras, adicional));
				
			} else {
				lista.add(new Funcionario (matricula,nome,horasTrabalhadas, valorHoras));
				
			}
			
			
		}
		System.out.println();
		System.out.println("Folha de pagamento");
		for (Funcionario func: lista) {
			System.out.println(func.getNome()+" salario R$: "+func.valorSalario());
		}
		System.out.println();
		
	}

}

	}

}
