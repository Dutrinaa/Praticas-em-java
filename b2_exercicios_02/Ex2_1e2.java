package b2_exercicios_02;

public class Ex2_1e2 {
	public static void main(String[] args) {
		
		Pais usa = new Pais("USA","Estados Unidos", 9834000.0);
		Pais can = new Pais("CAN","Canada", 9985000.0); 
		Pais mex = new Pais("MEX","Mexico", 1973000.0);
		
		usa.getFronteiras().add(can);
		usa.getFronteiras().add(mex);
		mex.getFronteiras().add(usa);
		can.getFronteiras().add(usa);
		
		System.out.println("--------TESTES EXERCICIO 1--------");
		
		System.out.println("\nDefinindo a populacao dos paises.");
		usa.setPopulacao(328200000);
		can.setPopulacao(37590000);
		mex.setPopulacao(127600000);
		
		System.out.println("\nVerificacao de ISO entre Estados Unidos e Mexico.");
		usa.VerificaISO(mex);
		
		System.out.println("\nVerificacao de ISO entre Estados Unidos e Estados Unidos.");
		usa.VerificaISO(usa);
		
		System.out.println("\nVerificacao de fronteira entre Estados Unidos e Mexico.");
		usa.FazFronteira(mex);
		
		System.out.println("\nVerificacao de fronteira entre Canada e Mexico.");
		can.FazFronteira(mex);
		
		System.out.println("\nVerificacao da densidade populacional dos Estados Unidos.");
		usa.DensidadePop();
		
		System.out.println("\nVerificacao da densidade populacional do Canada.");
		can.DensidadePop();
		
		System.out.println("\nVerificacao dos paises vizinhos entre Canada e Mexico.");
		can.Vizinhos(mex);
		
		System.out.println("\nVerificacao dos paises vizinhos entre Estados Unidos e Canada.");
		usa.Vizinhos(can);
		
		//Testes relacionados ao exercicio 2
		
		System.out.println("\n--------TESTES EXERCICIO 2--------");
		
		Continente AmericaNorte = new Continente("America do Norte"); 
		
		System.out.println("\nAdicionando paises ao continente " + AmericaNorte.getNome() + ".");
		AmericaNorte.getPaises().add(usa);
		AmericaNorte.getPaises().add(can);
		AmericaNorte.getPaises().add(mex);
		
		System.out.println("\nDimensao total do continente " + AmericaNorte.getNome() + ".");
		AmericaNorte.DimensaoTotal();	
		
		System.out.println("\nPopulacao total do continente " + AmericaNorte.getNome() + ".");
		AmericaNorte.PopTotal();
		
		System.out.println("\nDensidade populacional total do continente " + AmericaNorte.getNome() + ".");
		AmericaNorte.DensidadeTotal();
		
		System.out.println("\nPais com maior populacao do continente " + AmericaNorte.getNome() + ".");
		AmericaNorte.MaiorPop();
		
		System.out.println("\nPais com menor populacao do continente " + AmericaNorte.getNome() + ".");
		AmericaNorte.MenorPop();
		
		System.out.println("\nPais com maior dimensao do continente " + AmericaNorte.getNome() + ".");
		AmericaNorte.MaiorDimensao();
		
		System.out.println("\nPais com menor dimensao do continente " + AmericaNorte.getNome() + ".");
		AmericaNorte.MenorDimensao();
		
		System.out.println("\nA razao territorial entre o pais com maior e menos dimensao\n da " + AmericaNorte.getNome() + " eh " + AmericaNorte.RazaoTerritorial() + ".");
	}
}






















