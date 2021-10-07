package classe;


public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = 01;
		d1.mes = 01;
		d1.ano = 1970;
		
		
		Data d2 = new Data(24, 12, 1994);
		

		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		d2.obterDataFormatada();
	}

}
