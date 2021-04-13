package Entity;

public class Cavalo extends Animal {

	private String correrCavalo;

	public Cavalo(String nome, int idade, String emitiSom, String correrCavalo) {
		super(nome, idade, emitiSom);
		this.correrCavalo = correrCavalo;
	}

	public String getCorrerCavalo() {
		return correrCavalo;
	}

	public void setCorrerCavalo(String correrCavalo) {
		this.correrCavalo = correrCavalo;
	}
	
	
	
}
