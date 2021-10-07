package fundamentos.operadores;

import java.util.Scanner;

public class DesafiosFinais {

	public static void main(String[] args) {
		
		/* 1 - Criar um programa que leia a temperatura em Celsius e 
		 * converta para Fahrenheit. */
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Celsius: C° ");
		double c = leia.nextDouble();
		
		double f = c * 1.8 + 32;
		
		System.out.printf("A temperatura em Fahrenheit é F° %.2f", f );
		
		/* 2 - Criar um programa que leia a temperatura em 
		 * Fahrenheit e converta para Celsius.
		 */
		
		System.out.printf("\n\nDigite a temperatura em Fahrenheit é F° ");
		f = leia.nextDouble();
		c = (f - 32) / 1.8;
		System.out.printf("A temperatura em em Celsius é C° %.2f", c );
		
		
		/* 3 - Criar um programa que leia o peso e a altura do 
		 * usuário e imprima no console o IMC.
		 */
		
		System.out.printf("\n\nPeso: ");
		double peso = leia.nextDouble();
		
		System.out.print("Altura: ");
		double altura = leia.nextDouble();
		
		double imc = peso / (Math.pow(altura, 2));
		
		System.out.printf("IMC = %.2f", imc);
		
		/* 4 - Criar um programa que leia um valor e apresente os 
		 * resultados ao quadrado e ao cubo do valor.
		 */
		
		System.out.print("\n\nDigite um numero: ");
		double num = leia.nextDouble();
		
		System.out.printf("Quadrado do numero: %.2f", Math.pow(num, 2));
		System.out.printf("\nCubo do numero: %.2f", Math.pow(num, 3));
		
		leia.close();
	}

}
