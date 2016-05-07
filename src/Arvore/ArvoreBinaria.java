package Arvore;

import java.util.Comparator;

public class ArvoreBinaria<T> {

	private No<T> raiz;
	private Comparator<Object> comparator;

	public ArvoreBinaria(Comparator<Object> comparator) {
		this.comparator = comparator;
	}

	public int getAltura() {
		return this.getAlturaNo(raiz);
	}

	public int getAlturaNo(No<T> no) {
		if (no == null) {
			return 0;
		} else {
			int alturaEsquerda = this.getAlturaNo(no.noEsquerdo);
			int alturaDireita = this.getAlturaNo(no.noDireito);
			if (alturaEsquerda > alturaDireita) {
				return alturaEsquerda + 1;
			} else {
				return alturaDireita + 1;
			}
		}
	}

	public void add(Object valor) {
		if (isEmpty()) {
			this.raiz = new No<>(valor);
		} else {
			this.addRecursivo(raiz, valor);
		}
	}

	private void addRecursivo(No<T> no, Object valor) {
		if (comparator.compare(valor, no.valor) > 0) {
			if (no.noDireito == null) {
				no.noDireito = new No<>(valor);
			} else {
				this.addRecursivo(no.noDireito, valor);
			}
		} else if (comparator.compare(valor, no.valor) < 0) {
			if (no.noEsquerdo == null) {
				no.noEsquerdo = new No<>(valor);
			} else {
				this.addRecursivo(no.noEsquerdo, valor);
			}
		}
	}

	public boolean isEmpty() {
		return raiz == null;
	}

	private static class No<T> {

		private Object valor;
		private No<T> noEsquerdo;
		private No<T> noDireito;

		public No(Object valor) {
			this.valor = valor;
		}
	}
}