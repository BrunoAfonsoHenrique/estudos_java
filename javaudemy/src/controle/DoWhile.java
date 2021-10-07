package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		// if(...) setença; ou {}
		// while(...) sentença; ou 
		// for(...;...;...) sentença; ou {}
		
		// do {} while(...); --> a única que termina com ;
		
		Scanner leia = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Você precisa falar ]"
					+ "as palavras mágicas...");
			
			System.out.print("Quer sair? ");
			texto = leia.nextLine();
			
		} while(!texto.equalsIgnoreCase("por favor"));
		
		System.out.print("Obrigado!!!");
		leia.close();
		
		
		// for é mais usado, depois o while e depois o do...while
	}

}
