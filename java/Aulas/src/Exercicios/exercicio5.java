package Exercicios;

import java.util.Scanner;

/*Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno. 
Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente.*/

public class exercicio5 {
	
	public static void main(String[] args) {
		
		double prova1, prova2, prova3, nota1, nota2, nota3, media;
		Scanner leiaNota1 = new Scanner(System.in);
				
		
		System.out.print("Digite nota 1: ");
		nota1 = leiaNota1.nextDouble();
		
		System.out.print("Digite a nota 2: ");
		nota2 = leiaNota1.nextDouble();
		
		System.out.print("Digite a nota 3: ");
		nota3 = leiaNota1.nextDouble();
		
		prova1 = 2.0;
		prova2 = 3.0;
		prova3 = 5.0;
		
		media = (((prova1*nota1)+(prova2*nota2)+(prova3*nota3))/(prova1+prova2+prova3));
		System.out.print("Sua m�dia ponderada �: " + media);
		
	leiaNota1.close();
	}

}
