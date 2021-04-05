package exemplos;

import java.util.Scanner;

public class ConversaoCeusius {

	public static void main(String[] args) {
		
		
		double celsius;
		double fahrenheit;
		Scanner leia = new Scanner(System.in);
		
		
		System.out.print("Digite a temperatura em °C: ");
		celsius = leia.nextByte();
		
		fahrenheit = ((celsius * 9/5)+32);
		
		System.out.printf(celsius+"°C É igual a %.2f ",fahrenheit);
		

	}

}
