package b4_prova_pratica_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Fila<T> {
	private ItemFila<T> primeiro;
	private ItemFila<T> ultimo;
	private int tamanho;

	public Object ultimo() {
		return this.ultimo.getConteudo();
	}

	public void inserir(T valor) {
		ItemFila novoItem = new ItemFila();
		novoItem.setConteudo(valor);
		if (this.vazia()) {
			primeiro = novoItem;
			ultimo = novoItem;
		} else {
			ultimo.setProximo(novoItem);
			ultimo = novoItem;
		}
		this.tamanho++;
	}

	public T remover() throws FilaVaziaException {
		if (!this.vazia()) {
			T valor = primeiro.getConteudo();
			primeiro = primeiro.getProximo();
			this.tamanho--;

			return valor;
		} else {
			throw new FilaVaziaException();
		}
	}

	public boolean vazia() {
		return this.primeiro == null;
	}

	public void limpar() {
		this.primeiro = null;
	}

	public int getTamanho() {
		return this.tamanho;
	}
}
