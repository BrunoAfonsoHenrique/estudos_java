package aula04;

public class Caneta {
	
	public String modelo;
	private float ponta;
	private String cor;
	private boolean tampada;
	
	public Caneta(String m, String c, float p) {
		this.modelo = m;
		this.cor = c;
		this.setPonta(p);;
		this.status();
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public float getPonta() {
		return ponta;
	}
	
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	
	public void status() {
		System.out.println("Sobre a caneta: ");
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Cor: " + this.cor);
		System.out.println("Tampada: " + this.tampada);
	}
	
	public void tampar() {
		this.setTampada(true);
	}
	
	public void destampar() {
		this.setTampada(false);
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean isTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
		this.status();
	}
	
	
}
