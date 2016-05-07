package FilaPilha;

import Listas.Lista;
import Listas.ListaDE;

public class Stack {

	private Lista<Integer> stack = new ListaDE<Integer>();

	public void push(Integer valor) {
		stack.add(new Integer(valor));
	}

	public Integer pop() {
		return (Integer) stack.remove(stack.size() - 1);
	}
}
