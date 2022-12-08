package b1_prova_pratica_01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int itemComprar;
		int qtdComprar = 0;
		
		Produto produto[] = new Produto[4];
		produto[0] = new Produto("Cooler para processador", 40);
		produto[1] = new Produto("Mouse Gamer sem fio", 70);
		produto[2] = new Produto("Teclado / mouse fio", 125);
		produto[3] = new Produto("Monitor LED 24", 692);
		
		System.out.println("Menu de compras :\n");
		System.out.println("1 - Cooler para processador");
		System.out.println("2 - Mouse Gamer sem fio");
		System.out.println("3 - Teclado / mouse fio");
		System.out.println("4 - Monitor LED 24\n");
		
		Item item[] = new Item[4];
		
		for(int i = 0; i <= 3; i++) {
			item[i] = new Item(0);
		}
			
		for(int i = 0; i < 3; i++) {
			System.out.printf("Digite o codigo do item que voce deseja comprar : ");
			itemComprar = in.nextInt();
		
			if(itemComprar > 4 || itemComprar < 1) {
				System.out.println("O codigo do item digitado nao se encontra no menu.");
				in.close();
				return;
			}
			else {
				System.out.printf("Digite quantos desse item voce quer comprar : ");
				qtdComprar = in.nextInt();
				item[itemComprar - 1].setQtdItem(qtdComprar);			
			}
			if(i == 2)
				System.out.println("\nGerado Fatura, Aguarde um instante...\n");
			else
				System.out.println("\nProximo produto...");
		}
		
		Fatura fatura = new Fatura(item[0],item[1],item[2],item[3]);
		
		fatura.gerarFatura();
		
			in.close();

	}
}