programa
{
/*
 * Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade 
 * e o escreva em seguida. Encontre após a maior pontuação e a apresente. 
 */
	
	funcao inicio()
	{
		inteiro pontuacao[5], x
		inteiro maiorPontuacao = 0

		para (x=0; x<5; x++){
			escreva("Digite a pontuação ",x+1,": ")
			leia(pontuacao[x])
		}para (x=0; x<5; x++){
			se(maiorPontuacao < pontuacao[x]){
				maiorPontuacao = pontuacao[x]
			}
			
			escreva("Pontuação",x+1,"= ",pontuacao[x],"\t")
		//	escreva(pontuacao[x])
		}
		escreva("\n\nA maior pontuação é: ", maiorPontuacao)		
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 478; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */