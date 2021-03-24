programa
{
/*
 * Crie um programa que receba valores do usuário para preencher uma matriz 3X3, 
 * e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal, 
 * ou seja, diagonal principal.
 */
	
	funcao inicio()
	{	
		inteiro diagonalP =0
		inteiro matriz[3][3] //= {{x,x,x},
						//	 {x,x,x},
					    //     {x,x,x}}
			    
		para(inteiro l=0; l<3; l++){
			para(inteiro c=0; c<3; c++){
					
			escreva("Digite o valor da linha",l," coluna ",c," :")
			leia(matriz[l][c])
			se (l==c){
				diagonalP = diagonalP + matriz[l][c]
			}
			
		}
	
	}	
			escreva("\nForma de matriz\n")
			para(inteiro l=0; l<3; l++){
				para(inteiro c=0; c<3; c++){
					escreva(matriz[l][c],",")
				}
			escreva("\n")
			}
		escreva("Valor da Diagonal principal é igual a: ",diagonalP)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 586; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */