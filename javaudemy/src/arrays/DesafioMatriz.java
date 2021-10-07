package arrays;

import java.util.Scanner;

public class DesafioMatriz {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Quantos alunos tem na turma: ");
		int qtdAlunos = leia.nextInt();
		
		System.out.print("Quantas notas cada aluno tem: ");
		int qtdNotas = leia.nextInt();
		
		double[][] notas = new double [qtdAlunos][qtdNotas ];
		
		for(int cont = 0; cont < qtdAlunos; cont++) {
			for(int cont2 = 0; cont2 < qtdNotas; cont2++) {
				System.out.printf("Digite a nota do aluno %d: ",cont);
				notas[cont][cont2]= leia.nextDouble();
			}
		}
		
		double soma = 0;
		
		for(int cont = 0; cont < qtdAlunos; cont++) {
			for(int cont2 = 0; cont2 < qtdNotas; cont2++) {
				System.out.print("["+notas[cont][cont2]+"]");
				soma += notas[cont][cont2];
			}
			System.out.println("");
		}
		
		double media = soma /(qtdAlunos * qtdNotas);
		System.out.println(media);
		
		leia.close();

	}

}
