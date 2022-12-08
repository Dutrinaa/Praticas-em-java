package b2_exercicios_01;

import java.util.Scanner;

public class Ex5_1e2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Data data = new Data();
		Hora horario = new Hora();
		
		int aux;
		
		System.out.println("Deseja testar a validade da Data ou do Horario?");
		
		do {
			System.out.printf("Digite 0 para Data e 1 para Horario : ");
			aux = in.nextInt();
		
			if(aux == 0) {
				System.out.printf("Digite o dia :");
				data.setDia(in.nextInt());
				
				System.out.printf("Digite o mes :");
				data.setMes(in.nextInt());
				
				System.out.printf("Digite o ano :");
				data.setAno(in.nextInt());
				
				if(data.getDia() >= 31) {
					System.out.println("Dia digitado invalido, tente novamente.");
					aux = 2;
				}
				
				else if(data.getMes() >= 12) {
					System.out.println("Mes digitado invalido, tente novamente.");
					aux = 2;
				}
				
				else if(data.getAno() < 1) {
					System.out.println("Mes digitado invalido, tente novamente.");
					aux = 2;
				}
				
				else 
				data.imprimirData();
					
			}
		
			else if(aux == 1) {
				System.out.printf("Digite a hora :");
				horario.setHora(in.nextInt());
				
				System.out.printf("Digite os minuto :");
				horario.setMinuto(in.nextInt());
				
				System.out.printf("Digite os segundos :");
				horario.setSegundo(in.nextInt());
				
				horario.imprimirHorario();
			}
		
			else {
				System.out.println("Numero digitado invalido, tente novamente.");
			}
			
		} while(aux > 1 || aux < 0);

		in.close();
	}

}
