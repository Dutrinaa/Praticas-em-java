package b2_prova_pratica_01;

public class Eleitor extends Pessoa{
	private int Titulo;
	private int Secao;
	String Zona;
	
	public Eleitor(String nome, int dia, int mes, int ano) {
		super(nome, dia, mes, ano);
	}

	public int getTitulo() {
		return Titulo;
	}

	public void setTitulo(int titulo) {
		Titulo = titulo;
	}

	public int getSecao() {
		return Secao;
	}

	public void setSecao(int secao) {
		Secao = secao;
	}

	public String getZona() {
		return Zona;
	}

	public void setZona(String zona) {
		Zona = zona;
	}
	
	
}
