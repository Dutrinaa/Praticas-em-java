package b2_exercicios_04;

import java.util.Date;

public abstract class Produto {
	protected String nome;
	protected int preco;
	protected Date dataDeCriacao = new Date();
	protected Date dataDaUltimaAlteracao = new Date();

	public Produto(String nome, int preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.setDataDaUltimaAlteracao();
		this.nome = nome;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.setDataDaUltimaAlteracao();
		this.preco = preco;
	}

	public Date getDataDeCriacao() {
		return dataDeCriacao;
	}

	public Date getDataDaUltimaAlteracao() {
		return dataDaUltimaAlteracao;
	}

	public void setDataDaUltimaAlteracao() {
		this.dataDaUltimaAlteracao = new Date();
	}

}
