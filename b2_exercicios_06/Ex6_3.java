package b2_exercicios_06;

import java.util.Scanner;

public class Ex6_3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int numFunc;
		
		System.out.println("Digite quantos funcionarios a empresa tem");
		numFunc = in.nextInt();
		
		Funcionario funcionario[] = new Funcionario[numFunc];
		
		for(int i = 0; i < funcionario.length; i++) {
			System.out.println("Digite o numero de horas trabalhadas e de dependentes respectivamente");
			funcionario[i] = new Funcionario(i + 1, in.nextInt(), in.nextInt());
			funcionario[i].imprimir(funcionario[i].getCodigo(), funcionario[i].getNumHoras(), funcionario[i].getNumDep());
		}
		
		
		in.close();
	}

}
