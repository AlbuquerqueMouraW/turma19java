package Exercicios;

import java.util.Locale;
import java.util.Scanner;

/*
 * 1- Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. (FOR)
 */

public class ExRepeticao1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
				
		for(int x = 1000; x <= 1999; x++) {
			if (x % 11 ==  5) {
				System.out.println(x);
			}
			
		}
		
		sc.close();
	}

}
