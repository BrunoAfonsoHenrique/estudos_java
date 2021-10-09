package desafios.bruno.pessoa;

public class Pessoa {
	
	private String nome;
	private String corOlhos;
	private String genero;
	private String corCabelo;
	private float altura;
	private float peso;
	private String faixaPeso;
	private String faixaAltura;


	public Pessoa(String nome, String corOlhos, String genero, String corCabelo, float altura, float peso) {
		this.nome = nome;
		this.corOlhos = corOlhos;
		this.genero = genero;
		this.corCabelo = corCabelo;
		this.setAltura(altura);
		this.setPeso(peso);
	}
	
	public void status() {
		System.out.println("--------------------------------------------------------");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Cor dos olhos: " + this.getCorOlhos());
		System.out.println("Genero: " + this.getGenero());
		System.out.println("Cor de cabelo: " + this.corCabelo);
		System.out.println("Altura: " + this.getAltura() + " é considerado: "+ this.getFaixaAltura());
		System.out.println("Peso: " + this.getPeso() + " é considerado " + this.getFaixaPeso());
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCorOlhos() {
		return corOlhos;
	}


	public void setCorOlhos(String corOlhos) {
		this.corOlhos = corOlhos;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getCorCabelo() {
		return corCabelo;
	}


	public void setCorCabelo(String corCabelo) {
		this.corCabelo = corCabelo;
	}


	public float getAltura() {
		return altura;
	}


	public void setAltura(float altura) {
		this.altura = altura;
		this.setFaixaAltura();
	}


	public float getPeso() {
		return peso;
	}


	public void setPeso(float peso) {
		this.peso = peso;
		this.setFaixaPeso();
	}


	public String getFaixaPeso() {
		return faixaPeso;
	}

	private void setFaixaPeso() { 
		if(this.peso <= 0) {
			this.faixaPeso ="Peso invalido" ;
		}else if(this.peso <= 50) {
			this.faixaPeso = "Peso leve";
		}else if(this.peso <= 77) {
			this.faixaPeso = "Peso ideal";
		}else {
			this.faixaPeso = "Peso pesado";
		}
	}

	public String getFaixaAltura() {
		return faixaAltura;
	}

	public void setFaixaAltura() {
		if(this.altura <= 1.55) {
			this.faixaAltura = "Baixo";
		}else if(this.altura <= 1.88) {
			this.faixaAltura = "Altura legal";
		}else if(this.altura <= 3) {
			this.faixaAltura = "Gigante";
		}
	}

}