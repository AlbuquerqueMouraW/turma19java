//8
programa
{
/*O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor.*/

	real distribuidor
	real imposto 
	real custoFabrica
	real custoConsumidor
	
	funcao inicio()
	{
		escreva("Qual o custo de fabrica do carro? R$ ")
		leia (custoFabrica)
		
		distribuidor = (custoFabrica * 0.28)
		imposto = (custoFabrica * 0.45)
		custoConsumidor = (custoFabrica+distribuidor+imposto)

		escreva("\nO custo para o consumidor do carro é: R$ ", custoConsumidor)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 721; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */