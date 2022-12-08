package b2_exercicios_04;

public class Livro extends Produto {
	private String autor;
	private String editora;

	public Livro(String nome, int preco, String autor, String editora) {
		super(nome, preco);
		this.autor = autor;
		this.editora = editora;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.setDataDaUltimaAlteracao();
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.setDataDaUltimaAlteracao();
		this.editora = editora;
	}

	@Override
	public String toString() {
		return "Livro [autor=" + autor + ", editora=" + editora + ", nome=" + nome + ", preco=" + preco
				+ ", dataDeCriacao=" + dataDeCriacao + ", dataDaUltimaAlteracao=" + dataDaUltimaAlteracao + "]";
	}

}
