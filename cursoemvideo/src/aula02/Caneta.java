package aula02;

public class Caneta {
	
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	void status() {
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Esta tampada? " + this.tampada);
		System.out.println("Tem ponta de " + this.ponta);
	}
	void rabiscar() {
		if(this.tampada == true) {
			System.out.println("ERRO! N�o posso rabiscar");
		} else {
			System.out.println("Estou rabiscando!");
		}
	}
	
	void tampar() {
		this.tampada = true;
	}
	
	void destampar() {
		this.tampada = false;
	}
}
