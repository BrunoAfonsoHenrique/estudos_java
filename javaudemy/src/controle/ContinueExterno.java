package controle;

public class ContinueExterno {

	public static void main(String[] args) {
		
		externo: for(int i = 1; i < 3; i++) { // dando um nome ao laço
			for(int j = 1; j < 3; j++) {
				
				if(i == 1) {
					continue externo;
				}
				
				System.out.printf("%d %d ", i, j);
			}
			System.out.println();
		}

	}
}

