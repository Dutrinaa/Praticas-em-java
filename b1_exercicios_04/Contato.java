package b1_exercicios_04;

public class Contato {
	private String nome;
	private String telefone;
	
	public Contato(String n) {
		nome = n;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void imprimir() {
		System.out.println("O contato " + this.nome + " tem o numero de telefone : " + this.telefone + ".");
	}
}
