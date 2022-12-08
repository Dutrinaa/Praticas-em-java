package b1_exercicios_02;

import java.util.Random;

public class Ex2_3 {

	public static void main(String[] args) {
		int M[][] = new int[4][4];
		int maior = 0;

		Random numAleatorio = new Random();

		for (int l = 0; l < M.length; l++) {
			for (int c = 0; c < M.length; c++) {
				M[l][c] = numAleatorio.nextInt(10);
			}
		}

		for (int l = 0; l < M.length; l++) {
			for (int c = 0; c < M.length; c++) {
				if (M[l][c] > maior)
					maior = M[l][c];
			}
		}

		for (int l = 0; l < M.length; l++) {
			for (int c = 0; c < M.length; c++) {
				if (M[l][c] == maior)
					System.out.println(
							"O maior numero(" + maior + ") se encontra na linha " + l + " e na coluna " + c + ".");
			}
		}

		for (int l = 0; l < M.length; l++) {
			for (int c = 0; c < M.length; c++) {
				System.out.print("| " + M[l][c] + " |");
			}
			System.out.println("");
		}
	}
}
