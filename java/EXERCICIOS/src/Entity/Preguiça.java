package Entity;

public class Pregui�a extends Animal {
	
	private String subirArvores;

	public Pregui�a(String nome, int idade, String emitiSom, String subirArvores) {
		super(nome, idade, emitiSom);
		this.subirArvores = subirArvores;
	}

	public String getSubirArvores() {
		return subirArvores;
	}

	public void setSubirArvores(String subirArvores) {
		this.subirArvores = subirArvores;
	}
	
	

	
	
	
}
