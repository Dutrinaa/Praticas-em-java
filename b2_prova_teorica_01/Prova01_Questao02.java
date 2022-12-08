package b2_prova_teorica_01;

public class Prova01_Questao02 {
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		Professor p1 = new Professor();
		Aluno_bolsa b1 = new Aluno_bolsa();
		Convidado c1 = new Convidado();
		Aluno_tecnico t5 = new Aluno_tecnico();
		
		//Aluno
		a1.setNome("Dutra");
		a1.setIdade(16);
		a1.setSexo("Masc");
		a1.setMateria("RDC");
		a1.setMatricula(1);
		//Aluno
		
		//Professor
		p1.setNome("Maffort");
		p1.setSpec("Java");
		p1.setIdade(24);
		p1.setSalario(999999);
		p1.setSexo("Masc");
		//Professor
		
		//Aluno_tecnico
		b1.setNome("Joao");
		b1.setIdade(16);
		b1.setSexo("Masc");
		b1.setMatricula(2);
		b1.setMateria("RDC");
		b1.setBolsa(50);
		//Aluno_tecnico
		
		//Convidado
		c1.setNome("Maria");
		c1.setIdade(16);
		c1.setSexo("Fem");
		//Convidado
		
		// Tecnico
		t5.setNome("Adalberto");
		t5.setIdade(16);
		t5.setSexo("Masc");
		t5.setMatricula(3);
		t5.setMateria("RDC");
		t5.setRegistro("Técnico em redes de computadores");
		// Tecnico
		
	}
	
}
