package ExercicioLista01;

abstract class Matriz {

	static int linha = 2;
	static int coluna = 2;
	static int t = 2;
	
	static int matriz1[][] = new int[linha][t];
	static int matriz2[][] = new int[t][coluna];
	static int matrizResultado[][] = new int[matriz1.length][matriz2[0].length];
	
}
//
////TODO pesquisar outras formas
////for(int i = 0; i < matrizResultado.length;i++){
//int linha = 0;
//	for(int j = 0; j < matrizResultado[linha].length;j++){
//		for(int k = 0; k < matriz1[0].length; k++){
//			matrizResultado[linha][j] += (matriz1[linha][k] * matriz2[k][j]);
//		}
//		linha++;
//	}
////}
//
