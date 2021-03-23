programa
{
/*6) Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes 
 * categorias:
Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
Adultos = Maiores de 18 anos*/

	funcao inicio()
	{
	cadeia nome 
	inteiro idade
	//caracter letra
	
		escreva("Digite seu nome: ")
		leia(nome)
		
		escreva("Olá ",nome,", quantos anos você tem? ")
		leia(idade)
			
			se(idade <=4 ){
				escreva("Não existe uma categoria para sua idade")
				
			}senao se(idade <=7) {
				escreva("Sua categoria é: Infantil A!")
				
			}senao se(idade <=11) {
				escreva("Sua categoria é: Infantil B!")
				
			}senao se(idade <=13) {
				escreva("Sua categoria é: Juvenil A!")
				
			}senao se(idade <=17) {
				escreva("Sua categoria é: Juvenil B!")
				
			}senao se(idade >=18) {
				escreva("Sua categoria é: Adulto!")
				
			}/*senao se(idade = nome ou letra) { 
				escreva("Digite sua idade em caracteres de números! Ex1: 10 / Ex2: 21")
				
			}*/
			senao{
				escreva("Digite sua idade em caracteres de números! Ex1: 10 / Ex2: 21")
			}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1117; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */