package br.edu.fanor.EstruturaDados;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Listas.Lista;
import Listas.ListaDE;

public class TesteLista {

	@Test
	public void testAdd() {
		Lista<Integer> lista = new ListaDE<Integer>();
		lista.add(5);
		lista.add(10);
		assertEquals(2,  lista.size());
	}
		
	public void testAddComPosicao() {
		Lista<Integer> lista = new ListaDE<Integer>();
		lista.add(0, 5);
		lista.add(1, 10);
		assertEquals(2,  lista.size());
	}

}