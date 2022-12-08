package b2_exercicios_05;

public class Ex5_3 {

	public static void main(String[] args) {
		
		Relogio r1 = new Relogio(14,30,25);
		System.out.println(r1.toString());
		r1.acertarHora(10, 25, 40);
		System.out.println(r1.toString());
		
		Relogio r2 = new Relogio(22,0);
		System.out.println(r2.toString());
		r2.acertarHora(16, 30);
		System.out.println(r2.toString());
		
		Relogio r3 = new Relogio(23);
		System.out.println(r3.toString());
		r3.acertarHora(11);
		System.out.println(r3.toString());
		
		

	}

}
