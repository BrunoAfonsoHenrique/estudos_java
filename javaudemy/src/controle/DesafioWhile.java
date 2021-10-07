package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		// média das notas de uma turma
		
		Scanner leia = new Scanner(System.in);
		
		int qtd = 0;
		double total = 0;
		
		System.out.print("Digite a nota do aluno: ");
		double nota = leia.nextDouble();
		
		while(nota != -1) {
			if(nota < 0 || nota >10 ) {
				System.out.println("Nova invalida!!!");
				while(nota >= 0 && nota <= 10) {
					System.out.print("Digite a nota do aluno: ");
					nota = leia.nextDouble();
				}
			}
			else {
				qtd = qtd + 1;
				total = total + nota;
				System.out.println("Nota válida!!!");
			}
			System.out.print("Digite a nota do aluno: ");
			nota = leia.nextDouble();
		}
		
		if(total == 0 && qtd == 0) {
			System.out.println("Não foi possível calcular a média");
		} else {
			double media = total / qtd;
			System.out.printf("Média = %.2f", media);
		}
		
		leia.close();

	}

}
