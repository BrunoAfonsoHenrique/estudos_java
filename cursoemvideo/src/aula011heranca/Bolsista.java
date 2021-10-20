package aula011heranca;

public class Bolsista extends Aluno{
	
	private int bolsa;
	
	public void renovarBolsa() {
		System.out.println("Renovando bolsa...");
	}
	
	@Override
	public void pagarMensalidade() {
		System.out.println(this.getNome() + " esta pagando mensalidade com desconto");
	}

	public int getBolsa() {
		return bolsa;
	}

	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}
	
	
	
}
