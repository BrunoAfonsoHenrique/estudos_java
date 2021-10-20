package aula011heranca;

public class AlunoTecnico extends Aluno{
	
	private int registroProfissional;
	
	public void praticar() {
		System.out.println("Praticando programção em Java...");
	}
	
	@Override
	public void pagarMensalidade() {
		System.out.println(this.getNome() + "Pagando a mensalidade mais cara");
	}

	public int getRegistroProfissional() {
		return registroProfissional;
	}

	public void setRegistroProfissional(int registroProfissional) {
		this.registroProfissional = registroProfissional;
	}

}
