package Arvore;

import java.util.Comparator;

public class ArvoreAVL<A> {//Tornando a classe Genérica - Adicionando "<A>"

	private Comparator<Object> comparator;//criando comparator
	private No<A> raiz = null;

	public ArvoreAVL(Comparator<Object> comparator) {
		this.comparator = comparator;
	}

	public void limpar() {
		raiz = null;
	}

	public boolean isEmpty() {
		return raiz == null;
	}

	public No<A> getRaiz() {
		return raiz;
	}

	private int getAltura(No<A> t) {//a classe foi mudada de private static para apenas private, pois static não aceita o generic
		return t == null ? -1 : t.altura;
	}

	private static int max(int lhs, int rhs) {
		return lhs > rhs ? lhs : rhs;
	}

	private int getFator(No<A> t) {
		return getAltura(t.esquerdo) - getAltura(t.direito);
	}

	public boolean inserir(Object x) {//variável x mudada de int para Object
		raiz = inserir(x, raiz);
		return true;
	}

	private No<A> inserir(Object x, No<A> t) {//variável x mudada de int para Object
		if (t == null)
			t = new No<A>(x, null, null);
		else if (comparator.compare(x, t.valor)>0)//SGUNDA CONDIÇÂO - compare usado para comparar os valores informados no chamado do método
			t.esquerdo = inserir(x, t.esquerdo);
		else if (comparator.compare(x, t.valor)<0)//TERCEIRA CONDiÇÂO - compare usado para comparar os valores informados no chamado do método
			t.direito = inserir(x, t.direito);
		t = balancear(t);
		return t;
	}

	public No<A> balancear(No<A> t) {
		if (getFator(t) == 2) {
			if (getFator(t.esquerdo) > 0)
				t = rotacaoADireita(t);
			else
				t = duplaRotacaoADireita(t);
		} else if (getFator(t) == -2) {
			if (getFator(t.direito) < 0)
				t = rotacaoAEsquerda(t);
			else
				t = duplaRotacaoAEsquerda(t);
		}
		t.altura = max(getAltura(t.esquerdo), getAltura(t.direito)) + 1;
		return t;
	}

	private No<A> rotacaoADireita(No<A> k2) {//a classe foi mudada de private static para apenas private, pois static não aceita o generic
		No<A> k1 = k2.esquerdo;
		k2.esquerdo = k1.direito;
		k1.direito = k2;
		k2.altura = max(getAltura(k2.esquerdo), getAltura(k2.direito)) + 1;
		k1.altura = max(getAltura(k1.esquerdo), k2.altura) + 1;
		return k1;
	}

	private No<A> rotacaoAEsquerda(No<A> k1) {//a classe foi mudada de private static para apenas private, pois static não aceita o generic
		No<A> k2 = k1.direito;
		k1.direito = k2.esquerdo;
		k2.esquerdo = k1;
		k1.altura = max(getAltura(k1.esquerdo), getAltura(k1.direito)) + 1;
		k2.altura = max(getAltura(k2.direito), k1.altura) + 1;
		return k2;
	}

	private No<A> duplaRotacaoADireita(No<A> k3) {//a classe foi mudada de private static para apenas private, pois static não aceita o generic
		k3.esquerdo = rotacaoAEsquerda(k3.esquerdo);
		return rotacaoADireita(k3);
	}

	private No<A> duplaRotacaoAEsquerda(No<A> k1) {//a classe foi mudada de private static para apenas private, pois static não aceita o generic
		k1.direito = rotacaoADireita(k1.direito);
		return rotacaoAEsquerda(k1);
	}

	public No<A> buscarValor(int chave) {
		return buscarValor(raiz, chave);
	}

	protected No<A> buscarValor(No<A> p, Object chave) {//variável chave mudada de int para Object
		while (p != null) {
			if (chave == p.valor)
				return p;
			else if (comparator.compare(chave, p.valor) < 0)
				p = p.esquerdo;
			else
				p = p.direito;
		}
		return null;
	}

	public void inOrdem() {
		inOrdem(raiz);
	}

	protected void inOrdem(No<A> p) {
		if (p != null) {
			inOrdem(p.esquerdo);
			System.out.print(p.valor + " - ");
			inOrdem(p.direito);
		}
	}

	public void preOrdem() {
		preOrdem(raiz);
	}

	protected void preOrdem(No<A> p) {
		if (p != null) {
			System.out.print(p.valor + " ");
			preOrdem(p.esquerdo);
			preOrdem(p.direito);
		}
	}

	public void posOrdem() {
		posOrdem(raiz);
	}

	protected void posOrdem(No<A> p) {
		if (p != null) {
			posOrdem(p.esquerdo);
			posOrdem(p.direito);
			System.out.print(p.valor + " ");
		}
	}

	protected No<A> buscaPai(Object chave) {//variável chave mudada de int para Object
		No<A> p = raiz;
		No<A> prev = null;
		while (p != null && !(p.valor == chave)) {
			prev = p;
			if (comparator.compare(p.valor, chave) > 0)
				p = p.direito;
			else
				p = p.esquerdo;
		}
		if (p != null && p.valor == chave)
			return prev;
		return null;
	}

	public void imprimirArvore() {
		if (isEmpty()) {
			System.out.println("Árvore vazia!");
			return;
		}
		String separator = String.valueOf("  |__");
		System.out.println(this.raiz.valor + "(" + raiz.altura + ")");
		imprimirSubArvore(raiz.esquerdo, separator);
		imprimirSubArvore(raiz.direito, separator);
	}

	private void imprimirSubArvore(No<A> node, String separator) {
		if (node != null) {
			No<A> father = this.buscaPai(node.valor);
			if (node.equals(father.esquerdo) == true) {
				System.out.println(separator + node.valor + "(" + node.altura
						+ ")" + " (ESQ)");
			} else {
				System.out.println(separator + node.valor + "(" + node.altura
						+ ")" + " (DIR)");
			}
			imprimirSubArvore(node.esquerdo, "     " + separator);
			imprimirSubArvore(node.direito, "     " + separator);
		}
	}

	private static class No<A> {//A classe static No para a ser genérica podendo assim receber qualquer tipo de valor - Adicionando "<A>"

		protected int altura;
		protected Object valor;//variável valor mudada de int para Object
		protected No<A> esquerdo, direito;

		public No(Object valor, No<A> lt, No<A> rt) {
			this.valor = valor;
			esquerdo = lt;
			direito = rt;
			altura = 0;
		}
	}

	public static void main(String args[]) {
//		ArvoreAVL<Integer> t = new ArvoreAVL<>((o1, o2) -> ((Integer) o1).compareTo((Integer) o2));
//		t.inserir(1);
//		t.inserir(2);
//		t.inserir(3);
//		t.inserir(4);
//		t.inserir(5);
//		t.inserir(6);
//		t.inserir(7);
//		t.inserir(8);
//		t.inserir(9);
//		t.imprimirArvore();
		ArvoreAVL<String> s = new ArvoreAVL<>((o1, o2) -> ((String) o1).compareTo((String) o2));
		s.inserir("F");
		s.inserir("A");
		s.inserir("G");
		s.inserir("Z");
		s.inserir("T");
		s.inserir("S");
		s.inserir("B");
		s.inserir("H");
		s.inserir("D");
		s.inserir("M");
		s.imprimirArvore();
	}
}
