package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		usuarios.put(1, "Bruno");
		usuarios.put(2, "Jeferson");
		usuarios.put(3, "Ana");
		usuarios.put(4, "Viviane");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet()); // Conjunto das chaves, pegar as chaves
		
		System.out.println(usuarios.values()); // pega os valores
		
		System.out.println(usuarios.entrySet()); // pega chave e valor ao mesmo tempo
		
		System.out.println(usuarios.containsKey(3));
		
		System.out.println(usuarios.containsValue("Bruno"));
		
		System.out.println(usuarios.get(2)); // Retorna jeferson
		
		// Percorrer os elementos
		
		for(int chave: usuarios.keySet()){
			System.out.println(chave);
		}
		
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + " ");
			System.out.println(registro.getValue());
		}
	}

}
