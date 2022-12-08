package b1_exercicios_04;

public class Ponto {
	private int x;
	private int y;
	
	public Ponto(int kekx, int keky) {
		x = kekx;
		y = keky;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getX(){
		 return x;
	}
	public int getY(){
		 return y;
	}
	
	public void imprimir() {
		System.out.println("Cordenadas do ponto :");
		System.out.println("X = " + x);
		System.out.println("Y = " + y);
	}
}
