package b2_exercicios_06;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciamentoConta {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		ArrayList<Conta> Contas = new ArrayList<Conta>();
		int opcao;
		int num;

		do {
			System.out.println("\nO que voce deseja fazer? digite o numero para um dos comandos abaixo.");
			System.out.printf("1 - Cadastrar uma conta\n2 - Sacar\n3 - Depositar\n4 - Imprimir contas\n5 - Sair\n");

			opcao = in.nextInt();

			if (opcao == 1) {
				System.out.println("Digite o numero da conta a ser cadastrada e seu saldo.");
				Conta aux = new Conta(in.nextInt(), in.nextInt());
				Contas.add(aux);
				System.out.println("Conta cadastrada com sucesso!\n");
			}

			else if (opcao == 2) {
				System.out.println("Digite o numero da conta para realizar um saque.");
				num = in.nextInt();
				boolean entrou = false;

				for (int i = 0; i < Contas.size(); i++) {
					if (Contas.get(i).getNumero() == num) {
						System.out.println("\nDigite quanto dinheiro voce deseja sacar.");
						Contas.get(i).setSaldo(Contas.get(i).getSaldo() - in.nextInt());
						System.out.printf("\nSaque efetivado com sucesso!\nSeu Saldo agora eh de R$" + Contas.get(i).getSaldo());
						entrou = true;
						break;
					}
					if (entrou == false)
						System.out.println("\nA conta com esse numero nao existe.");
				}
			}

			else if (opcao == 3) {
				System.out.println("\nDigite o numero da conta para realizar um deposito.");
				num = in.nextInt();
				boolean entrou = false;

				for (int i = 0; i < Contas.size(); i++) {
					if (Contas.get(i).getNumero() == num) {
						System.out.println("\nDigite quanto dinheiro voce deseja depositar.");
						Contas.get(i).setSaldo(Contas.get(i).getSaldo() + in.nextInt());
						System.out.printf("\nDeposito efetivado com sucesso!\nSeu Saldo agora eh de R$" + Contas.get(i).getSaldo());
						entrou = true;
						break;
					}
					if (entrou == false)
						System.out.println("\nA conta com esse numero nao existe.");
				}
			} else if (opcao == 4) {
				System.out.println("Imprimindo dados de todas contas cadastradas...");
				for (int i = 0; i < Contas.size(); i++) {
					System.out.println("Conta numero [" + Contas.get(i).getNumero() + "] - R$" + Contas.get(i).getSaldo());
				}
				
			} else if (opcao == 5) {
				System.out.println("\nFechando o programa...");
			}

		} while (opcao != 5);
		in.close();
	}

}
