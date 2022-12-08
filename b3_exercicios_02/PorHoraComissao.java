package b3_exercicios_02;

public class PorHoraComissao extends PorHora implements Comissao{
	private double valorVendas;
	
	public PorHoraComissao(String nome) {
		super(nome);
	}
	
	@Override
	protected double getPagamento() {
		// TODO Auto-generated method stub
		return valorVendas;
	}

	@Override
	public void setValorVendas(double valorVendas) {
		// TODO Auto-generated method stub
		
	}
	
}
