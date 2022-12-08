package b2_prova_pratica_01;

public class Vereador extends Pessoa{
	private String Email;
	private int Codigo;
	private int votos = 0;
	
	public Vereador(String nome, int dia, int mes, int ano) {
		super(nome, dia, mes, ano);
		// TODO Auto-generated constructor stub
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getCodigo() {
		return Codigo;
	}

	public void setCodigo(int codigo) {
		Codigo = codigo;
	}

	public int getVotos() {
		return votos;
	}

	public void setVotos(int votos) {
		this.votos = votos;
	}
	
}
