//2
programa
{
/*Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.*/

	inteiro ano,mes,dias
	
	
	funcao inicio()
	{

		escreva("Digite quantos dias você viveu até hoje: ")
		leia(dias)
		
		ano = dias/365
		
		mes = (dias%365)/30

		dias = (dias%365)%30

		escreva("Anos(s): ", ano)
		escreva("\nMes(es): ", mes)
		escreva("\nDia(s): ", dias)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 4; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */