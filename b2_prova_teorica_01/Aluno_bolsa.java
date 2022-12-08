package b2_prova_teorica_01;

public class Aluno_bolsa extends Aluno {
	private double bolsa;

	public void renovar() {
		System.out.println("Bolsa de " + this.nome + " renovada com sucesso");
	}

	@Override
	public void pagar() {
		System.out.println(this.nome + " é bolsista e recebe um desconto de " + this.bolsa);
	}

	public double getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}

	@Override
	public String toString() {
		return "Bolsista [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", matricula=" + matricula
				+ ", curso=" + materia + ", bolsa=" + bolsa + "]";
	}

}
