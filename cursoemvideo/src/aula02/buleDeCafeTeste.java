package aula02;

public class buleDeCafeTeste {

	public static void main(String[] args) {
		
		BuleDeCafe b1 = new BuleDeCafe();
		
		b1.tamanho = 17.5;
		b1.cor = "prata";
		b1.alca = true;
		b1.tampada = false;
		
		b1.statusBule();
		b1.estaTampada();
	}
	
}
