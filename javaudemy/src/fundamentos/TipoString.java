package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		
		System.out.println("Olá pessoal".charAt(4)); // String não é um tipo primitivo
		
		String s = "Boa noite";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("Boa"));
		System.out.println(s.endsWith("noite"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa noite"));
		
		
		
		
		

	}

}
