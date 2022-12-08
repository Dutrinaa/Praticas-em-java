package b2_exercicios_02;

import java.util.ArrayList;

public class Continente {
	private String nome;
	private double dimensaoTotal;
	private int popTotal;
	private double densidadeTotal;
	private double maiorDimensao;
	private double menorDimensao;
	private ArrayList<Pais> paises = new ArrayList<Pais>();
	
	public Continente(String nome) {
		this.nome = nome;
	}
	
	public void AdicionarPais(Pais p1) {
		this.getPaises().add(p1);
		System.out.println("O pais " + p1.getNome() + " foi adicionado ao continente " + this.nome + ".");
	}
	
	public void DimensaoTotal() {
		for(int i = 0; i < this.getPaises().size(); i++) {
			this.dimensaoTotal += this.getPaises().get(i).getDimensao();
		}
		
		System.out.println("A dimensao total do continente " + this.nome + " eh " + this.dimensaoTotal + ".");
	}
	
	public void PopTotal() {
		for(int i = 0; i < this.getPaises().size(); i++) {
			this.popTotal += this.getPaises().get(i).getPopulacao();
		}
		
		System.out.println("A populacao total do continente " + this.nome + " eh " + this.popTotal + ".");
	}
	
	public void DensidadeTotal() {
		this.densidadeTotal = this.popTotal / this.dimensaoTotal;
		
		System.out.println("A densidade populacional total do continente " + this.nome + " eh " + this.densidadeTotal + ".");
	}
	
	public Pais MaiorPop() {
		int aux = 0;
		
		for(int i = 0; i < this.getPaises().size(); i++) {	
			if(this.getPaises().get(i).getPopulacao() > aux) 
				aux = i;
		}
		
		System.out.println("O pais com maior populacao eh o " + this.getPaises().get(aux).getNome() + " tendo " + this.getPaises().get(aux).getPopulacao() + " habitantes.");
		
		return this.getPaises().get(aux);
	}
	
	public Pais MenorPop() {
		int aux = Integer.MAX_VALUE;
		
		for(int i = 0; i < this.getPaises().size(); i++) {	
			if(this.getPaises().get(i).getPopulacao() < aux) 
				aux = i;
		}
		
		System.out.println("O pais com menor populacao eh o " + this.getPaises().get(aux).getNome() + " tendo " + this.getPaises().get(aux).getPopulacao() + " habitantes.");
		
		return this.getPaises().get(aux);
	}
	
	public Pais MaiorDimensao() {
		int aux = 0;
		
		for(int i = 0; i < this.getPaises().size(); i++) {	
			if(this.getPaises().get(i).getDimensao() > aux) 
				aux = i;
		}
		
		System.out.println("O pais com maior dimensao eh o " + this.getPaises().get(aux).getNome() + " tendo " + this.getPaises().get(aux).getDimensao() + " kilometros quadrados de area.");
		maiorDimensao = this.getPaises().get(aux).getDimensao();
		
		return this.getPaises().get(aux);
	}
	
	public Pais MenorDimensao() {
		int aux = Integer.MAX_VALUE;
		
		for(int i = 0; i < this.getPaises().size(); i++) {	
			if(this.getPaises().get(i).getDimensao() < aux) 
				aux = i;
		}
		
		System.out.println("O pais com menor dimensao eh o " + this.getPaises().get(aux).getNome() + " tendo " + this.getPaises().get(aux).getDimensao() + " kilometros quadrados de area.");
		menorDimensao = this.getPaises().get(aux).getDimensao();
		
		return this.getPaises().get(aux);
	}
	
	public double RazaoTerritorial() {
		return this.maiorDimensao / this.menorDimensao;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Pais> getPaises() {
		return paises;
	}
}
