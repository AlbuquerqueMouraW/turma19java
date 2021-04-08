package Entidades;

public class Roupa extends Produto {
	
	private String marca;

	public Roupa(String descircao, String codigo, double valorUnitario, String marca) {
		super(descircao, codigo, valorUnitario);
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	

	
	
	
}//fim do programa
