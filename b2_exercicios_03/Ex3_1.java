package b2_exercicios_03;

public class Ex3_1 {

	public static void main(String[] args) {
		ContaBancaria cB = new ContaBancaria("Felipe", 01);
		ContaPoupanca cP = new ContaPoupanca("Felipe", 02, 0.1);
		ContaEspecial cE = new ContaEspecial("Felipe", 03, 500);
		
		System.out.println("--Conta Bancaria.--");
		cB.sacar();
		cB.depositar();
		cB.sacar();
		cB.imprimirDados();
		
		System.out.println("\n--Conta Poupanca.--");
		cP.sacar();
		cP.depositar();
		cP.calcularNovoSaldo();
		cP.sacar();
		cP.imprimirDados();

		System.out.println("\n--Conta Especial.--");
		cE.sacar();
		cE.depositar();
		cE.sacar();
		cE.imprimirDados();
	
	}
}
