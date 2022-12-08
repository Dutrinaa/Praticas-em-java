package b1_exercicios_04;

import java.util.Scanner;

public class Ex4_3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double aumentoSalario;
		
		Professor p1 = new Professor("Maffort");
		System.out.println("Digite o salario do " + p1.getNome() + ".");
		p1.setSalario(in.nextDouble());
		
		Professor p2 = new Professor("Vitor");
		System.out.println("Digite o salario do " + p2.getNome() + ".");
		p2.setSalario(in.nextDouble());
		
		Professor p3 = new Professor("Silvia");
		System.out.println("Digite o salario do " + p3.getNome() + ".");
		p3.setSalario(in.nextDouble());
		
		Professor p4 = new Professor("Denise");
		System.out.println("Digite o salario do " + p4.getNome() + ".");
		p4.setSalario(in.nextDouble());
		
		Professor p5 = new Professor("Paulo");
		System.out.println("Digite o salario do " + p5.getNome() + ".");
		p5.setSalario(in.nextDouble());
		
		System.out.println("Digite o numero do aumento salarial em porcentagem dos professores.");
		aumentoSalario = in.nextDouble();
		
		p1.imprimir(aumentoSalario);
		p2.imprimir(aumentoSalario);
		p3.imprimir(aumentoSalario);
		p4.imprimir(aumentoSalario);
		p5.imprimir(aumentoSalario);
		
		
		in.close();

	}

}
