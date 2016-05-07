package FilaPilha;

import Listas.Lista;
import Listas.ListaDE;

public class Fila {

	private Lista<Integer> queue = new ListaDE<Integer>();

	public void push(Integer valor) {
		queue.add(new Integer(valor));
	}

	public Integer pop() {
		return (Integer) queue.remove(0);
	}
}
