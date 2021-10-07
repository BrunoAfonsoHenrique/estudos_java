package colecoes;

import java.util.HashSet;
import java.util.Set;
//import java.util.HashSet;
//import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		//Set<String> listaAprovados = new HashSet<String>();
		SortedSet<String> listaAprovados = new TreeSet<String>();
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		
		
		Set<Integer> nums = new HashSet<Integer>();
		nums.add(1);
		nums.add(4);
		nums.add(120);
		nums.add(10);
		
		for(int numeros: nums) {
			System.out.println(numeros);
		}
	}
	
	//sortedSet aceita ordenação
}
