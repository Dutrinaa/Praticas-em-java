package b2_prova_teorica_01;

import java.util.Random;

public class Aluno_tecnico extends Aluno {
	private String registro;

	Random gerarNum = new Random();

	public void praticar() {
		System.out.println("o aluno escreveu " + gerarNum.nextInt(100) + " linhas de código");

	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registroProfissional) {
		this.registro = registroProfissional;
	}

	@Override
	public String toString() {
		return "Técnico [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", matricula=" + matricula + ", curso="
				+ materia + ", registroProfissional=" + registro + "]";
	}
}
