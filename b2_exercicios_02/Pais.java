package b2_exercicios_02;
import java.util.ArrayList;

public class Pais {
	private String ISO;
	private String nome;
	private int populacao;
	private double dimensao;
	private double densidade;
	private ArrayList<Pais> fronteiras = new ArrayList<Pais>();
	
	public Pais(String iso, String nome, double dimensao) {
		ISO = iso;
		this.nome = nome;
		this.dimensao = dimensao;
	}
	
	public ArrayList<Pais> getFronteiras() {
		return fronteiras;
	}

	public void VerificaISO(Pais p1) {
		if(p1.ISO == this.ISO) 
			System.out.println("O primeiro e o segundo pais sao os mesmos.");
		
		else 
			System.out.println("O primeiro e o segundo pais nao sao os mesmos.");
	}
	
	public boolean FazFronteira(Pais pteste) {
		if(this.getFronteiras().contains(pteste)) {
			System.out.println("O pais " + this.getNome() + " faz fronteira com o pais " + pteste.getNome() + ".");
			return true;
		}
		else {
			System.out.println("O pais " + this.getNome() + " nao faz fronteira com o pais " + pteste.getNome() + ".");
			return false;
		}
	}
	
	public double DensidadePop() {
		this.densidade = this.getPopulacao() / this.getDimensao();
		System.out.println("A densidade populacional do pais " + this.nome + " eh " + this.densidade);
		return this.densidade;
	}
	
	public void Vizinhos(Pais p2) {
		System.out.println("Os paises vizinhos comuns entre " + this.getNome() + " e " + p2.getNome() + " sao : ");
		
		for(int i = 0; i < this.getFronteiras().size(); i++) {
			for(int j = 0; j < p2.getFronteiras().size(); j++) {
				if(this.getFronteiras().get(i).getISO() == p2.getFronteiras().get(j).getISO())
					System.out.println(this.getFronteiras().get(i).getNome());
			}
		}
	}

	public String getISO() {
		return ISO;
	}

	public void setISO(String iSO) {
		ISO = iSO;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPopulacao() {
		return populacao;
	}

	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}

	public double getDimensao() {
		return dimensao;
	}

	public void setDimensao(double dimensao) {
		this.dimensao = dimensao;
	}
}