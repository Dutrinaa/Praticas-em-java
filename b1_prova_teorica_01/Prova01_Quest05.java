package b1_prova_teorica_01;
import java.util.Scanner;

public class Prova01_Quest05 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		int m[][] = new int[5][2];
		
		System.out.println("Digite a matricula e a nota dos " + m.length + " alunos");
		
		for(int i = 0; i < m.length; i++) {
			System.out.printf("Digite a matricula do aluno : ");
			m[i][0] = in.nextInt();
			System.out.printf("Agora digite a nota dele, pode variar de 0 a 10 :");
			m[i][1] = in.nextInt();
		}
		
		System.out.println("Os alunos que obtiveram nota a cima da media sao :");
		System.out.println("Matricula -- Nota");
		
		for(int i = 0; i < m.length; i++) {
			if(m[i][1] >= 6)
				System.out.println("----" + m[i][0] + "---- -- -" + m[i][1] + "-");
		}
		in.close();
	}
}








