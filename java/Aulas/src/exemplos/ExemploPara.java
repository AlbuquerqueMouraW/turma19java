package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ExemploPara {

	public static void main(String[] args) {
	/*
	 * PARA
1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o sal�rio e n�mero de filhos. A prefeitura deseja saber:   
a) m�dia do sal�rio da popula��o; 
b) m�dia do n�mero de filhos; 
c) maior sal�rio; 
d) percentual de pessoas com sal�rio at� R$100,00.
	
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
			System.out.print(x +" - informe seu sal�rio: R$ ");
			salario = scan.nextDouble();
			System.out.print("Informe o n�mero de filhos: ");
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
		
		
		//dentro do la�o	
		}
		//fora do la�o
			
		mediaSalario = totalSalario / HABITANTES ;
		mediaFilhos = totalFilhos / HABITANTES ;	
		percentualPessoasSalario = (contadorPessoasSalario100 / HABITANTES)*100 ;
		
	//SAIDAS
		System.out.printf("\nTotal dos salarios R$ %.2f", totalSalario);
		System.out.printf("\nM�dia salario: R$ %.2f", mediaSalario);
		//FIM
	}

}
