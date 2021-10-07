package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		double soma = 0;
		
		for(int cont = 1; cont < 4;cont++ ) {
			System.out.print("Salario " + cont+": ");
			String sal = leia.nextLine().replace(",", ".");
			
			double salario = Double.parseDouble(sal);
			
			soma = salario + soma;			
		}
		
		leia.close();
		double media = soma / 3;
		
		System.out.println("Soma dos salários: R$" + soma);
		System.out.println("Média dos salários: R$" + media);
	}

}
