programa
{
/*1) João, homem de bem, comprou um microcomputador para controlar o rendimento diário 
 *  de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo 
 *  regulamento do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo 
 *  excedente. João precisa que você faça um sistema que leia a variável P (peso de tomates) 
 *  e verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o 
 *  valor da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o 
 *  conteúdo ZERO.*/

    funcao inicio()
    {
    real P
    real E
    real Zero = 0.0
    real M

    escreva("Olá. Digite a quantidade de tomate em kilos(kg) ")
    leia (P)

    se(P <= 50 ){
        escreva("Peso está dentro do limite!\n")
        escreva("A multa será de R$",Zero) 

    }se(P >50){
	   Zero = 4.0
	   E = P - 50
        M = E * Zero
		 
        	escreva("O peso excedeu o limite em ",E,"Kg\n")
		escreva("A multa é de R$ ", M)
    	}


    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1025; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */