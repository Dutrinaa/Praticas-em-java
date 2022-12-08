package Testes;

public class Aluno {
	private String nome;
	 private String matricula;
	 private String situacao;

	 public Aluno(String m) {//Construtuor
	 matricula = m;
	 }

	 public void setNome(String nome){
	 this.nome = nome;
	 }

	 public void matricular(){
	 situacao = "Matriculado";
	 }

	 public void cancelarMatricula(){
	 situacao = "Nao matriculado";
	 }

	 public String getNome(){
	 return nome;
	 }
	 public String getMatricula(){
	 return matricula;
	 }

	 public String getSituacao(){
	 return situacao;
	 }

	 public void imprimir(){
	 System.out.println("** Dados do Aluno ***");
	 System.out.println("Nome: " + this.getNome());
	 System.out.println("Matricula: " + matricula);
	 System.out.println("Situação: " + this.getSituacao());
	 }


}
