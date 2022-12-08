package b3_exercicios_02;

import java.util.ArrayList;
import java.util.Scanner;

import b2_prova_teorica_02.Usuario;

public class Main {

	public static void main(String[] args) {
		ArrayList<Empregado> empregados = new ArrayList<Empregado>();
		Scanner in = new Scanner(System.in);

		int opcao;

		do {
			System.out.println("Selecione uma das opcoes abaixo :");
			System.out.println("1 - Cadastrar empregado que recebe por hora.");
			System.out.println("2 - Cadastrar empregado que recebe por comissao.");
			System.out.println("3 - Cadastrar empregado que recebe por hora e comissao.");
			System.out.println("0 - Imprimir folha de pagamento dos empregados\n");

			opcao = in.nextInt();
			in.nextLine(); //buffer clear

			switch (opcao) {
			case 0:
				System.out.println("Saindo do cadastro de contas...\n");
				break;
			case 1:
				System.out.println("Digite o nome do funcionario");
				empregados.add(new PorHora(in.nextLine()));
				System.out.println("Digite o valor das horas que o funcionario trabalhou");
				((PorHora) empregados.get(empregados.size() - 1)).setValorHora(in.nextInt());
				System.out.println("Digite o numero de horas que o funcionario trabalhou");
				((PorHora) empregados.get(empregados.size() - 1)).setNumeroHoras(in.nextInt());
				in.nextLine(); //buffer clear
				System.out.println("Funcionario cadastrado!\n");
				break;

			case 2:
				System.out.println("Digite o nome do funcionario");
				empregados.add(new PorComissao(in.nextLine()));
				System.out.println("Digite o valor das vendas desse funcionario");
				((PorComissao) empregados.get(empregados.size() - 1)).setValorVendas(64654);
				System.out.println("Funcionario cadastrado!\n");
				break;

			case 3:
				System.out.println("Digite o nome do funcionario");
				empregados.add(new PorHoraComissao(in.nextLine()));
				System.out.println("Digite o valor das vendas desse funcionario");
				((PorHoraComissao) empregados.get(empregados.size() - 1)).setValorVendas(64654);
				System.out.println("Digite o valor das horas que o funcionario trabalhou");
				((PorHoraComissao) empregados.get(empregados.size() - 1)).setValorHora(in.nextInt());
				System.out.println("Digite o numero de horas que o funcionario trabalhou");
				((PorHoraComissao) empregados.get(empregados.size() - 1)).setNumeroHoras(in.nextInt());
				in.nextLine(); //buffer clear
				System.out.println("Funcionario cadastrado!\n");
				break;

			default:
				System.out.println("Opcao selecionada invalida, tente novamente.\n");
				continue;
			}

		} while (opcao != 0);

		in.close();

	}

}
