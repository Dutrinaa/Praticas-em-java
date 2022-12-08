package b1_exercicios_04;

public class Funcionario {
	private int codigo;
	private int numHoras;
	private int numDep;
	private int salarioBruto;
	private double imposto;
	
	
	public Funcionario(int c, int nh, int nd){
		this.codigo = c;
		this.numHoras = nh;
		this.numDep = nd;
	}
	
	private int calculaSalarioBrt(int numHoras, int numDep) {
		salarioBruto = this.numHoras * 12 + this.numDep * 40;
		return salarioBruto;
	}
	
	private double calculaImposto(int salarioBruto) {
		imposto = salarioBruto * 0.135;
		return imposto;
	}
	
	public void imprimir(int codigo, int numHoras, int numDep) {
		System.out.println("O funcionario de numero " + this.codigo + " recebe R$" + this.calculaSalarioBrt(numHoras, numDep) + " \n e tem que pagar R$" + this.calculaImposto(salarioBruto) + " em impostos");
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getNumHoras() {
		return numHoras;
	}

	public void setNumHoras(int numHoras) {
		this.numHoras = numHoras;
	}

	public int getNumDep() {
		return numDep;
	}

	public void setNumDep(int numDep) {
		this.numDep = numDep;
	}	
}
