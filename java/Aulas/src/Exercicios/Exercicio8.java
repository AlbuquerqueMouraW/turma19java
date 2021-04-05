package Exercicios;
/*O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
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
		
		System.out.println("O custo para o consumidor final é de: R$"+custoConsumidor);
		System.out.println("Valor do imposto: R$"+ imposto);
		
		
		leiaCustoF.close();
		
		
	}

}
