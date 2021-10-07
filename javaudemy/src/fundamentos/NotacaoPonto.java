package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		double a = 2.3;
		String s = "Bom dia X";
		
		s = s.toUpperCase(); // Letras maiusculas
		System.out.println(s);
		
		s = s.replace("X", "Senhora"); //Substituir um caractere
		System.out.println(s);
		
		s = s.concat("!!!");
		System.out.println(s);
		
		// Notação ponto é para acessar o método de um determinado dado
		
		System.out.println("Jeferson".toUpperCase());
		
		String y = "Bom dia X"
				.replace("X", "Bru")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		System.out.println(y.length());
	}

}
