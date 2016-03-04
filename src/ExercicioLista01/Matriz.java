package ExercicioLista01;

abstract class Matriz {

	static int linha = 2;
	static int coluna = 2;
	static int t = 2;
	
	static int matriz1[][] = new int[linha][t];
	static int matriz2[][] = new int[t][coluna];
	static int matrizResultado[][] = new int[matriz1.length][matriz2[0].length];
	
}