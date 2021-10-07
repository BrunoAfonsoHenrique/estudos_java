package classe.desafio.pokemon;

public class Pokemon {
	
	String nome;
	double peso;
	
	Pokemon(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	void Comer(Comida comida) {
		if(comida != null) {
			this.peso += comida.peso;
		}
		
	}
	
	String apresentar() {
		return "Nome: " + nome + "\nPeso: " + peso;
	}
}
