package b1_exercicios_03;

import java.util.Scanner;

public class Ex3_1 {

	public static void main(String[] args) {
		int m[][] = new int[10][10];
		int maior = 0;

		Scanner in = new Scanner(System.in);

		System.out.println("Digite os numeros que prencherao a matriz.");

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				m[i][j] = in.nextInt();
				if (m[i][j] > maior)
					maior = m[i][j];
			}
		}
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				if (m[i][j] == maior)
					System.out.println("O maior numero(" + maior + ") eh encontrado na linha " + i + " e coluna " + j + ".");
			}
		}
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				System.out.print(m[i][j] + " || ");
			}
			System.out.println("");
		}
		in.close();
	}
}
