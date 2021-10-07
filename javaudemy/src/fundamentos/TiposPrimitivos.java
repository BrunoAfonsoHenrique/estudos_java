package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Informa��es de funcion�rios;
		
		// Tipos num�ricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 32767;
		int id = 56789;
		long pontosAcumulados = 1_234_845_223L; // L no final indica que � um long
		
		//Tipos num�ricos reais
		
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo booleano
		boolean estaDeFerias = false; // true
		
		// Tipo Caractere
		char status = 'A';
		
		// Dias na empresa
		System.out.println(anosDeEmpresa * 365);
		
		// n�mero de viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " +  salario);
		System.out.println("F�rias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}

}
