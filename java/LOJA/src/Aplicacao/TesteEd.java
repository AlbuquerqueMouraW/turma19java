package Aplicacao;

import java.util.Locale;

import Entidades.Doces;
import Entidades.Produto;
import Entidades.Revista;
import Entidades.Roupa;

public class TesteEd {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Produto prod1 = new Produto("CAMISA","XL001",100.25); //construcao
		Revista prod2 = new Revista("Seja","aaa", 12, "Editora1");
		Roupa prod3 = new Roupa("Roupa","bb", 40,"Marca");
		Doces prod4 = new Doces("Doce","cc", 1,"Fini");
		
		
		System.out.println(prod1.getDescircao()+" R$ "+prod1.getValorUnitario()+" estoque "+prod1.getQtdeEstoque());
		prod1.setValorUnitario(80.55);
		prod1.incluirEstoque(20);
		System.out.println(prod1.getDescircao()+" R$ "+prod1.getValorUnitario()+" estoque "+prod1.getQtdeEstoque()+" custo total "+(10*prod1.getValorUnitario()));
		prod1.tirarEstoque(10);
		System.out.println("("+prod1.getDescircao()+")"+" R$ "+prod1.getValorUnitario()+" estoque "+prod1.getQtdeEstoque());
		System.out.println();
		System.out.println(prod2.getQtdeEstoque()+" "+prod2.getDescircao());
		System.out.println();
		System.out.println(prod3.getQtdeEstoque()+" "+prod3.getDescircao());
		System.out.println();
		System.out.println(prod4.getQtdeEstoque()+" "+prod4.getDescircao());
	
	
	
	}
	

}
