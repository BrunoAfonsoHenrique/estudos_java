package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		// Offer e Add -> Adicionam elementos na fila
		// Diferen�a � o comportamento quando a fila est� cheia!
		fila.add("Ana"); // retorna false
		fila.offer("Bia"); // Lan�a uma exce��o
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// Peek e Element -> adicionam elementos da fila (Sem remover)
		
		//Diferen�a � o comportamento que ocorre
		// quando a fila est� vazia!	
		System.out.println(fila.peek());
		System.out.println(fila.element()); //--> Aparece que n�o tem elemento : Exception
		
		//Poll e Remove -> obter o pr�ximo elemento da fila e remove!
		
		//Diferen�a � o comportamento que ocorre
		// quando a fila est� vazia!	
		System.out.println(fila.poll()); // --> retorna o 1 elemento da fila j� removendo
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		System.out.println(fila);
		
		System.out.println(fila.remove());
		System.out.println(fila);
		
		// fila.size()
		// fila.clear()
		// fila.isEmpty() --> Saber se esta ou n�o vazia
		
		System.out.println(fila.contains("Gui"));
	}	
	
		

}
