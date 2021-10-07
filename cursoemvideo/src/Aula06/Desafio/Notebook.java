package Aula06.Desafio;

public class Notebook implements NotebookControlador {
	
	private boolean tampado;
	private int volumeSom;
	private boolean ligado;
	private boolean digitando;
	
	public Notebook() {
		this.tampado = true;
		this.volumeSom = 0;
		this.ligado = false;
		this.digitando = false;
	}
	
	public void status() {
		System.out.println("Ligado: " + this.getLigado());
		System.out.println("Tampado: " + this.getTampado());
		System.out.println("Volume do som: " + this.getVolumeSom());
		System.out.println("Apto para digitar: " + this.getDigitando());
	}

	private boolean getTampado() {
		return tampado;
	}

	private void setTampado(boolean tampado) {
		this.tampado = tampado;
	}

	private int getVolumeSom() {
		return volumeSom;
	}

	private void setVolumeSom(int volumeSom) {
		this.volumeSom = volumeSom;
	}

	private boolean getLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean getDigitando() {
		return digitando;
	}

	private void setDigitando(boolean digitando) {
		this.digitando = digitando;
	}

	@Override
	public void ligar() {
		if(this.getTampado() == false) {
			this.setLigado(true);
			System.out.println("Ligando notebook...");
		}else {
			System.out.println("Esta tampado! Não dá para ligar o notebook.");
		}
		
	}

	@Override
	public void desligar() {
		if(this.getLigado() == true && this.getTampado() == false) {
			System.out.println("Notebook desligando...");
		}
		
	}

	@Override
	public void tampar() {
		if(this.getTampado() == false) {
			this.setTampado(true);
			System.out.println("Tampando notebook");
		}
		
	}

	@Override
	public void destampar() {
		this.setTampado(false);
		System.out.println("Notebook esta tampado? " + this.getTampado());
		
	}

	@Override
	public void digitar() {
		if(this.getTampado() == false &&  this.getLigado() == true) {
			System.out.println("Posso digitar. Notebook esta ligado e destampado");
		} else {
			System.out.println("É necessário que o notebook esteja ligado e destampado para"
					+ "conseguir digitar.");
		}
		
	}

	@Override
	public void aumentarSom() {
		if(this.getTampado() == false &&  this.getLigado() == true) {
			System.out.println("Aumentando o som...");
		}else {
			System.out.println("Não pode diminuir o som. Notebook esta desligado e tampado");
		}
		
	}

	@Override
	public void diminuirSom() {
		// Não implementado!!!
		
	}
		
}