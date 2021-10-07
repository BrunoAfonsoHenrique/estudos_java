package classe;

public class Data {

		int dia;
		int mes;
		int ano;
		
		// Construtor sem parametros
		Data(){
			//dia = 01;
			//mes = 01;
			//ano = 1970;
			this(1, 1, 1970);
			
			
			// byte, short, int, lomg --> 0
			// float, double --> 0.0
			// boolean --> false
			// char --> '\0000'
			// Objetos --> null
		}
		
		//Construtor com parametros
		Data(int dia, int mes, int ano){
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		}
		
		String obterDataFormatada() {
			final String formato = "%d%d%d";
			return String.format(formato,this.dia,mes,ano);
		}
		
		void imprimirDataFormatada() {
			System.out.println(this.obterDataFormatada());
		}
}
