package b2_exercicios_04;

public class Dvd extends Produto {
	private int duracao;

	public Dvd(String nome, int preco, int duracao) {
		super(nome, preco);
		this.duracao = duracao;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.setDataDaUltimaAlteracao();
		this.duracao = duracao;
	}

	@Override
	public String toString() {
		return "Dvd [duracao=" + duracao + ", nome=" + nome + ", preco=" + preco + ", dataDeCriacao=" + dataDeCriacao
				+ ", dataDaUltimaAlteracao=" + dataDaUltimaAlteracao + "]";
	}

}
