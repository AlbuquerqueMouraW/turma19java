programa
{
	
	funcao inicio()
	{
		cadeia senha = "123"
		inteiro contador = 1
		const inteiro LIMITESENHA = 3

	
		escreva("Digite sua senha: ")
		leia (senha)

		enquanto (senha!="123"){

		escreva ("Senha incorreta, tente novamente - tentativa",contador,":")
		leia(senha)
		
			se (contador > LIMITESENHA) {

				escreva("Vc não acertou a senha tente mais tarde!")
				pare
		}
		contador++
			
		}

		escreva("Programa finalizado")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 442; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */