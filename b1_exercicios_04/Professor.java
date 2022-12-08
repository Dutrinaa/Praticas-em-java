package b1_exercicios_04;

public class Professor {
	private String nome;
	private Double salario;
	
	public Professor(String n) {
		nome = n;
	}
	
	private double calculaAumento(double aumento) {
		return this.salario * (aumento / 100) + this.salario;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public void imprimir(double aumento) {
		System.out.println("O professor " + this.nome + " recebia R$" + this.salario + "\n"
		+ "antes do aumento salarial, apos o aumento ele passou a receber R$" + calculaAumento(aumento));
	}
	
	
}
