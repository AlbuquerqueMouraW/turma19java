package Entity;

public class Cachorro extends Animal {

	private String correCachorro;

	public Cachorro(String nome, int idade, String emitiSom, String correCachorro) {
		super(nome, idade, emitiSom);
		this.correCachorro = correCachorro;
	}

	public String getCorreSN() {
		return correCachorro;
	}

	public void setCorreSN(String correCachorro) {
		this.correCachorro = correCachorro;
	}
	
	
	
	
}
