package b2_prova_pratica_01;

public abstract class Pessoa {
	private String Nome;
	private int Dia;
	private int Mes;
	private int Ano;
	
	public Pessoa(String nome, int dia, int mes, int ano) {
		super();
		Nome = nome;
		Dia = dia;
		Mes = mes;
		Ano = ano;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getDia() {
		return Dia;
	}

	public void setDia(int dia) {
		Dia = dia;
	}

	public int getMes() {
		return Mes;
	}

	public void setMes(int mes) {
		Mes = mes;
	}

	public int getAno() {
		return Ano;
	}

	public void setAno(int ano) {
		Ano = ano;
	}
	
	
}
