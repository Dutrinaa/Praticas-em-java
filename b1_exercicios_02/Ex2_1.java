package b1_exercicios_02;

import java.util.Scanner;

public class Ex2_1 {

	public static void main(String[] args) {
		int[] v1 = new int[15];
		int[] v2 = new int[15];
		
		Scanner in = new Scanner(System.in);

	    System.out.println("Informe os 15 numeros do vetor");
	    
		for (int i = 0; v1.length < 15; i++) {
			v1[i] = in.nextInt();
			v2[i] = v1[i] * v1[i];
		}
		
		for(int i = 0; i < v1.length; i++) {
			System.out.println("vetor 1 na posicao " + i + " = " + v1[i]);
			System.out.println("vetor 2 na posicao " + i + " = " + v2[i]);
		}	
		in.close();
	}
}
