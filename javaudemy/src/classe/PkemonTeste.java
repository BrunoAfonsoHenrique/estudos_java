package classe;

public class PkemonTeste {

	public static void main(String[] args) {
		
		Pokemon p1 = new Pokemon("Pikachu", "Eletrico");
		p1.peso = 5.85;
		p1.nivelPoder = 18;
		
		Pokemon p2 = new Pokemon("Charmander", "Fogo");
		p2.peso = 7;
		p2.nivelPoder = 23;
		
		System.out.printf("Nome: %s; \nTipo: %s; \nPeso: %.2f; \nNivel de poder: %s",
			p1.nome,p1.tipo,p1.peso,p1.nivelPoder);
		
		System.out.printf("\n\nNome: %s; \nTipo: %s; \nPeso: %.2f; \nNivel de poder: %s",
				p2.nome,p2.tipo,p2.peso,p2.nivelPoder);

	}

}
