programa {

inclua biblioteca Matematica
	
	funcao inicio () {
		
	cadeia nome
	real grauF
	real grauC
	
	escreva("Digite o seu nome: ")
	leia(nome)
	escreva("Insira a temperatura em Fahrenheit aqui: ")
	leia(grauF)

	grauC = (grauF-32)/1.8

	escreva("Olá, ",nome, " a temperatura em °F é : ", Matematica.arredondar(grauC, 2)," ºC")

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 336; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */