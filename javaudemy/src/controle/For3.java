package controle;

public class For3 {

	public static void main(String[] args) {
		
		/*Escopo
		for(int cont = 0; cont < 10; cont++) {
			System.out.println(cont);
		} */
		
		// System.out.println(cont); // Erro, pois cont é uma variável de escopo local
		
		for(int i = 0; i < 10; i++) {
			for(int c = 0; c < 10; c++) {
				System.out.printf("[%d %d]", i, c);
			}
			System.out.println();
		}

	}

}
