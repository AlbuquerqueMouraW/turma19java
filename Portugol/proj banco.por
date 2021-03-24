programa
{
	inteiro numero
	cadeia cpf
	real saldo
	logico ativo //ativo:Verdadeiro !=:falso
	
	funcao inicio()
	{
		inteiro opcao
		cadeia contaTipo
		
		escreva("Banco EdMais!\n")
		escreva("O banco que desenvolve\n")
		escreva("\n")

		escreva("Escolha uma opção:\n (1) Conta Poupança\t (2) Conta corrente\n (3) Conta Especial\t (4) Conta Empresa\n (5) Conta Estudantil\t (6) Sair\n")
		escreva("\nDigite aqui sua opção: ")
		leia(opcao)
		limpa()

		escolha(opcao){
			caso 1: escreva("Você escolheu Conta poupança")
			contaTipo = " Poupança"
			cabecalho(contaTipo)
			
			pare
			caso 2: escreva("Você escolheu Conta corrente")
			contaTipo = " Corrente"
			cabecalho(contaTipo)
			
			pare
			caso 3: escreva("Você escolheu Conta Especial")
               contaTipo = " Especial"
			cabecalho(contaTipo)
			
			pare
			caso 4: escreva("Você escolheu Conta Empresa")
			contaTipo = " Empresa"
			cabecalho(contaTipo)
			
			pare
			caso 5: escreva("Você escolheu Conta Estudantil")
			contaTipo = " Estudantil"
			cabecalho(contaTipo)
			
			pare
			caso 6: escreva("Você escolheu Sair\n\nVolte sempre!")
			pare
			caso contrario: escreva("Escolha uma opção válida\nTente novamente")
			escreva("\n\n (1) Conta Poupança\t (2) Conta corrente\n (3) Conta Especial\t (4) Conta Empresa\n (5) Conta Estudantil\t (6) Sair\n")
			escreva("\nDigite aqui sua opção: ")
			leia(opcao)
			limpa()
		}

		
	}

	funcao cabecalho(cadeia contaTipo){
		//caracter aux1
		//caracter continuar
		limpa()
		escreva("Banco EdMais!\n")
		escreva("O banco que desenvolve\n")
		escreva("\n")
		escreva("Conta", contaTipo, "\n")
		escreva("\nSaldo Atual: R$ \n") //Acrescentar Saldo
		//escreva("MOVIMENTO -D-débito ou C-Crédito: \n")
		//leia(aux1)
		
		//escreva("Valor movimento: R$ \n")
		//leia()
		//escreva("Continuar S/N: ")
		//leia(continuar)
		//se (continuar == 'S'){
			
		//}senao se (continuar =='N'){
			
		//}
		
		
		
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1471; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */