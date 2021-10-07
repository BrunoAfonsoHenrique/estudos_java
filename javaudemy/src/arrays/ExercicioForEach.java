package arrays;

import java.util.Arrays;

public class ExercicioForEach {
	
	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[3];
		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		
		
		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println(notasAlunoA[0]);
		System.out.println(notasAlunoA[notasAlunoA.length - 1]); // Ultimo elemento do Array
		
			
		double totalAlunoA = 0;
		for(double nota: notasAlunoA) {
			totalAlunoA += nota;
		}
		System.out.printf("A --> Total = %.2f", totalAlunoA/ notasAlunoA.length);
		
		
		double[] notasAlunoB = {6.9, 8.9, 5.5, 10};
		
		
		double totalAlunoB = 0;
		for (double nota: notasAlunoB) {
			totalAlunoB += nota;
		}
		
		System.out.printf("\nB --> Total = %.2f", totalAlunoB / notasAlunoB.length);
	}
}