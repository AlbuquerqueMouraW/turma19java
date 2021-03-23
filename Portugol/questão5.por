//5
programa
{
/*Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente.*/

    real  prova1, prova2, prova3, nota1, nota2, nota3, media
        
    funcao inicio()
    {
    	
	escreva("Qual sua nota 1? ")
    	leia(nota1)

    	escreva("Qual sua nota 2? ")
    	leia(nota2)

    	escreva("Qual sua nota 3? ")
    	leia(nota3)
    	
	prova1 = 2.0
    	prova2 = 3.0
    	prova3 = 5.0
      
    
    media = (((prova1*nota1)+(prova2*nota2)+(prova3*nota3))/(prova1+prova2+prova3))
    escreva("Sua média ponderada é: ",media)


    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 15; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */