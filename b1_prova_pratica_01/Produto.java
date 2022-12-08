package b1_prova_pratica_01;

public class Produto {
	private String nome;
	private int preco;
	
	public Produto(String n, int p) {
		nome = n;
		preco = p;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}
}