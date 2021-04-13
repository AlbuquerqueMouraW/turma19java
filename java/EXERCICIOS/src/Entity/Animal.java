package Entity;

public class Animal {

	private String nome;
	private int idade;
	private String emitiSom;
	public Animal(String nome, int idade, String emitiSom) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.emitiSom = emitiSom;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEmitiSom() {
		return emitiSom;
	}
	public void setEmitiSom(String emitiSom) {
		this.emitiSom = emitiSom;
	}
	
	
	
	
	
	
	
}
