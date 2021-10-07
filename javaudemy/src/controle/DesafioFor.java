package controle;

public class DesafioFor {

	public static void main(String[] args) {
		
		String valor = "#";
		for(int i = 1; i <= 5; i++) {
			System.out.println(valor);
			valor += "#";
		}
		
		System.out.println("-----------------------");
		
		String s = "#";
		while(!s.equals("######")) {
			System.out.println(s);
			s += "#";
		}
		
		System.out.println("-----------------------");
		
		
		for(String c = "#";!c.equals("######");c += "#") {
			System.out.println(c);
		}
		
	}

}
