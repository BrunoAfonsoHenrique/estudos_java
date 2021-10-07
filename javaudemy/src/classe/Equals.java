package classe;

public class Equals {
	
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		
		u1.nome = "Bruno Afonso";
		u1.email = "bruno.silva@ezmail.com.br";
		
		Usuario u2 = new Usuario();
		u2.nome = "Bruno Afonso";
		u2.email = "bruno.silva@ezmail.com.br";
		
		System.out.println(u1 == u2); //false
		System.out.println(u1.equals(u2)); 
		
		System.out.println(u2.equals(u1)); 
		
		//System.out.println(u2.equals(new Date()));
		
		// O HashCode será abordado em outra aula
	}
}
