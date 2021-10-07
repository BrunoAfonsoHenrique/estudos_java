package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		// if(...) seten�a; ou {}
		// while(...) senten�a; ou 
		// for(...;...;...) senten�a; ou {}
		
		// do {} while(...); --> a �nica que termina com ;
		
		Scanner leia = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Voc� precisa falar ]"
					+ "as palavras m�gicas...");
			
			System.out.print("Quer sair? ");
			texto = leia.nextLine();
			
		} while(!texto.equalsIgnoreCase("por favor"));
		
		System.out.print("Obrigado!!!");
		leia.close();
		
		
		// for � mais usado, depois o while e depois o do...while
	}

}
