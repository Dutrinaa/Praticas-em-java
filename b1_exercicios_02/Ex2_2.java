package b1_exercicios_02;

import java.util.Scanner;

public class Ex2_2 {

	public static void main(String[] args) {
		int[] v1 = new int[15];
		int[] v2 = new int[15];
		int[] v3 = new int[15];
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite os 10 numeros de cada vetor");
		
		for(int i = 0; i < v1.length; i++) {
			v1[i] = in.nextInt();
			v2[i] = in.nextInt();
			v3[i] = v1[i] + v2[i];
		}
		for(int i = 0; i < v1.length; i++) {
			System.out.println("O terceiro vetor na posicao" + i + " = " + v3[i]);
		}
		in.close();
	}
}
