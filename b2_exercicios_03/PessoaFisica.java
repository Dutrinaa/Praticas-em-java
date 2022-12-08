package b2_exercicios_03;

public class PessoaFisica extends PessoaJuridica {
	String nome;
	private double rendaBruta;
	double rendaLiquida;
	private double imposto;

	public PessoaFisica(String nome, double rendaBruta) {
		super(nome, rendaBruta);
	}

	@Override
	public double calculaImposto() {
		if (this.rendaBruta <= 1903.98)
			this.imposto = this.rendaBruta / 1;

		else if (this.rendaBruta <= 2826.65)
			this.imposto = this.rendaBruta / 0.075;

		else if (this.rendaBruta <= 3751.05)
			this.imposto = this.rendaBruta / 0.15;

		else if (this.rendaBruta <= 4664.68)
			this.imposto = this.rendaBruta / 0.225;

		else
			this.imposto = this.rendaBruta / 0.275;

		this.rendaLiquida = this.rendaBruta - this.imposto;

		return imposto;
	}
}