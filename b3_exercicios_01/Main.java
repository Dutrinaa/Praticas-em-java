package b3_exercicios_01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<ContaCorrente> contasCorrente = new ArrayList<ContaCorrente>();
		ArrayList<ContaPoupanca> contasPoupanca = new ArrayList<ContaPoupanca>();
		
		Scanner in = new Scanner(System.in);
		int opcao;
		int auxA = 0;
		int auxN = 0;
		boolean entrou = false;
		
		contasCorrente.add(new ContaCorrente("Felipe", 123456, 9876, 5000.0, 55155));
		contasPoupanca.add(new ContaPoupanca("Mateus", 654321, 6789, 3000.0, -2000,55155));
		
		System.out.println("Registrando contas...");
		
		do {
			System.out.println("Digite o numero para selecionar uma das opcoes abaixo :");
			System.out.println("1 - Registrar conta corrente");
			System.out.println("2 - Registrar conta poupanca");
			System.out.println("0 - Sair do registro de contas");
			opcao = in.nextInt();
			in.nextLine(); //buffer clear
			
			if(opcao == 1) {
				System.out.println("Para registrar uma conta corrente digite em ordem :\nO nome da conta, numero, agencia, saldo inicial e senha.");
				contasCorrente.add(new ContaCorrente(in.nextLine(), in.nextInt(), in.nextInt(), in.nextFloat(), in.nextInt()));
				in.nextLine(); //buffer clear
				System.out.println("Conta registrada com sucesso\n");
			}
			else if(opcao == 2) {
				System.out.println("Para registrar uma conta poupanca digite em ordem :\nO nome da conta, numero, agencia, saldo inicial, limite de cheque especial e senha.");
				contasPoupanca.add(new ContaPoupanca(in.nextLine(), in.nextInt(), in.nextInt(), in.nextFloat(),in.nextInt(), in.nextInt()));
				in.nextLine(); //buffer clear
				System.out.println("Conta registrada com sucesso\n");
				
			}
		} while (opcao != 0);
			System.out.println("\nSaindo do registro de contas...");
			
			
			System.out.println("Informe o numero e a agencia da conta que voce deseja acessar :");
			auxA = in.nextInt();
			auxN = in.nextInt();
			for(int i = 0; i < contasCorrente.size(); i++) {
				if(contasCorrente.get(i).getConta() == auxN && contasCorrente.get(i).getAgencia() == auxA) {
					entrou = true;
					auxA = i;
					auxN = 0;
				}
			}
			for(int i = 0; i < contasPoupanca.size(); i++) {
				if(contasPoupanca.get(i).getConta() == auxN && contasPoupanca.get(i).getAgencia() == auxA) {
					entrou = true;
					auxA = i;
					auxN = 1;
				}
			}
			if(entrou == false) {
				System.out.println("Nao ha nenhuma conta com essas especificacoes.\nSaindo...");
				System.exit(0);
			}
			else {
				if(auxN == 0) { //corrente
					contasCorrente.get(auxA).imprimir();
					do {
						
					} while (opcao != 0);
				}
				else if(auxN == 1) { //poupanca
					
				}
			}	
		
	}

}
