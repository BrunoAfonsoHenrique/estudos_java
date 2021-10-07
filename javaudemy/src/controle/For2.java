package controle;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		for(int cont = 10; cont >= 0; cont-=2) {
			System.out.println(cont);
		}
		
		leia.close();
	}

}
