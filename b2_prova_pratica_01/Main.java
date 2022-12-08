package b2_prova_pratica_01;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Prefeito> prefeitos = new ArrayList<Prefeito>();
		ArrayList<Vereador> vereadores = new ArrayList<Vereador>();
		ArrayList<Eleitor> eleitores = new ArrayList<Eleitor>();

		System.out.println("Iniciando urna...\n");

		// cadastrando prefeitos e vereadores (1)
		System.out.println("Iniciando cadastro dos candidatos.");

		for (int opcao = 1; opcao != 0;) {
			System.out.println("\nDigite 1 para iniciar o cadastro de um candidato ou 0 para prosseguir.");
			opcao = in.nextInt();

			if (opcao == 1) {
				System.out.println("Digite 1 para candidatar um prefeito e 0 para vereador.");
				int aux = in.nextInt();
				in.nextLine(); // buffer clear

				if (aux == 1) {
					System.out.println("Candidatando prefeito...\n");
					System.out.println("Digite o nome, dia, mes e ano que o candidato nasceu respectivamente.");
					Prefeito prefeito = new Prefeito(in.nextLine(), in.nextInt(), in.nextInt(), in.nextInt());
					in.nextLine(); // buffer clear

					System.out.println("Digite o email do candidato.");
					prefeito.setEmail(in.nextLine());

					System.out.println("Digite o codigo de prefeito do candidato.");
					prefeito.setCodigo(in.nextInt());
					in.nextLine(); // buffer clear

					System.out.println("Digite o nome, dia, mes e ano que o vice-prefeito nasceu.");
					prefeito.setViceNome(in.nextLine());
					prefeito.setViceDia(in.nextInt());
					prefeito.setViceMes(in.nextInt());
					prefeito.setViceAno(in.nextInt());
					in.nextLine();
					// buffer clear;

					System.out.println("Digite o email do vice-prefeito.");
					prefeito.setEmail(in.nextLine());

					prefeitos.add(prefeito);

					System.out.println("Prefeito cadastrado com sucesso!\nRetornando...");

				} else if (aux == 0) {
					System.out.println("Candidatando vereador...\n");
					System.out.println("Digite o nome, dia, mes e ano que o candidato nasceu respectivamente.");
					Vereador vereador = new Vereador(in.nextLine(), in.nextInt(), in.nextInt(), in.nextInt());
					in.nextLine(); // buffer clear

					System.out.println("Digite o email do candidato.");
					vereador.setEmail(in.nextLine());

					System.out.println("Digite o codigo de vereador do candidato.");
					vereador.setCodigo(in.nextInt());

					vereadores.add(vereador);

					System.out.println("Vereador cadastrado com sucesso!\nRetornando...");

				} else {
					System.out.println("Numero digitado invalido, retornando...");
					continue;
				}
			}

			else if (opcao == 0) {
				System.out.println("Prosseguindo a eleicao.");
				break;
			} else {
				System.out.println("Numero digitado invalido, retornando...");
				continue;
			}
		}

		// cadastrando eleitores (2)
		System.out.println("\nIniciando cadastro dos eleitores.");

		for (int opcao = 1; opcao != 0;) {
			System.out.println("\nDigite 1 para iniciar o cadastro de um eleitor ou 0 para prosseguir.");
			opcao = in.nextInt();
			in.nextLine(); // buffer clear

			if (opcao == 1) {
				System.out.println("Candidatando eleitor...\n");
				System.out.println("Digite o nome, dia, mes e ano que o candidato nasceu respectivamente.");
				Eleitor eleitor = new Eleitor(in.nextLine(), in.nextInt(), in.nextInt(), in.nextInt());

				System.out.println("Digite o titulo de eleitor do candidato.");
				eleitor.setTitulo(in.nextInt());

				System.out.println("Digite a secao que o candidato esta.");
				eleitor.setSecao(in.nextInt());
				in.nextLine(); // buffer clear

				System.out.println("Digite a zona do candidato.");
				eleitor.setZona(in.nextLine());

				eleitores.add(eleitor);

				System.out.println("Eleitor cadastrado com sucesso!\n Retornando...");
			}

			else if (opcao == 0) {
				System.out.println("Prosseguindo a eleicao.");
				break;
			} else {
				System.out.println("Numero digitado invalido, retornando...");
				continue;
			}
		}

		// Iniciando processo de eleicao (3)
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss a");
		LocalDateTime now = LocalDateTime.now();
		String dateTimeString = now.format(formatter);

		System.out.println("\nEu sou Felipe Dutra da zona Oeste, Secao 5 codigo de eleitor 343563 e estarei\n"
				+ "dando inicio ao processo de eleicao, Ha um total de " + eleitores.size()
				+ " eleitores nessa secao.\n" + "comecando votacao agora exatemente " + dateTimeString);

		// Comparecendo para votacao e votando (4...)
		int i = 0;
		int nulosVer = 0;
		int nulosPref = 0;
		do {
			System.out.println("--Eleitor de titulo " + eleitores.get(i).getTitulo() + ".--");
			System.out.println("Digite o codigo de um dos candidatos a prefeito abaixo para votar.\n");

			for (int j = 0; j < prefeitos.size(); j++) {
				System.out.println(prefeitos.get(j).getNome() + " - " + prefeitos.get(j).getCodigo());
			}
			System.out.println("Em branco - 99");

			int voto = in.nextInt();

			System.out.println("\nVoce tem certeza que deseja votar no numero " + voto
					+ "?\nDigite 1 para confirmar e 0 para cancelar.");

			int confirmar = in.nextInt();

			if (confirmar == 1)
				for (int x = 0; x < prefeitos.size(); x++) {
					if (voto == 99) {
						System.out.println("\nVoce votou em branco com sucesso!");
						nulosPref++;
						break;
					} else if (prefeitos.get(x).getCodigo() == voto) {
						prefeitos.get(x).setVotos(prefeitos.get(x).getVotos() + 1);
						System.out.println("\nSeu voto foi registrado com sucesso no candidato "
								+ prefeitos.get(x).getNome() + " - " + prefeitos.get(x).getCodigo());
						break;
					}
				}
			else {
				System.out.println("Voto cancelado com sucesso, retornando...");
				continue;
			}
			i++;
		} while (i < eleitores.size());

		System.out.println("\nFinalizada a votacao para prefeitos iniciaremos a votacao para os vereadores.\n");

		int k = 0;
		do {
			System.out.println("--Eleitor de titulo " + eleitores.get(k).getTitulo() + ".--");
			System.out.println("Digite o codigo de um dos candidatos a vereador abaixo para votar.\n");

			for (int j = 0; j < vereadores.size(); j++) {
				System.out.println(vereadores.get(j).getNome() + " - " + vereadores.get(j).getCodigo());
			}
			System.out.println("Em branco - 9999");

			int voto = in.nextInt();

			System.out.println("\nVoce tem certeza que deseja votar no numero " + voto
					+ "?\nDigite 1 para confirmar e 0 para cancelar.");

			int confirmar = in.nextInt();

			if (confirmar == 1)
				for (int x = 0; x < vereadores.size(); x++) {
					if (voto == 9999) {
						System.out.println("\nVoce votou em branco com sucesso!");
						nulosVer++;
						break;
					} else if (vereadores.get(x).getCodigo() == voto) {
						vereadores.get(x).setVotos(prefeitos.get(x).getVotos() + 1);
						System.out.println("\nSeu voto foi registrado com sucesso no candidato "
								+ vereadores.get(x).getNome() + " - " + vereadores.get(x).getCodigo());
						break;
					}
				}
			else {
				System.out.println("Voto cancelado com sucesso, retornando...");
				continue;
			}
			k++;
		} while (k < eleitores.size());

		System.out.println("Todas votacoes foram finalizadas, imprimindo os votos...");
		System.out.println("Hora do final das votacoes : " + dateTimeString);

		int maisVotosPref = 0;
		int salvarPosPref = 0;

		System.out.println("Imprimindo resultados das eleicoes para prefeito...\n");

		for (int y = 0; y < prefeitos.size(); y++) {
			System.out.println(prefeitos.get(y).getNome() + " - " + prefeitos.get(y).getCodigo() + " | "
					+ prefeitos.get(y).getVotos() + " Votos.");
			if (prefeitos.get(y).getVotos() > maisVotosPref) {
				maisVotosPref = prefeitos.get(y).getVotos();
				salvarPosPref = y;
			}
		}

		System.out.println("Nulo - 99 | " + nulosPref);

		int maisVotosVer = 0;
		int salvarPosVer = 0;

		System.out.println("Imprimindo resultados das eleicoes para vereador...\n");

		for (int y = 0; y < vereadores.size(); y++) {
			System.out.println(vereadores.get(y).getNome() + " - " + vereadores.get(y).getCodigo() + " | "
					+ vereadores.get(y).getVotos() + " Votos.");
			if (vereadores.get(y).getVotos() > maisVotosVer) {
				maisVotosVer = vereadores.get(y).getVotos();
				salvarPosVer = y;
			}
		}
		
		System.out.println("Nulo - 9999 | " + nulosVer);
		
		System.out.println("O mais novo prefeito da cidade eh o " + prefeitos.get(salvarPosPref).getNome() + " com " + prefeitos.get(salvarPosPref).getVotos() + " votos parabens!!!");
		System.out.println("O mais novo vice-prefeito da cidade eh o " + prefeitos.get(salvarPosPref).getViceNome() + " com " + prefeitos.get(salvarPosPref).getVotos() + " votos parabens!!!");
		System.out.println("O mais novo vereador da cidade eh o " + vereadores.get(salvarPosVer).getNome() + " com " + vereadores.get(salvarPosVer).getVotos() + " votos parabens!!!");

		in.close();
	}

}
