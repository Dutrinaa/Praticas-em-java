package b2_exercicios_05;

public abstract class FiguraGeometrica {
	public FiguraGeometrica(String nome) {
		this.nome = nome;
	}

	private String nome; 
	
	public void desenhar() {
		System.out.println("O nome da figura geometrica eh " + this.nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
