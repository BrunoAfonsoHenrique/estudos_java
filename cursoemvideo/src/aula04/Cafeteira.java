package aula04;

public class Cafeteira {
	
	private String cor;
	private float peso;
	private String marca;
	private float qtdAgua;
	private String materialBule;
	private float preco;
	private boolean ligada;
	
	public Cafeteira(String cor, float preco, boolean ligada) {
		this.setCor(cor);
		this.setPreco(preco);
		this.setLigada(ligada);
	}
	private void status() {
		System.out.println("<<< Status da Cafeteira >>>");
		System.out.println("-> Cor: " + this.getCor());
		System.out.println("-> Peso: "+ this.getPeso());
		System.out.println("-> Marca: "+ this.getMarca());
		System.out.println("-> Quantidade de agua: " + this.getQtdAgua());
		System.out.println("-> Material do bule: " + this.getMaterialBule());
		System.out.println("-> Preço em R$" + this.preco);
		System.out.println("-> Aparelho ligado: " + this.getLigada());
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public float getQtdAgua() {
		return qtdAgua;
	}
	public void setQtdAgua(float qtdAgua) {
		this.qtdAgua = qtdAgua;
	}
	public String getMaterialBule() {
		return materialBule;
	}
	public void setMaterialBule(String materialBule) {
		this.materialBule = materialBule;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public boolean getLigada() {
		return ligada;
	}
	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	
	public void adicionarMarca(String m) {
		this.setMarca(m);
		this.status();
	}
	
}
