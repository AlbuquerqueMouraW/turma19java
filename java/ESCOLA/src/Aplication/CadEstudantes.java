package Aplication;

import java.util.Locale;
import java.util.Scanner;

import Entity.Basico;
import Entity.Estudantes;

public class CadEstudantes {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		char opcao;
		
		
		Estudantes estudante1 = new Estudantes(1001, "40167675800");
		
		
do {
		System.out.println("Escola");
		System.out.println("bl�bl�bl�");
		System.out.println();
		
		System.out.println("\n1)BASICO\t2)M�DIO\n3)GRADUA�AO\t4)P�S\n5)MESTRADO\t6)SAIR");		
		
		System.out.print("DIGITE O CODIGO DA OP��O SELECIONADA: ");	
		opcao = leia.next().charAt(0);
		if (opcao == '1') {
			
			System.out.print("Digite a matricula do aluno: ");
			int matricula = leia.nextInt();
			System.out.print("Digite o CPG do aluno: ");
			String cpf = leia.next();
			System.out.println("Digite o dia de aniversario do aluno: ");
			int diaAniversario = leia.nextInt();
			
			Basico aluno = new Basico(matricula,cpf,diaAniversario);
			
			System.out.println("Digite a nota: ");
			double nota = leia.nextDouble();
			aluno.adicionarNota(nota);
			
			if (aluno.getPontos() <=5) {
				System.out.println("Ainda n�o");
			}
			else {
				System.out.println("Parab�ns!");
			}
			System.out.println("Qual dia de hoje? ");
			int diaAtual = leia.nextInt();
			aluno.bonusAniversario(diaAtual);
			System.out.println("Pontos Atuais: "+aluno.getPontos());
			System.out.println("Continuar (1)SIM ou (6)N�O");
			opcao = leia.next().charAt(0);
		}
		} while (opcao != '6');
		
			
			
		}
		
		
	}

