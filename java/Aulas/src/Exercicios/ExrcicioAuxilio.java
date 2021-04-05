package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExrcicioAuxilio {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		char simNao1;
		int numeroFilhos;
		

		System.out.println("Você é beneficiario do bolsa família?\n (S)Sim (N)Não\n Resposta: ");
		simNao1 = leia.next().toUpperCase().charAt(0);
		if (simNao1 == 'N') {
			System.out.println("Você foi beneficiario do ultimo auxilio emergencial?\n (S)Sim (N)Não\nResposta: ");
			simNao1 = leia.next().toUpperCase().charAt(0);
			if (simNao1 == 'N') {
				System.out.println("Você não tem direito ao auxilio emergencial!");
			} else if (simNao1 == 'S') {
				System.out.println("Você é chefa(e) de família?\n (S)Sim (N)Não\nResposta: ");
				simNao1 = leia.next().toUpperCase().charAt(0);
			}
			if (simNao1 == 'S') {
				System.out.println("Você tem direito a R$600");
			} else if (simNao1 =='N') {
				System.out.println("Você tem direito a R$300");
			}

		} else if (simNao1 == 'S') {
			System.out.println("Você não tem direito ao auxilio.");
		}

		leia.close();
	}

}
