package controle;

import java.util.Scanner;

public class DesafioDiaDaSemana {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um numero de 1 a 7 para ver "
				+ "o dia da semana: ");
		int num = leia.nextInt();
		
		if(num < 1 || num > 7) {
			System.out.println("Numero invalido!!");
		} else if(num == 1) {
			System.out.println("Domingo");
		}else if(num == 2) {
			System.out.println("Segunda");
		}else if(num == 3) {
			System.out.println("Terça");
		}else if(num == 4) {
			System.out.println("Quarta");
		}else if(num == 5) {
			System.out.println("Quinta");
		}else if(num == 6) {
			System.out.println("Sexta");
		}else if(num == 7) {
			System.out.println("Sabado");
		}
		System.out.println("FIM!!!");
		
		// Outra Forma
		System.out.printf("\n---------------------------------");
		
		
		System.out.print("Digite o dia da semana para ver o"
				+ "numero correspondente: ");
		
		String dia = leia.next();
		
		if("domingo".equals(dia.toLowerCase())) { // Pode usar o equalIgnoreCase() também que dá certo
			System.out.println(1);
		} else if("segunda".equals(dia.toLowerCase())) {
			System.out.println(2);
		} else if("terca".equals(dia.toLowerCase())) {
			System.out.println(3);
		} else if("quarta".equals(dia.toLowerCase())) {
			System.out.println(4);
		} else if("quinta".equals(dia.toLowerCase())) {
			System.out.println(5);
		} else if("sexta".equals(dia.toLowerCase())) {
			System.out.println(6);
		} else if("sabado".equals(dia.toLowerCase())) {
			System.out.println(7);
		}
		
		System.out.println("FIM!!!");
		
		leia.close();

	}

}
