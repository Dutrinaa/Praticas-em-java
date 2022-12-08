package b2_exercicios_03;

public class ContaPoupanca extends ContaBancaria{
	private double diaRendimento;
	
	double saque = 100.00;
	double deposito = 150.00;

	public ContaPoupanca(String nomeCliente, int numConta$, double diaRendimento) {
		super(nomeCliente, numConta$);
		this.diaRendimento = diaRendimento;
	}
	
	public void calcularNovoSaldo() {
		System.out.println("Aplicando rendimento diario de %" + this.diaRendimento * 100 + "...");
		this.setSaldo$(this.getSaldo$() + (this.getSaldo$() * this.diaRendimento));
		System.out.println("O saldo atual eh de R$" + this.getSaldo$() + ".");
	}

	public double getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(double diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
}
