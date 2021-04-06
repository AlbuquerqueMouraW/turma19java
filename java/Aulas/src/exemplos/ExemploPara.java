package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ExemploPara {

	public static void main(String[] args) {
	/*
	 * PARA
1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
a) média do salário da população; 
b) média do número de filhos; 
c) maior salário; 
d) percentual de pessoas com salário até R$100,00.
	
	 */
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
	
	//VARIAVEIS	
		final double HABITANTES = 20;
		double salario = 0.00;
		double mediaSalario = 0.00;
		double totalSalario = 0.00;
		double quantFilhos = 0;
		double mediaFilhos = 0.00;
		double totalFilhos = 0.00;
		double maiorSalario = 0.00;
		double percentualPessoasSalario = 0.00;
		double contadorPessoasSalario100 = 0.00;
		
		
		for (int x=1; x<=HABITANTES; x++) {
	//ENTRADAS
			System.out.print(x +" - informe seu salário: R$ ");
			salario = scan.nextDouble();
			System.out.print("Informe o número de filhos: ");
			quantFilhos = scan.nextDouble();
			System.out.println();
		
	//PROCESSAMENTOS	
		totalSalario = totalSalario + salario; //totalizar: totalA = totalA + variavelA
		totalFilhos = totalFilhos + quantFilhos;
		
				
		if (maiorSalario < salario) {
			maiorSalario = salario;
		}
		
		if (salario <= 100) {
			contadorPessoasSalario100++;
		}
		
		
		//dentro do laço	
		}
		//fora do laço
			
		mediaSalario = totalSalario / HABITANTES ;
		mediaFilhos = totalFilhos / HABITANTES ;	
		percentualPessoasSalario = (contadorPessoasSalario100 / HABITANTES)*100 ;
		
	//SAIDAS
		System.out.printf("\nTotal dos salarios R$ %.2f", totalSalario);
		System.out.printf("\nMédia salario: R$ %.2f", mediaSalario);
		//FIM
	}

}
