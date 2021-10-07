package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		// Offer e Add -> Adicionam elementos na fila
		// Diferença é o comportamento quando a fila está cheia!
		fila.add("Ana"); // retorna false
		fila.offer("Bia"); // Lança uma exceção
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// Peek e Element -> adicionam elementos da fila (Sem remover)
		
		//Diferença é o comportamento que ocorre
		// quando a fila está vazia!	
		System.out.println(fila.peek());
		System.out.println(fila.element()); //--> Aparece que não tem elemento : Exception
		
		//Poll e Remove -> obter o próximo elemento da fila e remove!
		
		//Diferença é o comportamento que ocorre
		// quando a fila está vazia!	
		System.out.println(fila.poll()); // --> retorna o 1 elemento da fila já removendo
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		System.out.println(fila);
		
		System.out.println(fila.remove());
		System.out.println(fila);
		
		// fila.size()
		// fila.clear()
		// fila.isEmpty() --> Saber se esta ou não vazia
		
		System.out.println(fila.contains("Gui"));
	}	
	
		

}
