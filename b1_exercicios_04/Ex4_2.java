package b1_exercicios_04;

import java.util.Scanner;

public class Ex4_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		 Contato c1 = new Contato("Felipe");
		 Contato c2 = new Contato("Mateus");
		 Contato c3 = new Contato("Pedro");
		 
		 c1.setTelefone("123");
		 c2.setTelefone("456");
		 c3.setTelefone("789");
		 
		 c1.imprimir();
		 c2.imprimir();
		 c3.imprimir();
		 
		 System.out.println("Digite um novo nome para o Contato 2 que no momento eh : " + c2.getNome());
		 c2.setNome(in.nextLine());
		 System.out.println("O contato agora ficou como :");
		 c2.imprimir();
		 
		 System.out.println("Digite um novo numero para o Contato 3 que no momento eh : " + c3.getTelefone());
		 c3.setNome(in.nextLine());
		 System.out.println("O contato agora ficou como :");
		 c3.imprimir();
		 
		 in.close();
		 } 

	}
