package alula07relacionamentoentreclasses.inter.treino;

public class Televisao implements TelevisaoControlador{
	
	private boolean ligada;
	private int canal;
	private boolean internet;
	
	public Televisao() {
		this.setLigada(false);
		this.setInternet(false);
		this.setCanal(0);
		this.setInternet(false);
	}
	
	//Getters e Setters

	private boolean getLigada() {
		return ligada;
	}

	private void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

	private int getCanal() {
		return canal;
	}

	private void setCanal(int canal) {
		this.canal = canal;
	}

	private boolean getInternet() {
		return internet;
	}

	private void setInternet(boolean internet) {
		this.internet = internet;
	}
	
	//Métodos

	@Override
	public void ligar() {
		this.setLigada(true);
		System.out.println("Ligando a TV... Status atual: " + this.getLigada());
		
	}

	@Override
	public void desligar() {
		if(this.ligada == true) {
			this.setLigada(false);
			System.out.println("Desligando a TV... Status atual: " + this.getLigada());
		}else {
			System.out.println("TV já esta desligada. Não é possível desligar!");
		}
		
	}

	@Override
	public void trocarCanal() {
		if(this.ligada == true) {
			this.setCanal(this.getCanal() + 1);
			System.out.println("Canal atual é: " + this.getCanal());
		}
		
	}

	@Override
	public void conectarInternet() {
		if(this.ligada == true) {
			this.setInternet(true);
			System.out.println("Conectando na internet...");
		} else {
			System.out.println("A TV precisa estar ligada para você conseguir conectar na internet!!!");
		}
		
	}

	@Override
	public void desconectarInternet() {
		if(this.ligada == true && this.internet == true) {
			System.out.println("Desconectando da internet!!!");
			this.setInternet(false);
		}
		
	}

	@Override
	public void assistirNetflix() {
		if(this.ligada == true && this.internet == true) {
			System.out.println("Pode assistir Netflix, a TV esta conectada");
		} else if(this.ligada == false){
			System.out.println("TV esta desligada, não pode assistir netflix!!!");
		} else if(this.ligada == true && this.internet == false) {
			System.out.println("Não pode assistir Netflix, verifique sua conexão com a internet!");
		}	
	}
	
	public void status() {
		System.out.println("------------------------STATUS DA TV------------------------");
		System.out.println("A TV esta atualmente ligada: " + this.getLigada());
		System.out.println("Tem conexão com a internte no momento: " + this.getInternet());
		System.out.println("Canal atual: " + this.getCanal());
	}
	
}
