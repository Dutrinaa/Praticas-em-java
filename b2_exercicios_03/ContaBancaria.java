package b2_exercicios_03;

public class ContaBancaria {
	private String nomeCliente;
	private int numConta$;
	private double saldo$;
	
	double saque = 100.00;
	double deposito = 150.00;
	
	public ContaBancaria(String nomeCliente, int numConta$) {
		this.nomeCliente = nomeCliente;
		this.numConta$ = numConta$;
	}
	
	public void sacar() {
		System.out.println("\nSacando R$" + this.saque + "...");
		
		if(this.saque > this.saldo$) {
			System.out.println("Dinheiro indisponivel para saque.");
		}
		
		else {
		this.saldo$ = this.saldo$ - this.saque;
		System.out.println("Saque efetuado, o saldo atual eh de R$" + this.saldo$ + ".");
		}
	}
	
	public void depositar() {
		System.out.println("\nDepositando R$" + this.deposito + "...");
		this.saldo$ = this.saldo$ + this.deposito;
		System.out.println("O saldo atual eh de R$" + this.saldo$ + ".");
	}
	
	public void imprimirDados() {
		System.out.println("\nNome do cliente : " + this.nomeCliente);
		System.out.println("Numero da conta : " + this.numConta$);
		System.out.println("Saldo da conta  : " + this.saldo$);
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getNumConta$() {
		return numConta$;
	}

	public void setNumConta$(int numConta$) {
		this.numConta$ = numConta$;
	}

	public double getSaldo$() {
		return saldo$;
	}

	public void setSaldo$(double saldo$) {
		this.saldo$ = saldo$;
	}

	

}
