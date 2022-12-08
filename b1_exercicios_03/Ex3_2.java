package b1_exercicios_03;

import java.util.Scanner;

public class Ex3_2 {

	public static void main(String[] args) {
		int m[][] = new int[6][6];
		int maiores = 0;

		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite os valores que prencherao a matriz.");

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				m[i][j] = in.nextInt();
			}
		}

		System.out.println("Digite o valor de n.");
		int n = in.nextInt();
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				if(m[i][j] > n) {
					System.out.println("O numero " + m[i][j] + " que eh maior que " + n + " eh encontrado na linha " + i + " coluna " + j + ".");
					maiores++;
				}
			}
		}
		
		if(maiores == 0)
			System.out.println("Nao ha nenhum numero maior que " + n + " na matriz.");
		else
			System.out.println("Ha " + maiores + " numero maiores que " + n + " na matriz.");
		
		in.close();
	}
}
