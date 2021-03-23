programa
{
/*
 * Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.
 */
	
	funcao inicio()
	{
	inteiro n1,n2,n3,n4
	inteiro q1,q2,q3,q4

		escreva("Digite o valor de n1: ")
		leia(n1)
		escreva("Digite o valor de n2: ")
		leia(n2)
		escreva("Digite o valor de n3: ")
		leia(n3)
		escreva("Digite o valor de n4: ")
		leia(n4)

		q1=n1*n1
		q2=n2*n2
		q3=n3*n3
		q4=n4*n4

			se (q3 >=1000){
			escreva("O quadrado do número 3, ",n3," é igual a ", q3)
		}	senao {
			escreva("O quadrado do número 1, ",n1," é igual a ", q1)
			escreva("O quadrado do número 2, ",n2," é igual a ", q2)
			escreva("O quadrado do número 3, ",n3," é igual a ", q3)
			escreva("O quadrado do número 4, ",n4," é igual a ", q4)
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 906; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */