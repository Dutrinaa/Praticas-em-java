package b2_exercicios_01;

public class Hora {
	private int hora;
	private int minuto;
	private int segundo;
	
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMinuto() {
		return minuto;
	}
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
	public int getSegundo() {
		return segundo;
	}
	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
	
	public void imprimirHorario() {
		System.out.println("A horario marcado eh exatamente " + this.hora + " horas " + this.minuto + " minutos e " + this.segundo + " segundos.");
	}
	
}
