package POO;

public class Exercicio1classe {
	
	public String nome;
	public int anoNascimento;
	public String cpf;
	
	public int calculoIdade(int anoAtual) {
		return anoAtual - anoNascimento;
	}

}
