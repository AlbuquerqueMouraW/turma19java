package Exercicios;
/*O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
consumidor.*/

import java.util.Scanner;

public class Exercicio8 {


	public static void main(String[] args) {
		
		double distribuidor,imposto,custoFabrica,custoConsumidor;
		
		Scanner leiaCustoF = new Scanner(System.in);
		
		System.out.print("Qual o custo de fabrica do Carro? R$");
		custoFabrica = leiaCustoF.nextDouble();
		
		distribuidor = (custoFabrica * 0.28);
		imposto = (custoFabrica * 0.45);
		custoConsumidor = (custoFabrica+distribuidor+imposto);
		
		System.out.println("O custo para o consumidor final � de: R$"+custoConsumidor);
		System.out.println("Valor do imposto: R$"+ imposto);
		
		
		leiaCustoF.close();
		
		
	}

}
