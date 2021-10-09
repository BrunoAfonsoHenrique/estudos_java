package desafios.bruno.pessoa;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa p[] = new Pessoa[2];
		
		p[0] = new Pessoa("Bruno", "Preto", "Masculino", "Castanho escuro", 1.74f, 103f);
		p[0].status();
		
		p[1] = new Pessoa("Jeferson", "Preto", "Masculino", "Preto", 1.80f, 77f);
		p[1].status();
		

	}

}
