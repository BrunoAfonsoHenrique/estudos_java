package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.print("Informe a média: ");
		double media = leia.nextDouble();
		
		if(media <= 10 && media >= 7) {
			System.out.println("--> Aluno aprovado.");
		}
		else if(media <= 10 && media >= 4.5){
			System.out.println("--> Aluno em recuperação.");
		}else {
			System.out.println("-->Aluno reprovado.");
		}
		
		// Outra forma de fazer
		boolean criterioReprovacaoAtingido =
				media < 4.5 && media >= 0;
		
		if(criterioReprovacaoAtingido) {
			System.out.println("--->Aluno reprovado.");
		}
		
		leia.close();
	}

}
