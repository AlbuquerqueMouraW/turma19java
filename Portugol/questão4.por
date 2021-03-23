//4
programa
{
/*Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
calcule a seguinte expressão:

*/
     inclua biblioteca Matematica 

	real A,B,C

    	
    funcao inicio()
    {

    escreva("Escreva o primeiro número(inteiro): ")
    leia(A)
    
    escreva("\nEscreva o segundo número(inteiro): ")
    leia(B)
    
    escreva("\nEscreva o terceiro número(inteiro): ")
    leia(C)

	real R = Matematica.potencia ((A + B), 2.0)
    	real S = Matematica.potencia ((B + C), 2.0)
    	real D = R + S / 2
    
    escreva ("\nO resultado da expressão é: ", D)

      }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 172; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */