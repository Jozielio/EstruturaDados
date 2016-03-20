package Listas;

public interface Lista<E> {

	void add(E e);
	
	void add(int i, E e);
	
	Object remove(E e);
	
	Object remove(int i);
	
	boolean isEmpty();
	
	int size();
	
	Object get(int i);
	
}
