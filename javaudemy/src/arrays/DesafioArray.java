package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite a quantidade de notas do aluno: ");
		int qtdNotas = leia.nextInt();
		
		double[] notas = new double[qtdNotas];
		
		int numNota = 1;
		for(int cont = 0; cont < qtdNotas; cont++) {
			System.out.printf("Digite a %d? nota: ", numNota);
			notas[cont] = leia.nextDouble();
			numNota++;
		}
		
		System.out.println("Array --> " + Arrays.toString(notas));
		
		double totalNotas = 0;
		for(double nota: notas) {
			totalNotas += nota;
		}
		
		System.out.printf("Soma das notas do aluno ?: %.2f\n", totalNotas);
		System.out.printf("M?dia do aluno ?: %.2f", totalNotas/notas.length);
		
		
			
		leia.close();

	}

}
