package controle;

public class SwitchSemBreak {

	public static void main(String[] args) {
		
		// if(bool) ...
		// while(bool) ...
		// for (;bool;) ...
		// switch() ---> recebe diretamente o valor, não recebe verdadeiro ou falso
		
		String faixa = "preta";
		
		switch(faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
			break;
		case "verde":
			System.out.println("Sei o Heian Godan...");
			break;
		case "vermelha":
			System.out.println("Sei o Heian Nidan...");
			break;
		default:
			System.out.println("Sei nada!!!");
		}

	}

}
