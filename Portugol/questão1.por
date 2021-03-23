//1
programa
{
/*Faça um sistema que leia a idade de uma pessoa expressa em anos, 
meses e dias e mostre-a expressa apenas em dias.*/

		inteiro idade, mes, dia
		inteiro diasVida
		
		funcao inicio()
	{
		escreva("digite sua idade: ")
		leia(idade)
		
		escreva("quantos meses se passaram a partir da data de seu aniversário?: ")
		leia(mes)
		
		escreva("que dia(númerico) do mes é hoje?: ")
		leia(dia)

		diasVida=((idade*365)+(mes*30) + dia)
		escreva("\nvoce tem ", diasVida," dias de vida")
	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 154; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */