package projetoLivro;

public class ProjetoLivro {

	public static void main(String[] args) {
		
		Pessoa[] p = new Pessoa[2];
		
		p[0] = new Pessoa("Bruno", 26, 'M');
		p[1] = new Pessoa("Amanda", 22, 'F');
		
		Livro[] l = new Livro[2];
		
		l[0] = new Livro("Harry Potter", "J.K Rowling", 300, p[0]);
		l[1] = new Livro("Pequeno principe", "jose blabla", 100, p[1]);
		
		System.out.println(l[0].detalhes());
		
		l[1].folhear(99);
		System.out.println(l[1].detalhes());
			

	}

}
