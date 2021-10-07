package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Numero 1: ");
		double num1 = leia.nextDouble();
		
		System.out.print("Numero 2: ");
		double num2 = leia.nextDouble();

		System.out.println("Qual a operação: ");
		String op = leia.next();
		
		// Lógica
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2: resultado ;
		resultado = "*".equals(op) ? num1 * num2: resultado ;
		resultado = "/".equals(op) ? num1 / num2: resultado ;
		resultado = "%".equals(op) ? num1 % num2: resultado ;
				
		System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);
		leia.close();
	}

}
