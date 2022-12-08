package b2_exercicios_05;

public class Ex5_1 {

	public static void main(String[] args) {
		//FiguraGeometrica f = new FiguraGeometrica();
		// f.desenhar();
		 FiguraGeometrica c = new Circulo("Circulo");
		 c.desenhar();
		 FiguraGeometrica q = new Quadrado("Quadrado");
		 q.desenhar();
		 FiguraGeometrica t = new Triangulo("Triangulo");
		 t.desenhar();
		 FiguraGeometrica te = new TrianguloEquilatero("Triangulo");
		 te.desenhar();


	}

}
