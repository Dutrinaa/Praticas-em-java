package b2_exercicios_04;

public class Cd extends Produto {
	private int numeroFaixas;
	private String gravadora;

	public Cd(String nome, int preco, int numeroFaixas, String gravadora) {
		super(nome, preco);
		this.numeroFaixas = numeroFaixas;
		this.gravadora = gravadora;
	}

	public int getNumeroFaixas() {
		return numeroFaixas;
	}

	public void setNumeroFaixas(int numeroFaixas) {
		this.setDataDaUltimaAlteracao();
		this.numeroFaixas = numeroFaixas;
	}

	public String getGravadora() {
		return gravadora;
	}

	public void setGravadora(String gravadora) {
		this.setDataDaUltimaAlteracao();
		this.gravadora = gravadora;
	}

	@Override
	public String toString() {
		return "Cd [numeroFaixas=" + numeroFaixas + ", gravadora=" + gravadora + ", nome=" + nome + ", preco=" + preco
				+ ", dataDeCriacao=" + dataDeCriacao + ", dataDaUltimaAlteracao=" + dataDaUltimaAlteracao + "]";
	}
}
