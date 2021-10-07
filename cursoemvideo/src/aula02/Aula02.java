package aula02;

public class Aula02 {
	
	public static void main(String[] args) {
		
		Caneta c1 = new Caneta();
		
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.tampada = false;
		c1.modelo = "BIC";
		c1.destampar();
		c1.rabiscar();
		c1.status();
		
		Caneta c2 = new Caneta();
		c2.modelo = "Everis";
		c2.cor = "Vermelho";
		c2.tampada = true;
		c2.rabiscar();
		c2.status();
	}
}
