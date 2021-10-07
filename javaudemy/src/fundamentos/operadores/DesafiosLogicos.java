package fundamentos.operadores;

public class DesafiosLogicos {

	public static void main(String[] args) {
		// Trabalho na terça (V OU F)
		
		// Trabalho na quinta (V OU F)
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean tv50 = trabalho1 && trabalho2;
		boolean tv32 = trabalho1 ^ trabalho2;
		boolean sorvete = trabalho1 || trabalho2;
		
		// Op Unario
		boolean saudavel = !sorvete;
		
		System.out.println("Comprou TV50\"? " + tv50);
		System.out.println("Comprou TV32\"? " + tv50);
		System.out.println("Comprou sorvete\"? " + sorvete);
		
		
		System.out.println("Mais saudável? " + saudavel);
		
	}

}
