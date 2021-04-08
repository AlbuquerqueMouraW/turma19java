package POO;

import java.util.Scanner;

public class Exercicio2programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Exercicio2classe aviao1 = new Exercicio2classe();
		
		System.out.print("Digite o modelo do avião: ");
		aviao1.modelo =sc.next();
		System.out.println("Digite qual tipo de avião\nComercial ou Domestico?");
		aviao1.tipo =sc.next();
		System.out.print("Digite o nome da Companhia: ");
		aviao1.companhia =sc.next();
		System.out.println("Digite (1)Voo Nacional\t(2)Voo Internacional");
		aviao1.nacInt =sc.next().charAt(0);
		
		
		System.out.printf("\nAvião 1) Modelo: %s\t Tipo de Voo: %s\nCompanhia: %s\t Nacio/Inter: %s", aviao1.modelo, aviao1.tipo, aviao1.companhia, aviao1.tipoVoo() );
		
		
		
	}

}
