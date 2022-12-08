package b3_exercicios_02;

public class PorHora extends Empregado{
	private double valorHora;
	private int numeroHoras;

	public PorHora(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	public void setNumeroHoras(int numeroHoras) {
		this.numeroHoras = numeroHoras;
	}

	@Override
	protected double getPagamento() {
		// TODO Auto-generated method stub
		return valorHora * numeroHoras;
	}
}
