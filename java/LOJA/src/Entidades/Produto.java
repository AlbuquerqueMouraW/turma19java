package Entidades;

public class Produto {
	
	//atributos
	private String descircao;
	private String codigo;
	private double valorUnitario;
	private int qtdeEstoque;
	
	//construtores
	public Produto(String descircao, String codigo, double valorUnitario) {
		super();
		this.descircao = descircao;
		this.codigo = codigo;
		this.valorUnitario = valorUnitario;
	}
	
	//encapsulamento - getter and setters
	
	public String getDescircao() {
		return descircao;
	}

	public void setDescircao(String descircao) {
		this.descircao = descircao;
	}

	public String getCodigo() {
		return codigo;
	}
	/*
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}*/

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public int getQtdeEstoque() {
		return qtdeEstoque;
	}
	/*
	public void setQtdeEstoque(int qtdeEstoque) {
		this.qtdeEstoque = qtdeEstoque;
	}
	*/
	//this. usado para diferenciar um atributo.
	
	
	//metodo
	public void incluirEstoque(int valorIncluido) {
		this.qtdeEstoque = this.qtdeEstoque + qtdeEstoque;

	}
	public void tirarEstoque(int valorExcluido) {
		
		if (this.qtdeEstoque >= valorExcluido) {
			this.qtdeEstoque = this.qtdeEstoque - valorExcluido;
			
		} 
		else {
			System.out.println("Estoque não disonivel");
	}
	
	
}
}