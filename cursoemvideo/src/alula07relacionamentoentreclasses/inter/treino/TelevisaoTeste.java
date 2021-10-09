package alula07relacionamentoentreclasses.inter.treino;

public class TelevisaoTeste {

	public static void main(String[] args) {
		
		Televisao tv = new Televisao();
		
		tv.ligar();
		tv.trocarCanal();
		tv.trocarCanal();
		tv.trocarCanal();
		tv.conectarInternet();
		tv.desconectarInternet();
		tv.assistirNetflix();
		tv.conectarInternet();
		tv.assistirNetflix();
		tv.desligar();
		tv.assistirNetflix();
		tv.ligar();
		tv.desconectarInternet();
		tv.assistirNetflix();
		tv.status();

	}

}
