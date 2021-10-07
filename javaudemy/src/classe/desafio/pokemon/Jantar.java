package classe.desafio.pokemon;

public class Jantar {

	public static void main(String[] args) {
		
		Comida c1 = new Comida("Raios", 0.666);
		Comida c2 = new Comida("Trovao", 0.120);
		
		Pokemon p1 = new Pokemon("Pikachu", 2.0);
		
		System.out.println(p1.apresentar());
		
		p1.Comer(c1);
		System.out.println(p1.apresentar());
		
		p1.Comer(c2);
		System.out.println(p1.apresentar());

	}

}
