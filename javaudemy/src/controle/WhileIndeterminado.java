package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String cont = "";
		while(!cont.equalsIgnoreCase("sair")) {
			System.out.print("Digite a palavra: ");
			cont = leia.nextLine();
			System.out.println("Você diz: " + cont);
		}
		
		System.out.println("FIM!!");

		leia.close();
	}

}
