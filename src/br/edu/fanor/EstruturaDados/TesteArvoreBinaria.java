package br.edu.fanor.EstruturaDados;

import static org.junit.Assert.*;

import org.junit.Test;

import Arvore.Aluno;
import Arvore.ArvoreBinaria;

public class TesteArvoreBinaria {

	@Test
	public void testAdd() {

		Aluno a1 = new Aluno("N1", "Marcus");
		Aluno a2 = new Aluno("N1", "Didi");
		Aluno a3 = new Aluno("N1", "Thiago");
		Aluno a4 = new Aluno("N1", "Morgana");

		ArvoreBinaria<Aluno> arvore = new ArvoreBinaria<Aluno>(
				(v1, v2) -> ((Aluno) v1).getNome().compareTo(((Aluno) v2).getNome()));

		arvore.add(a1);
		arvore.add(a2);
		arvore.add(a3);
		arvore.add(a4);

		assertEquals(3, arvore.getAltura());
	}
}