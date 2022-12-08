package b2_prova_teorica_01;

public class Aluno extends Pessoa {
	protected int matricula;
	protected String materia;

	public void pagar() {
		System.out.println("Mensalidade de " + this.nome + " paga com sucesso!");
		this.matricula = 0;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String curso) {
		this.materia = curso;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", matricula=" + matricula + ", curso="
				+ materia + "]";
	}

}
