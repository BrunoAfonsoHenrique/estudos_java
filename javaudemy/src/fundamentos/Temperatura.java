package fundamentos;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		// (°F - 32) * 5/9 = °C
		
		final int ajuste = 32;
		final double fator = 5/9.0;
		
		System.out.print("°F: ");
		int f = leia.nextInt();
		
		double temperatura = (f - ajuste) * fator;
		
		System.out.printf("°C = %.2f", temperatura);
		

	}

}
