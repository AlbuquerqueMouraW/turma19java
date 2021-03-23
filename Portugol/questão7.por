//7
programa
{
/*Um sistema de equações lineares do tipo: 
, pode ser resolvido segundo mostrado abaixo : 
 
Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y. 
*/
	real A,B,C,D,Ew,F,x,y
	
	funcao inicio()
	{
		escreva("Digite o valor de A: ")
		leia(A)
		escreva("Digite o valor de B: ")
		leia(B)
		escreva("Digite o valor de C: ")
		leia(C)
		escreva("Digite o valor de D: ")
		leia(D)
		escreva("Digite o valor de Ew: ")
		leia(Ew)
		escreva("Digite o valor de F: ")
		leia(F)

		x=((C*Ew)-(B*Ew))/((A*Ew)-(B*D))
		y=((A*F)-(C*D))/((A*Ew)-(B*D))
		escreva("O valor de x é igual a ",x, "\nO valor de y é igual a ",y)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 208; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */