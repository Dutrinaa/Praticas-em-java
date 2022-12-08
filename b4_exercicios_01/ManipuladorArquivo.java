package b4_exercicios_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ManipuladorArquivo {
	private final String caminhoArquivo;

	public ManipuladorArquivo(String caminhoArquivo) {
		this.caminhoArquivo = caminhoArquivo;
	}

	public String lerTudo() throws IOException, FileNotFoundException {
		FileReader fileReader = new FileReader(caminhoArquivo);
		BufferedReader readerf = new BufferedReader(fileReader);
		String linha = readerf.readLine();
		StringBuilder construtorString = new StringBuilder();
		while (linha != null) {
			construtorString.append(linha);
			construtorString.append("\n");
			linha = readerf.readLine();
		}
		readerf.close();

		return construtorString.toString();
	}

	public void escrever(String texto, boolean apagarConteudoArquivo) throws IOException {
		FileWriter fw = new FileWriter(caminhoArquivo, !apagarConteudoArquivo);
		BufferedWriter fwriter = new BufferedWriter(fw);
		fwriter.write(texto + "\n");
		fwriter.close();
	}

	public void escrever(String texto) throws IOException {
		escrever(texto, false);
	}

	public static void main(String[] args) {
		try {
			int opcao = 0;
			String caminho = "C:\\Users\\Felipe Dutra\\OneDrive\\Desktop";// altere o diretório onde o arquivo será salvo Obs: eu alterei o caminho para fazer os testes
													// no programa, apenas voltei ao camihno que voce indicou para enviar e voce testar
			ManipuladorArquivo manipuladorArquivo = new ManipuladorArquivo(caminho);
			Scanner scanner = new Scanner(System.in);
			
			while(true) {
				System.out.println("Digite o numero da opcao desejada");
				System.out.println("1 - Ver todo conteudo do arquivo");
				System.out.println("2 - Adicionar linha no final do arquivo");
				System.out.println("0 - Sair do programa");
				opcao = scanner.nextInt();
				scanner.nextLine(); //buffer clear
				
				if(opcao == 1) {
					System.out.println("Conteúdo do aquivo: \n" + manipuladorArquivo.lerTudo());
					System.out.println("Voltando ao menu...");
				}
				else if(opcao == 2) {
					System.out.println("Digite uma informação para ser inserida ao arquivo: ");
					manipuladorArquivo.escrever(scanner.nextLine());
					System.out.println("Informacao inserida com Sucesso!\nVoltando ao menu...");
				}
				else if(opcao == 0) {
					System.out.println("Saindo do programa...");
					break;
				}
				else {
					System.out.println("Opcao digitada invalida.\nVoltando ao menu...");
				}
			}
		} catch (IOException ex) {
			System.out.println("Erro: " + ex.getMessage());
		}
	}
}