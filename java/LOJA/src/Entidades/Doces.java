package Entidades;

public class Doces extends Produto {
	
	private String fabricante;

	public Doces(String descircao, String codigo, double valorUnitario, String fabricante) {
		super(descircao, codigo, valorUnitario);
		this.fabricante = fabricante;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	

}
