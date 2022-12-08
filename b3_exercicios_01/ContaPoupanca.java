package b3_exercicios_01;

public class ContaPoupanca extends Conta{
	
	private int limiteChequeEspecial;
	
	public ContaPoupanca(String nome, int conta, int agencia,double saldo, int limiteChequeEspecial, int senha) {
		super(nome, conta, agencia, saldo, senha);
		this.limiteChequeEspecial = limiteChequeEspecial;
	}

	@Override
	protected void imprimir() {
		System.out.println("--Dados da conta selecionada--");
		System.out.println("Nome : " + this.getNome());
		System.out.println("Numero da Agencia : " + this.getAgencia());
		System.out.println("Numero da Conta : " + this.getConta());
		System.out.println("Limite do Cheque Especial : R$" + this.getLimiteChequeEspecial());
		System.out.println("Saldo da Conta : R$" + this.getSaldo());
	}

	public int getLimiteChequeEspecial() {
		return limiteChequeEspecial;
	}

	public void setLimiteChequeEspecial(int limiteChequeEspecial) {
		this.limiteChequeEspecial = limiteChequeEspecial;
	}
	
	

}
