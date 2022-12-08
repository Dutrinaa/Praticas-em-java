package b1_prova_pratica_01;

public class Fatura {
	private int valorTotal;
	private Item item1,item2,item3,item4;
	
	public Fatura(Item kekw1,Item kekw2,Item kekw3,Item kekw4) {
	item1 = kekw1;
	item2 = kekw2;
	item3 = kekw3;
	item4 = kekw4;
	}
	
	public void gerarFatura() {
		System.out.println("---------Produto---------Quantidade--Preco--");
		System.out.println("Cooler para processador------"+ item1.getQtdItem() + "-------R$" + item1.getQtdItem() * 40 + ",00");
		System.out.println("Mouse Gamer sem fio----------"+ item2.getQtdItem() + "-------R$" + item2.getQtdItem() * 70 + ",00");
		System.out.println("Teclado / mouse fio----------"+ item3.getQtdItem() + "-------R$" + item3.getQtdItem() * 125 + ",00");
		System.out.println("Monitor LED 24---------------"+ item4.getQtdItem() + "-------R$" + item4.getQtdItem() * 692 + ",00");
		valorTotal = item1.getQtdItem() * 40 + item2.getQtdItem() * 70 + item3.getQtdItem() * 125 + item4.getQtdItem() * 692;
		System.out.println("Valor total das compras--------------R$" + valorTotal + ",00");
	}
}