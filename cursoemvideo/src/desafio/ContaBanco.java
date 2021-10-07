package desafio;

public class ContaBanco {

	public int numConta;
	protected String tipoConta;
	private String dono;
	private float saldo;
	private boolean status;
	
	public void estadoAtual() {
		System.out.println("--------------------------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipoConta());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
		
	}

	public ContaBanco() {
		this.setStatus(false);
		this.setSaldo(0);
	}
	
	public int numeroDaConta(int n) {
		this.setNumConta(n);
		return n;
	}

	public void abrirConta(String tipo) {
		this.setTipoConta(tipo);
		this.setStatus(true);
		if(tipo.equals("CC")) {
			this.setSaldo(50);
		}else if(tipo.equals("CP")) {
			this.setSaldo(150);
		}
	}

	public void fecharConta() {
		if(this.getSaldo() > 0) {
			System.out.println("Conta com dinheiro");
		} else if(this.getSaldo() < 0) {
			System.out.println("Conta com débito");;
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucessso!");
		}
	}

	public void depositar(float v) {
		if(this.getStatus()) {
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Deposito realizado na conta de " + this.getDono());
		} else {
			System.out.println("Impossível depositar em uma conta fechada!");
		}
	}

	public void sacar(float s) {
		if(this.getStatus()) {
			if(this.getSaldo() >= s) {
				this.setSaldo(this.getSaldo() - s);
				System.out.println("Saque quealizado na conta de " + this.getDono());
			}else {
				System.out.println("Saldo insuficiente para saque!");
			}
		} else {
			System.out.println("Impossível sacar de uma conta fechada!");
		}
	}

	public void pagarMensal() {
		int v = 0;
		if(this.getTipoConta().equals("CC")) {
			v = 12;
		} else if(this.getTipoConta().equals("CP")) {
			v = 20;
		}
		
		if(this.getStatus()) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Mensalidade paga com sucesso por " + this.getDono());
		} else {
			System.out.println("Impossível sacar de uma conta fechada!");
		}

	}

	// Getters e Setters
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	

}
