package b1_exercicios_04;

import java.util.Scanner;

public class Ex4_1 {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 
		 System.out.println("Indique os valores do terceiro ponto");
		 
		 Ponto p = new Ponto(2,3);
		 Ponto pInverso = new Ponto(p.getY(), p.getX());
		 Ponto pNovo = new Ponto(in.nextInt(), in.nextInt());
		 
		 p.imprimir();
		 pInverso.imprimir();
		 pNovo.imprimir();
		 
		 System.out.println("Digite novos valores para o ponto 3");
		 
		 pNovo.setX(in.nextInt());
		 pNovo.setY(in.nextInt());
		 
		 pNovo.imprimir();
		 
		 in.close();
		 } 
	}

