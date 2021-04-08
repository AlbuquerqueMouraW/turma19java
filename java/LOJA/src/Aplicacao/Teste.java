package Aplicacao;

import java.util.Locale;

import Entidades.Produto;

public class Teste {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Produto prod1 = new Produto("produtoC", "X", 100);
		
		prod1.setValorUnitario(80);
		prod1.incluirEstoque(10);
		
		System.out.println(prod1.getDescircao()+" R$ "+ prod1.getValorUnitario()+ "Estoque"+ prod1.getQtdeEstoque());
		
		
		
		
		

	}

}
