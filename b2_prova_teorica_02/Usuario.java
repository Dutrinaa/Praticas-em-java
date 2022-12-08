package b2_prova_teorica_02;
import java.util.Scanner;
import java.util.ArrayList;

public class Usuario extends Pessoa{
	private ArrayList<Contato> contatos = new ArrayList<Contato>();
	Scanner in = new Scanner(System.in);
	
	public Usuario(String nome, String email) {
		super(nome, email);
	}

	public int mostrarMenu(int opcao) {
		System.out.println("\nO que voce deseja fazer?");
		
		System.out.println("1 - Adicionar um contato");
		System.out.println("2 - Exibir lista de contatos");
		System.out.println("3 - Buscar por um contato");
		System.out.println("4 - Remover um contato");
		System.out.println("0 - Sair\n");
		
		opcao = in.nextInt();
		return opcao;
	}

	public void Menu(int opcao) {
		switch (opcao) {
		case 1:
			System.out.println("---Adicionando contato---");
			addContato();
			break;
		case 2:
			System.out.println("---Exibindo contatos---");
			listarCtts();
			break;
		case 3:
			System.out.println("---Buscar por contato---");
			buscaCtt();
			break;
		case 4:
			System.out.println("---Remover contato---");
			removerCtt();
			break;
		case 0:
			System.out.println("Saindo da agenda de contatos...\n");
			break;
		default:
			System.out.println("Opcao digitada invalida, tente novamente.");
			break;
		}
	}
	
	public void addContato() {
		System.out.println("Digite o nome e o email do contato a ser adicionado.");
		Contato ctt = new Contato(in.next(),in.next());
		if(checaEmail(ctt) == true) {
		System.out.println("Digite um numero para o contato " + ctt.getNome() + ".");
		ctt.setNumero(in.nextInt());
		
		contatos.add(ctt);
		System.out.println("O contato foi adicionado com sucesso!\nRetornando ao menu...");
		}
		else {
			System.out.println("O email do especificado ja existe em outro contato.\nRetornando ao menu...");
		}
	}
	
	public void listarCtts() {
		for(int i = 0; i < contatos.size(); i++) {
			System.out.println(contatos.get(i).getNome() + " - " + contatos.get(i).getNumero());
		}
		System.out.println("\nRetornando ao menu...");
	}
	
	public ArrayList<Contato> getContatos() {
		return contatos;
	}
	
	public void buscaCtt() {
		System.out.println("Digite o nome do contato que deseja procurar.");
		String aux = in.next();
		boolean entrou = false;

		for(int i = 0; i < contatos.size(); i++) {
			if(contatos.get(i).getNome().equals(aux)) {
				System.out.println(contatos.get(i).getNome() + " - " + contatos.get(i).getEmail());
				entrou = true;
			}
		}
		if(entrou == false)
		System.out.println("O nome digitado nao esta presente na lista.\nRetornando ao menu...");
	}
	
	public void removerCtt() {
		System.out.println("Digite o email do contato que deseja remover.");
		String aux = in.next();
		
		for(int i = 0; i < contatos.size(); i++) {
			if(contatos.get(i).getEmail().equals(aux)) {
				contatos.remove(i);
				return;
			}
		}
		System.out.println("O email digitado nao esta presente na lista.\nRetornando ao menu...");
	}
	
	public boolean checaEmail(Contato ctt) {
		for(int i = 0; i < contatos.size(); i++) {
			if(contatos.get(i).email.contains(ctt.getEmail())) {
				return false;
			}
		}
		return true;
	}
	
	
	
}


