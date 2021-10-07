package fundamentos;

import java.util.Scanner;

public class TipStringEquals {

	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s1 = new String("2");
		System.out.println("2" == s1);
		System.out.println("2".equals(s1)); // equals compara os conteudos
		
		Scanner leia = new Scanner(System.in);
		
		String s2 = leia.nextLine();
		System.out.println("2".equals(s2.trim())); // trim() tira os espa�os em branco
		
		// next --> Tira os espa�os em branco
		//nextLine --> N�o tira os espa�os em branco
		leia.close();
	}

}
