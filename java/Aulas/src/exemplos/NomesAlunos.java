package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class NomesAlunos {

	public static void main(String[] args) {
	
		//4 pessoas - nome
		//4 nota [inteiro entre 1-10]
		//saida nome - nota
		//até <=5 - ainda não
		//acima de >= 5 - muito bem
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nomes[] = new String[4]; // ex: nomes[0], nomes[1], nomes[2]
		int notas[] = new int[4];
		
		
		for(int x=0; x<4; x++) {
			
		System.out.print("Digite o nome do aluno: ");
		nomes[x]=sc.nextLine();
		System.out.print("Digite a nota do aluno: ");
		notas[x] = sc.nextInt();
		
		if (notas[x]<=5) {
			System.out.println("Ainda não");
		} else if (notas[x]>5) {
			System.out.println("Muito bem!");
		}
		System.out.println();
	}		
		
		
		
		
	
		
		
		
		
		
		sc.close();
	}

}
