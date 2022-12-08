package b2_prova_teorica_02;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		Scanner in = new Scanner(System.in);

		usuarios.add(new Usuario("Dutra", "dutrinaa@gmail.com"));
		usuarios.add(new Usuario("Mateus", "mateus@gmail.com"));
		usuarios.add(new Usuario("Pedro", "pedro@gmail.com"));
		usuarios.add(new Usuario("Lara", "lara@gmail.com"));

		System.out.println("Iniciado agenda de contatos...\n");

		int opcao;
		Usuario login;

		while (true) {

			System.out.println("Selecione o numero do usuario que deseja acessar ou 0 para sair da agenda.");

			for (int i = 0; i < usuarios.size(); i++) {
				System.out.println((i + 1) + " - " + usuarios.get(i).getNome());
			}

			opcao = in.nextInt();
				if(opcao == 0)
					break;
			opcao = opcao - 1;
			login = usuarios.get(opcao);
			opcao = 99;

			do {
				opcao = login.mostrarMenu(opcao);
				in.nextLine(); //buffer clear
				login.Menu(opcao);

			} while (opcao != 0);
		}

		System.out.println("\nFechando a agenda de contatos...");
		
		in.close();
	}

}
