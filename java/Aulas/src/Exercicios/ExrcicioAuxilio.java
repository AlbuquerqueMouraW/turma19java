package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExrcicioAuxilio {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		char simNao1;
		int numeroFilhos;
		

		System.out.println("Voc� � beneficiario do bolsa fam�lia?\n (S)Sim (N)N�o\n Resposta: ");
		simNao1 = leia.next().toUpperCase().charAt(0);
		if (simNao1 == 'N') {
			System.out.println("Voc� foi beneficiario do ultimo auxilio emergencial?\n (S)Sim (N)N�o\nResposta: ");
			simNao1 = leia.next().toUpperCase().charAt(0);
			if (simNao1 == 'N') {
				System.out.println("Voc� n�o tem direito ao auxilio emergencial!");
			} else if (simNao1 == 'S') {
				System.out.println("Voc� � chefa(e) de fam�lia?\n (S)Sim (N)N�o\nResposta: ");
				simNao1 = leia.next().toUpperCase().charAt(0);
			}
			if (simNao1 == 'S') {
				System.out.println("Voc� tem direito a R$600");
			} else if (simNao1 =='N') {
				System.out.println("Voc� tem direito a R$300");
			}

		} else if (simNao1 == 'S') {
			System.out.println("Voc� n�o tem direito ao auxilio.");
		}

		leia.close();
	}

}
