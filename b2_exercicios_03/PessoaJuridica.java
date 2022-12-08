package b2_exercicios_03;

public class PessoaJuridica {
	private String nome;
	private double rendaBruta;
	private double rendaLiquida;
	private double imposto;
	
	public PessoaJuridica(String nome, double rendaBruta) {
		this.nome = nome;
		this.rendaBruta = rendaBruta;
	}
	
	public double calculaImposto() {
		this.imposto = this.rendaBruta / 10;
		this.rendaLiquida = this.rendaBruta - this.imposto;
		
		return imposto;
	}
	
	public void imprimir() {
		System.out.println("\nA renda bruta do " + this.nome + " eh de R$" + this.rendaBruta + ".");
		System.out.println("O imposto de 10% ira retirar R$" + this.imposto + " da renda bruta.");
		System.out.println("A renda liquida do " + this.nome + " eh de R$" + this.rendaLiquida + ".");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getRendaBruta() {
		return rendaBruta;
	}

	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}

	public double getRendaLiquida() {
		return rendaLiquida;
	}

	public void setRendaLiquida(double rendaLiquida) {
		this.rendaLiquida = rendaLiquida;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	
	
	

}
