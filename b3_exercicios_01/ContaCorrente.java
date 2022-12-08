package b3_exercicios_01;

public class ContaCorrente extends Conta{
	
	public ContaCorrente(String nome, int conta, int agencia, double saldo, int senha) {
		super(nome, conta, agencia, saldo, senha);
	}

	@Override
	protected void imprimir() {
		System.out.println("--Dados da conta selecionada--");
		System.out.println("Nome : " + this.getNome());
		System.out.println("Numero da Agencia : " + this.getAgencia());
		System.out.println("Numero da Conta : " + this.getConta());
		System.out.println("Saldo da Conta : R$" + this.getSaldo());
	}

}
