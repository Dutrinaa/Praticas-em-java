package b2_exercicios_03;

public class Ex3_2 {

	public static void main(String[] args) {
		PessoaJuridica p1 = new PessoaJuridica("Felipe", 60000);
		PessoaJuridica p2 = new PessoaJuridica("Mateus", 55000);
		PessoaJuridica p3 = new PessoaJuridica("Pedro", 50000);
		PessoaFisica p4 = new PessoaFisica("Danilo", 25000);
		PessoaFisica p5 = new PessoaFisica("Jean", 1500);
		PessoaFisica p6 = new PessoaFisica("Thigas", 3500);
		
		
		p1.calculaImposto();
		p1.imprimir();
		
		p2.calculaImposto();
		p2.imprimir();
		
		p3.calculaImposto();
		p3.imprimir();
		
		p4.calculaImposto();
		p4.imprimir();
		
		p5.calculaImposto();
		p5.imprimir();
		
		p6.calculaImposto();
		p6.imprimir();
		
		
		

	}

}
