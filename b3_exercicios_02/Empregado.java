package b3_exercicios_02;

public abstract class Empregado {
	protected String nome;
	protected double pagamento;

	public Empregado(String nome) {
		this.nome = nome;
	}
	
	
	private void imprimirPagamento() {
		
	}
	
	protected abstract double getPagamento();
}
