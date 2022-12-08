package b1_exercicios_03;

import java.util.Scanner;

public class Ex3_3 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o valor de x.");
		
		int x = in.nextInt();
		int m[][] = new int[10][10];
		int pl = -1;
		int pc = -1;
		
		System.out.println("Digite os valores que irao compor a matriz.");

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				m[i][j] = in.nextInt();
				if (m[i][j] == x) {
					pl = i;
					pc = j;
				}
			}
		}
		
		if(pl == -1)
			System.out.println("O valor " + x + " nao foi encontrado na matriz.");
		else
			System.out.println("O valor " + x + " foi encontrado na linha " + pl + " coluna " + pc + ".");
		
		in.close();
	}
}
