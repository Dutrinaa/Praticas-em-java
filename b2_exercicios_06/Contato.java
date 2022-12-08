package b2_exercicios_06;

public class Contato {
	private String nome;
	private String tipo;
	private String dados;
	
	public Contato(String nome, String dados) {
		this.nome = nome;
		this.dados = dados;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDados() {
		return dados;
	}
	public void setDados(String dados) {
		this.dados = dados;
	}
}
