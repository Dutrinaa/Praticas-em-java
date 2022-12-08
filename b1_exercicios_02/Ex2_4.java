package b1_exercicios_02;

import java.util.Scanner;

public class Ex2_4 {

	public static void main(String[] args) {
		int M[][] = new int[3][3];
		int par = 0; 
		int impar = 0;

		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite os numeros da matriz");

		for (int l = 0; l < M.length; l++) {
			for (int c = 0; c < M.length; c++) {
				M[l][c] = in.nextInt();

				if (M[l][c] % 2 == 0) {
					par++;
				} else {
					impar++;
				}
			}
		}

		System.out.println("Na matriz existem " + par + " numeros pares e " + impar + " impares.");

		for (int l = 0; l < M.length; l++) {
			for (int c = 0; c < M.length; c++) {
				System.out.print("| " + M[l][c] + " |");
			}
			System.out.println("");
		}

		in.close();

	}
}
