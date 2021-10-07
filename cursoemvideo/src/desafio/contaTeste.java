package desafio;

public class contaTeste {

	public static void main(String[] args) {
		
		ContaBanco p1 = new ContaBanco();
		p1.setNumConta(1111);
		p1.setDono("Jubileu");
		p1.abrirConta("CC");
		p1.estadoAtual();
		p1.depositar(300);
		p1.estadoAtual();
		
		ContaBanco p2 = new ContaBanco();
		p2.setNumConta(2222);
		p2.setDono("Tamiris");
		p2.abrirConta("CP");
		p2.estadoAtual();
		p2.depositar(400);
		p2.estadoAtual();
	}

}
