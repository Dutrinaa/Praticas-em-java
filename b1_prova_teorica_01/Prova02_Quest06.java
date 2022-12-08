package b1_prova_teorica_01;
import java.util.Scanner;

public class Prova02_Quest06 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int menu;
		
		ContaCorrente conta = new ContaCorrente(0);
		
		do {
			System.out.println("O saldo da conta eh R$" + conta.getSaldo() + ".");
			
			System.out.println("Selecione uma das opcoes abaixo :");
			System.out.println("1 - Depositar");
			System.out.println("2 - Sacar");
			System.out.println("3 - Sair");
			
			menu = in.nextInt();
			
			switch(menu) {
			case 1:
				conta.Depositar();
				break;
			case 2:
				conta.Sacar();
				break;
			case 3:
				System.out.println("Saindo da conta...");
				break;
			default:
				System.out.println("Opcao selecionada invalida, tente novamente.\n");
			}
		} while(menu != 3);
			
		in.close();
	}
}
