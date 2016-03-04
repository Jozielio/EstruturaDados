package ExercicioLista01;

public class ProdutoMatriz {

	private int matrizResultado[][];
	
	int[][] MultiplicarMatriz(int matriz1[][], int matriz2[][]){
	
		//verificar
		if(matriz1[0].length != matriz2.length){
			System.out.println("MULTIPLICAÇÃO DE MATRIZES NÃO PODE SER EFETUADA \nNúmero de LINHAS Diferente do número de COLUNAS");
			return null;
		}
		
		matrizResultado = new int[matriz1.length][matriz2[0].length];
		
		for(int i = 0; i < matrizResultado.length;i++){
			for(int j = 0; j < matrizResultado[i].length;j++){
				for(int k = 0; k < matriz1[0].length; k++){
					matrizResultado[i][j] += (matriz1[i][k] * matriz2[k][j]);
				}
			}
		}
		
		return matrizResultado;
	}
}