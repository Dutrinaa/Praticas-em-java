package b3_exercicios_02;

public class PorComissao extends Empregado implements Comissao{
	private double valorVendas;
	
	public PorComissao(String nome) {
		super(nome);
	}

	@Override
	protected double getPagamento() {
		// TODO Auto-generated method stub
		return valorVendas;
	}

	@Override
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas * Comissao.PERCENTUAL_COMISSAO;
		
	}
	

}
