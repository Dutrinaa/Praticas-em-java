package b1_prova_teorica_01;
import java.util.Scanner;

public class ContaCorrente {
	private double Numero;
	private double Saldo;

	public ContaCorrente(double s) {
		this.Saldo = s;
	}

	Scanner inAux = new Scanner(System.in);

	public void Depositar() {
		System.out.println("Digite o valor que voce deseja depositar : ");
		this.Numero = inAux.nextInt();
		this.setSaldo(Numero + Saldo);
		System.out.println("O valor foi depositado com sucesso!\n");
	}

	public void Sacar() {
		System.out.println("Digite o valor que voce deseja sacar : ");
		this.Numero = inAux.nextInt();
		
		if (Numero >= Saldo) {
			System.out.println(
					"O valor que voce deseja sacar eh maior do que o que voce tem disponivel, voce tem certeza?");
			System.out.println("Digite 1 para SIM e 0 para NAO");
			
			int x = inAux.nextInt();
			
			if (x == 0) {
				System.out.println("Ok, retornando para o Menu...\n");
				return;
			}
			
			if (x == 1) {
				this.setSaldo(Saldo - Numero);
				System.out.println("O saque foi efetuado com sucesso!\n");
			} 
			
			else {
				System.out.println("O valor digitado foi diferente do esperado, retornando para o Menu...\n");
			}
		}
		
		else {
			this.setSaldo(Saldo - Numero);
			System.out.println("O saque foi efetuado com sucesso!\n");
		}
	}

	public double getNumero() {
		return Numero;
	}

	public void setNumero(double numero) {
		Numero = numero;
	}

	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double saldo) {
		Saldo = saldo;
	}

}
