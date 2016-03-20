package Listas;

public class ListaDE<E> implements Lista<E>{

	private No primeiro;
	private No ultimo;
	private int tamanho;
	@Override
	
	public void add(E e) {
		No novo = new No(e);
		if(isEmpty()){
			primeiro = novo;
			ultimo = novo;
		}else{	
			novo.anterior = ultimo;
			ultimo.proximo = novo;
			ultimo = novo;
		}		
		tamanho++;
	}

	@Override
	public void add(int i, E e) {
		validaIndice(i);
		No novo = new No(e);
		
		if(i == 0){
			if(isEmpty()){
				primeiro = novo;
				ultimo = novo;
			}
			else{
				novo.proximo = primeiro;				
				primeiro.anterior = novo;
				primeiro = novo;
			}
		}
		
		else if(size() == i){
			
			novo.anterior = ultimo;
			ultimo.proximo = novo;
			ultimo = novo;
					
		}
		else{
			No pt = getNo(i);
			
			pt.anterior.proximo = novo;
			novo.anterior = pt.anterior;
			novo.proximo = pt;
			pt.anterior = novo;
		}
		
		tamanho++;
	}

	@Override
	public Object remove(E e) {
		
		return null;
	}

	@Override
	public Object remove(int i) {
		
		return null;
	}

	@Override
	public boolean isEmpty() {
		return this.primeiro == null;
	}

	@Override
	public int size(){
		return this.tamanho;
	}

	public No getNo(int i){
		No pt = primeiro;
		for(int j = 0; j < i;j++){
			pt = pt.proximo;
		}
		return pt;
	}

	@Override
	public Object get(int i) {
		No pt = primeiro;

		for(int j = 0; j < i;j++){
			pt = pt.proximo;
		}
		return pt;
	}

	public void validaIndice(int i){
		if(i < 0 || i >= this.tamanho){
			throw new ArrayIndexOutOfBoundsException("Valor não pode ser inserido no Indice: " + i + "nao pode ser inserido");
		}
	}
	
	private static class No{

		private Object valor;
		private No anterior;
		private No proximo;
		
		public No(Object valor){
			this.valor = valor;
		}
	}

}