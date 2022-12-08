package b1_exercicios_03;

import java.util.Scanner;

public class Ex3_4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int m[][] = new int[5][5];
		int maux[][] = new int[5][5];

		System.out.println("Digite os valores que irao compor a matriz.");

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				m[i][j] = in.nextInt();
			}
		}
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				maux[i][j] = m[(m.length - 1) - j][(m.length - 1) - i];
			}
		}
		
		System.out.println("A matriz original era :");
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				System.out.print(m[i][j] + " || ");
			}
			System.out.println("");
		}
		
		System.out.println("A matriz apos a alteracao ficou da seguinte maneira :");
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				System.out.print(maux[i][j] + " || ");
			}
			System.out.println("");
		}
		
		in.close();
	}
}
