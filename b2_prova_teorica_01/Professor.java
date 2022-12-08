package b2_prova_teorica_01;

public class Professor extends Pessoa {
	private String spec;
	private double salario;

	public void aumento(double aumento) {
		this.salario += aumento;
	}

	public String getSpec() {
		return spec;
	}

	public void setSpec(String Spec) {
		this.spec = Spec;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Professor [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", especialidade=" + spec
				+ ", salario=" + salario + "]";
	}

}
