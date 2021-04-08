package Entidades;

public class Revista extends Produto {

	private String editora;

	public Revista(String descircao, String codigo, double valorUnitario, String editora) {
		super(descircao, codigo, valorUnitario);
		this.editora = editora;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	
	
} //fim da classe
