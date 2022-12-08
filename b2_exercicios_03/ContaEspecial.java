package b2_exercicios_03;

public class ContaEspecial extends ContaBancaria{
	private double limite;
	
	double saque = 250.00;
	double deposito = 150.00;

	public ContaEspecial(String nomeCliente, int numConta$, double limite) {
		super(nomeCliente, numConta$);
		this.limite = limite;
	}
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	@Override
	public void sacar() {
		System.out.println("\nSacando R$" + this.saque + "...");
		
		if(this.saque > this.getSaldo$() + this.limite) {
			System.out.println("Dinheiro indisponivel para saque.");
		}
		
		else {
		this.setSaldo$(this.getSaldo$() - this.saque);
		System.out.println("Saque efetuado, o saldo atual eh de R$" + this.getSaldo$() + ".");
		}
	}

	
	
}
