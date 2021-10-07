package fundamentos.operadores;

public class DesafiosAritmeticos {
	
	public static void main(String[] args) {
		
		int a = 3 * 4 - 10;
		// int b = (int) Math.pow(a, 3);
		double b = Math.pow(a, 3);
		
		System.out.println(a);
		
		// Desafio
		System.out.println("Desafio");
		
		double parte1 = (Math.pow((6 * (3 + 2)), 2))/ ( 3 * 2);
		double parte2 = Math.pow(((1-5) * (2-7) / 2), 2);
		
		double parte3 = parte1 - parte2;
		double resultado = (Math.pow(parte3, 3)) / (Math.pow(10, 3));
		System.out.println((int) resultado);
		
	}

}
