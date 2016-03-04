package CT;
//package CT;
//
//import ExercicioLista01.Matriz;
//
//public class Teste extends Matriz{
//
//	private int matrizResultado[][];
//	
//	int[][] MultiplicarMatriz(int matriz1[][], int matriz2[][]){
//			
//	//verificar
//	if(matriz1[0].length != matriz2.length){
//		System.out.println("MULTIPLICAÇÃO DE MATRIZES NÃO PODE SER EFETUADA \nNúmero de LINHAS Diferente do número de COLUNAS");
//		return null;
//	}
//		
//	matrizResultado = new int[matriz1.length][matriz2[0].length];
//
//	//TODO pesquisar outras formas
//	//for(int i = 0; i < matrizResultado.length;i++){
//
//	System.out.println("MR.length: " + matrizResultado.length);
//	System.out.println("MR[0].length: " + matrizResultado[0].length);
//
//	int linha = 0;
//
//	for(int j = 0; j >= linha;j++){
//		for(int k = 0; k < matrizResultado[0].length; k++){
//			System.out.println("J: " + j + " K: " + k);
//			matrizResultado[linha][j] += matriz1[linha][k] * matriz2[k][j];
//			System.out.println("matriz1[" + linha + "][" + k + "]: " + matriz1[linha][k]);
//			System.out.println("matriz2[" + k + "][" + j + "]: " + matriz2[k][j]);
//			System.out.println("MR[" + linha + "][" + j + "]: " + matrizResultado[linha][j]);
//
//		}
//		if(j == matrizResultado.length - 1){
//			linha++;
//		}
//	}
//		return matrizResultado;
//
//	}	
//}