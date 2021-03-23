programa
{
	cadeia nome
	inteiro dataNascimento 
	inteiro anoAtual
	
	funcao inicio()
{
		
		escreva("Digite seu nome:  ")
		leia(nome)
		escreva("\n","Seja bem vindo, ", nome)
		escreva("\n","Digite seu ano de nacimento: ")
		leia(dataNascimento)
		escreva("\n","Digite o ano atual: ")
		leia (anoAtual)
		escreva("\n","Sua idade aproximada é : ", (anoAtual - dataNascimento), " anos de idade.")
	}
} 
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 409; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */