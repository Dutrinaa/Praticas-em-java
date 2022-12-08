package b2_prova_teorica_02;

public class Contato extends Pessoa{
	private int numero;

	public Contato(String nome, String email) {
		super(nome, email);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	

}
