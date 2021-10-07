package fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {
		
		Integer num1 = 10000;
		System.out.println(num1.toString().length()); //toString()
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2));
		
		/**
		Byte.toString();
		Long.toString();
		Short.toString();
		Double.toString();
		*/
		
		System.out.println(""+num2);
		
		

	}

}
