package aula04;

public class Aula04 {
	public static void main(String[] args) {
		
		Caneta c1 = new Caneta("Nic", "Amarela", 0.4f);
		//c1.status();
		
		//c1.setModelo("BIC");
		//c1.setPonta(0.5f);
		//c1.status();
		
		System.out.println("Tenho uma caneta " + c1.getModelo() 
			+ " e ponta " + c1.getPonta());
	}
}
