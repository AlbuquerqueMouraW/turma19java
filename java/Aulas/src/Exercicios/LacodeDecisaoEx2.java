package Exercicios;

import java.util.Scanner;

public class LacodeDecisaoEx2 {
	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n1, n2, n3;

        System.out.print("Digite o valor do primeiro número: ");
        n1 = scan.nextInt();
        System.out.print("Digite o valor do segundo número: ");
        n2 = scan.nextInt();
        System.out.print("Digite o valor do terceiro número: ");
        n3 = scan.nextInt();

        if (n1 < n2) {
            if (n2 < n3) {
                System.out.println(n1 + " " + n2 + " " + n3);
            } else if (n1 < n3) {
                System.out.println(n1 + " " + n3 + " " + n2);
            } else {
                System.out.println(n3 + " " + n1 + " " + n2);
            }
        } else if (n2 < n3) {
            if (n1 < n3) {
                System.out.println(n2 + " " + n1 + " " + n3);
            } else {
                System.out.println(n2 + " " + n3 + " " + n1);
            }
        } else {
            System.out.println(n3 + " " + n2 + " " + n1);
        }

        scan.close();
    }

}

