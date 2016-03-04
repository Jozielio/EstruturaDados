package ExercicioLista01;

public class Imprimir {

	void ImprimirMatriz(int matriz[][], int linha, int coluna){

		for(int i = 0; i < matriz.length; i++){
			for(int j = 0; j < matriz[i].length;j++){
				System.out.print(matriz[i][j] + " ");
			}
			System.out.print("\n");
		}				
		System.out.print("\n");
	}
}