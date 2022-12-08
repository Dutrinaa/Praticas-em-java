package b2_exercicios_04;

public class Main {

	public static void main(String[] args) {
		Livro livro = new Livro("Romeu e Julieta", 24, "William Shakespeare", "Penguin Companhia");
		Cd cd = new Cd("Banda Djavú e DJ Juninho Portugal Vol.01 2009", 100, 17, "Oque pensa que eu so!");
		Dvd dvd = new Dvd("20 filmes em 1", 10, 30);

		System.out.println(livro.toString());
		System.out.println(cd.toString());
		System.out.println(dvd.toString());

		livro.setEditora("Melhoramentos");
		System.out.println(livro.toString());

	}

}
