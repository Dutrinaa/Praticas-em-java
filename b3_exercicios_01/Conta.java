package b3_exercicios_01;

import java.util.Scanner;

public abstract class Conta {
	protected String nome;
	protected int conta;
	protected int agencia;
	protected double saldo;
	protected int senha;
	
	public Conta(String nome, int conta, int agencia, double saldo, int senha) {
		this.nome = nome;
		this.conta = conta;
		this.agencia = agencia;
		this.saldo = saldo;
		this.senha = senha;
	}
	
	Scanner in = new Scanner(System.in);

	protected abstract void imprimir();
	
	private int menu() {
		int opcao;
		System.out.println("Digite a opcao do que deseja fazer :");
		System.out.println("1 - Consultar saldo");
		System.out.println("2 - Fazer um saque");
		System.out.println("3 - Fazer um deposito");
		System.out.println("0 - Sair");
		
		opcao = in.nextInt();
		in.nextLine(); //buffer clear
		
		return opcao;
	}

	private void switchCase(int opcao) {
		switch (opcao) {
		case 1:
			System.out.println("Informe a senha : ");
			if(in.nextInt() == this.getSenha()) {
				System.out.println("Saldo da conta : R$" + this.getSaldo());
				break;
			}
			else {
				System.out.println("Senha errada,tente novamente.\nRetornando...");
				break;
			}
		case 2:
			System.out.println("Informe a senha : ");
			if(in.nextInt() == this.getSenha()) {
				System.out.println("Digite o valor do saque a ser realizado");
				this.setSaldo(this.getSaldo() - in.nextDouble());
				System.out.println("Saque realizado com sucesso!\nSaldo atual : R$"  + this.getSaldo() + "\nRetornando...");
				break;
			}
			else {
				System.out.println("Senha errada,tente novamente.\nRetornando...");
				break;
			}
		case 3:
			System.out.println("Informe a senha : ");
			if(in.nextInt() == this.getSenha()) {
				System.out.println("Digite o valor do deposito a ser realizado");
				this.setSaldo(this.getSaldo() + in.nextDouble());
				System.out.println("Deposito realizado com sucesso!\nSaldo atual : R$"  + this.getSaldo() + "\nRetornando...");
				break;
			}
			else {
				System.out.println("Senha errada,tente novamente.\nRetornando...");
				break;
			}
		case 0:
		
		}
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double d) {
		this.saldo = d;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	
	
	
}
