package aula02;

public class BuleDeCafe {
	
	double tamanho;
	String cor;
	boolean alca;
	boolean tampada;
	
	
	void estaTampada() {
		if(this.tampada == true) {
			System.out.println("N�o tem caf� dentro");
		}else {
			System.out.println("Tem caf� dentro");
		}
	}
	
	void tamparBule() {
		this.tampada = true;
	}
	
	void destamparBule() {
		this.tampada = false;
	}
	
	void statusBule() {
		System.out.println("Tamanho: " + this.tamanho);
		System.out.println("cor: " + this.cor);
		System.out.println("alca: " + this.alca);
		System.out.println("Tampada: " + this.tampada);
	}
}
